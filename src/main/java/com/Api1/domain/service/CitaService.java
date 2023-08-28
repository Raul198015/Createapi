package com.Api1.domain.service;

import com.Api1.domain.models.Cita;
import com.Api1.infra.repositories.CitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class CitaService {
    private final CitaRepository citaRepository;

    public CitaService(CitaRepository citaRepository) {
        this.citaRepository = citaRepository;
    }

    @Autowired

    public List<Cita> getCitas(){
    return citaRepository.findAll();
}

    public void newCita(Cita cita) {
        citaRepository.save(cita);
    }

    public void update(Integer id, Cita cita) {
        Optional<Cita> citabyID = (citaRepository.findById(id));
        if (citabyID.isPresent()){
            Cita citaExisting = citabyID.get();

            citaExisting.setName(cita.getName());
            citaExisting.setHora(cita.getHora());
            citaExisting.setCiudad(cita.getCiudad());
            citaExisting.setDia(cita.getDia());
            citaRepository.save(citaExisting);

        }
    }

    public void deleteCita(Integer id, Cita cita) {
        boolean existe = citaRepository.existsById(id);
        if (existe){
            citaRepository.delete(cita);
        }
    }
}
