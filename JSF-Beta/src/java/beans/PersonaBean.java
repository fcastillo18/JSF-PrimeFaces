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
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;

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
    
    // 1-tener acceso a todas la variables manejadas en JSF, 2- desde donde
    //se va a invocar la accion o llamado a este metodo
    //3- el valor que trae este evento
    public void validar(FacesContext context, 
                        UIComponent toValidate, Object value){
        context = FacesContext.getCurrentInstance();
        String texto = (String) value;
    }
}
