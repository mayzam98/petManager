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
public class clsDog extends clsPet {
    private String Breed;
    private boolean  pedigree;

    public clsDog(String Breed, boolean pedigree, String code, String name, int bornYear, String color, String healthStatus) {
        super(code, name, bornYear, color, healthStatus);
        this.Breed = Breed;
        this.pedigree = pedigree;
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

    /**
     * @return the pedigree
     */
    public boolean isPedigree() {
        return pedigree;
    }

    /**
     * @param pedigree the pedigree to set
     */
    public void setPedigree(boolean pedigree) {
        this.pedigree = pedigree;
    }
    
    
    public void walkAronud(){
    System.out.println("El perro "+ super.getName()+ " esta caminando.");
    }
    
    public void walkAronud(int km){
        System.out.println("El perro "+ super.getName()+ " esta caminando "+km+" km.");
    }
    
    public void walkAronud(boolean dogLeash){
    String hasLeash = dogLeash ? "con correa":"sin correa";    
    System.out.println("El perro "+ super.getName()+ " esta caminando "+hasLeash);
    }
    
    
    
}
