package com.api.ec.RestfulAPI.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.sql.Date;

//LOMBOK

//defino getters y setters
@Data
//defino constructor
@AllArgsConstructor
//defino constructor vacio
@NoArgsConstructor
@ToString
//defino entidad
@Entity
//hago referencia a DB
@Table(name = "clients")
public class Client implements Serializable {  //Serializable -> listo la clase
//hago referencia a data
    @Id
    @Column(name = "id")
    //id autoincrement
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idClient;
    @Column(name = "name")
    private String nameClient;
    @Column(name = "last_name")
    private String last_nameClient;
    @Column(name = "email")
    private String emailClient;
    @Column(name = "creation")
    private Date creationDateClient;
}
