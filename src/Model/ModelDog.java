/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import clases.*;

/**
 *
 * @author mayko
 */
public class ModelDog {

    public ModelDog() {
    }
    
    
     public boolean CreatePet(clsDog dog){
        try{
       
       return true;
       }catch(Exception e){
           return false;
       }
    }
    
    public boolean EditPet(clsDog dog){
        try{
       
       return true;
       }catch(Exception e){
           return false;
       }
    }
    
    public boolean DeletePet(clsDog dog){
        try{
       
       return true;
       }catch(Exception e){
           return false;
       }
    }
    
    
    public clsPet SearchPet(String code){
        clsDog dog = null;
        try{
       
       return dog;
       }catch(Exception e){
           return dog;
       }
    }
    
    
}
