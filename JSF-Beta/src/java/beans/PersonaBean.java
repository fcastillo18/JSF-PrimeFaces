/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import clases.Persona;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author fcastillo
 */
@ManagedBean
@RequestScoped
public class PersonaBean {

    /**
     * Creates a new instance of PersonaBean
     */
    
    Persona person = new Persona(); 
    List<Persona> listPersonas = new ArrayList<Persona>();
        
    public PersonaBean() {
    }

    public Persona getPerson() {
        return person;
    }

    public void setPerson(Persona person) {
        this.person = person;
    }

    public List<Persona> getListPersonas() {
        return listPersonas;
    }

    public void setListPersonas(List<Persona> listPersonas) {
        this.listPersonas = listPersonas;
    }
    
    public void agregarPersona(){
    this.listPersonas.add(person);    
    }
    
    public void eliminarPersona(){
    this.listPersonas.remove(person);    
    }
}
