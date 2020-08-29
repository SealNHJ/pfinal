package com.uabc.edu.pfinal.demo.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long id;
    private String name;
    //private String email;
    /**/
    private String cantidad;
    private String precio;
    private String fecha;
    private String marca;
    /**/

    public User()
    {}

    public User(String name, String cantidad, String precio, String fecha, String marca)
    {
        this.name = name;
        //this.email = email;
        this.cantidad = cantidad;
        this.precio = precio;
        this.fecha = fecha;
        this.marca = marca;
    }
}
