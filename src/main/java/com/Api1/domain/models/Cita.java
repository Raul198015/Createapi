package com.Api1.domain.models;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@Entity
@Table


public class Cita{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;
private String name;
private String hora;
private String ciudad;
private String dia;

public Cita() {

}

public Cita(Integer id, String name, String hora, String ciudad, String dia) {
        this.id = id;
        this.name = name;
        this.hora = hora;
        this.ciudad = ciudad;
        this.dia = dia;
        }

public Cita(String name, String hora, String ciudad, String dia) {
        this.name = name;
        this.hora = hora;
        this.ciudad = ciudad;
        this.dia = dia;
        }

public Integer getId() {
        return id;
        }

public void setId(Integer id) {
        this.id = id;
        }

public String getName() {
        return name;
        }

public void setName(String name) {
        this.name = name;
        }

public String getHora() {
        return hora;
        }

public void setHora(String hora) {
        this.hora = hora;
        }

public String getCiudad() {
        return ciudad;
        }

public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
        }

public String getDia() {
        return dia;
        }

public void setDia(String dia) {
        this.dia = dia;
        }
        }
