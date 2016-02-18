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
    
    private Persona person = new Persona(); 
    private static List<Persona>  listPersonas = new ArrayList<Persona>();
        
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
        PersonaBean.listPersonas = listPersonas;
    }
    
    public void agregarPersona(){
    PersonaBean.listPersonas.add(person);    
    }
    
    public void eliminarPersona(Persona per){
    PersonaBean.listPersonas.remove(per);    
    }
    
    public void modificarPersona(Persona per){
    PersonaBean.listPersonas.remove(per);    
    }
}
