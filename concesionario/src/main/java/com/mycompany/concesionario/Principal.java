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
public class Principal {
    
    List<Persona> personas;
    List<Vehiculo> vehiculos;
    
    public Principal (){
        
        personas = new ArrayList();
        Persona cliente1 = new Persona(1,"David");
        Persona cliente2 = new Persona(2,"ivan");
        Persona cliente3 = new Persona(3,"Andres");
        Persona cliente4 = new Persona(4,"Felipe");
        Persona cliente5 = new Persona(5,"Fernando");
        Persona asesor1 = new Persona(1,"Laura");
        
        vehiculos = new ArrayList(); 
        Vehiculo deportivo = new Vehiculo(1,"McLaren");
        deportivo.getPersonas().add(cliente1);
        deportivo.getPersonas().add(cliente2);
        deportivo.getPersonas().add(cliente4);
        
        Vehiculo maquinaria = new Vehiculo(2,"BMW");
        deportivo.getPersonas().add(cliente3);
        deportivo.getPersonas().add(cliente4);
        deportivo.getPersonas().add(cliente1);
        
        Vehiculo personalizado = new Vehiculo(3,"Rolls Royce");
        deportivo.getPersonas().add(cliente2);
        deportivo.getPersonas().add(cliente5);
        deportivo.getPersonas().add(cliente3);
    }
}
