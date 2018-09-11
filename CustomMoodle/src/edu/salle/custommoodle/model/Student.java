/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.salle.custommoodle.model;

import java.util.Objects;

/**
 *
 * @author luisd
 */
public class Student{
    private String name;
    private String lastName;
    private String id;
    private String estado;
    private String fecha;
    private String sexo;
    
    public Student(){
        
    }

    public Student(String id, String name, String lastName, String estado, String fecha, String sexo) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.estado = estado;
        this.fecha = fecha;
        this.sexo = sexo;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
        public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    @Override
    public String toString()
    {
        return String.format("id= %s,\nname= %s,\nlastName= %s", id, name, lastName);
    }
    
        //retorna 1 si la cadena 1 es mayor que la 2
        // 0 las cadenas son iguales
        // -1 si la cadena 1 es menor 

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
