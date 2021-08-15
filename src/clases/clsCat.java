/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author mayko
 */
public class clsCat extends clsPet  {
    private String Breed;

    public clsCat(String Breed, String code, String name, int bornYear, String color, String healthStatus) {
        super(code, name, bornYear, color, healthStatus);
        this.Breed = Breed;
    }
    
    
    
    public void selfCleaning(){
        System.out.println("El gatoc"+super.getName()+" se esta limpiando");
    }  

    /**
     * @return the Breed
     */
    public String getBreed() {
        return Breed;
    }

    /**
     * @param Breed the Breed to set
     */
    public void setBreed(String Breed) {
        this.Breed = Breed;
    }
    
    @Override
   
    public int getNumberOfBones(){
        return 230;
    }
    
    @Override
    public String getAnimalType(){
        return "Gato";
    }
 
}
