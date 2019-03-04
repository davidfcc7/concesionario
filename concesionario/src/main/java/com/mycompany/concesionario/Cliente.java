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
public class Cliente {
    private List<Persona> personas;
    
    public Cliente(){
        personas = new ArrayList();
    }

    /**
     * @return the personas
     */
    public List<Persona> getPersonas() {
        return personas;
    }

    /**
     * @param personas the personas to set
     */
    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }
    
}
