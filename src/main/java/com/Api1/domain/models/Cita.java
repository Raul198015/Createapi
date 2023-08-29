package com.Api1.domain.models;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@Entity
@Table


public class Cita{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;
private String nombre;
private String hora;
private String ciudad;
private String dia;

public Cita() {

}

public Cita(Integer id, String nombre, String hora, String ciudad, String dia) {
        this.id = id;
        this.nombre = nombre;
        this.hora = hora;
        this.ciudad = ciudad;
        this.dia = dia;
        }

public Cita(String nombre, String hora, String ciudad, String dia) {
        this.nombre = nombre;
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

public String getNombre() {
        return nombre;
        }

public void setNombre(String name) {
        this.nombre = nombre;
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
