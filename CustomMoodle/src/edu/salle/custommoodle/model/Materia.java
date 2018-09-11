/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.salle.custommoodle.model;

/**
 *
 * @author luisd
 */
public class Materia {
    
    private String nombre;
    private String docente;
    
        public Materia(String nombre, String docente) {
        this.nombre = nombre;
        this.docente = docente;
    }
    
    public Materia()
    {
        
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocente() {
        return docente;
    }

    public void setDocente(String docente) {
        this.docente = docente;
    }
    
}
