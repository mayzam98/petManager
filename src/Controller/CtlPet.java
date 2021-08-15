/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import clases.*;
import Model.ModelDog;
import Model.ModelCat;

/**
 *
 * @author mayko
 */
public class CtlPet {
    
    private ModelDog modelDog;
    private ModelCat modelCat;
    public CtlPet() {
              
        this.modelDog = new ModelDog();
        this.modelCat = new ModelCat();
    }
    
    public boolean CreatePet(clsPet pet){
        try{
       switch(pet.getAnimalType()){
           case "Gato":
               
               
               break;
           case "Perro":
               this.modelDog.CreatePet((clsDog)pet);
               break;
              }
       return true;
       }catch(Exception e){
           return false;
       }
    }
    
    public boolean EditPet(clsPet pet){
        try{
       switch(pet.getAnimalType()){
           case "Gato":
               
               break;
           case "Perro":
               this.modelDog.EditPet((clsDog)pet);
               break;
              }
       return true;
       }catch(Exception e){
           return false;
       }
    }
    
    public boolean DeletePet(clsPet pet){
        try{
       switch(pet.getAnimalType()){
           case "Gato":
               
               break;
           case "Perro":
               this.modelDog.DeletePet((clsDog)pet);
               break;
              }
       return true;
       }catch(Exception e){
           return false;
       }
    }
    
    
    public clsPet SearchPet(String code, String type){
        clsPet pet = null;
        try{
       switch(type){
           case "Gato":
               
               break;
           case "Perro":
               pet = this.modelDog.SearchPet(code);
               break;
              }
       return pet;
       }catch(Exception e){
           return null;
       }
    }
    
    
}
