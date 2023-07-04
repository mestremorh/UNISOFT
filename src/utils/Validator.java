/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import modelo.Persona;

/**
 *
 * @author Miguel Estremor
 */
public class Validator {
    
   public static boolean isNumeric(String str){
        return str != null && str.matches("[0-9.]+");
}
    public static boolean validaPersona(Persona p){
        return !(p.getNombre().isBlank() || p.getNombre().isBlank() || p.getRol().isBlank());
    }
}
