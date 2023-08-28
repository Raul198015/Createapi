package com.Api1.apiControllers;

import com.Api1.domain.models.Cita;
import com.Api1.domain.service.CitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/citas")
public class CitaController {
    private final CitaService citaService;

    @Autowired
    public CitaController(CitaService citaService) {
        this.citaService = citaService;
    }

    @GetMapping
    public List<Cita> getCitaController() {
        return citaService.getCitas();
    }

    @PostMapping
    public void createCitas(@RequestBody Cita cita) {
        citaService.newCita(cita);

    }

    @PutMapping("/{id}")
    public void updateCita(@PathVariable Integer id, @RequestBody Cita cita) {
        citaService.update(id, cita);

    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id, Cita cita) {
        citaService.deleteCita(id, cita);
    }
}