/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.validators;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 *
 * @author Franklin
 */
@FacesValidator (value = "EdadValidator")
public class EdadValidator implements Validator{

    @Override
    public void validate(FacesContext context, UIComponent component, Object value) 
            throws ValidatorException {
//        String texto = (String) value;
        int edad = Integer.parseInt(String.valueOf(value));
        
        if (edad < 18) {
            FacesMessage msg =new FacesMessage(FacesMessage.SEVERITY_ERROR, "Edad no permitida", "La edad debe ser mayor a 18");
            throw new ValidatorException(msg);
        }   
    
    }
    
}
