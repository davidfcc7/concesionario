/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.concesionario;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author David
 */
public class Asesor {
    private float comision;
    private List <Persona> personas;
    
    public Asesor(float comision){
        
        this.comision = comision;
        personas = new ArrayList();
    }

    /**
     * @return the comision
     */
    public float getComision() {
        return comision;
    }

    /**
     * @param comision the comision to set
     */
    public void setComision(float comision) {
        this.comision = comision;
    }

    /**
     * @return the personas
     */
    public List <Persona> getPersonas() {
        return personas;
    }

    /**
     * @param personas the personas to set
     */
    public void setPersonas(List <Persona> personas) {
        this.personas = personas;
    }
    
}
