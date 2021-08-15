/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import Interfaces.*;

/**
 *
 * @author mayko
 */
public class clsPet implements IAnimal, IVertebrate{
    private String code;
    private String name;
    private int bornYear;
    private String color;
    private String healthStatus;
    private clsVeterinary Veterinary;   

    public clsPet(String code, String name, int bornYear, String color, String healthStatus) {
        this.code = code;
        this.name = name;
        this.bornYear = bornYear;
        this.color = color;
        this.healthStatus = healthStatus;
    }

    
    
    public void Eat(){
        System.out.println("La mascota " + this.name + " esta comiendo");
    }
    
    public void Move(){
        System.out.println("La mascota " + this.name + " esta moviendose");
    }
    
    public void Sound(){
        System.out.println("La mascota " + this.name + " esta realizando un sonido");
    } 

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the bornYear
     */
    public int getBornYear() {
        return bornYear;
    }

    /**
     * @param bornYear the bornYear to set
     */
    public void setBornYear(int bornYear) {
        this.bornYear = bornYear;
    }

   

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the healthStatus
     */
    public String getHealthStatus() {
        return healthStatus;
    }

    /**
     * @param healthStatus the healthStatus to set
     */
    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }

    /**
     * @return the Veterinary
     */
    public clsVeterinary getVeterinary() {
        return Veterinary;
    }

    /**
     * @param Veterinary the Veterinary to set
     */
    public void setVeterinary(clsVeterinary Veterinary) {
        this.Veterinary = Veterinary;
    }

    @Override
    public String getAnimalType() {
        return "domestico";
    }

    @Override
    public int getNumberOfBones() {
    return 0;
    }
    
    
    
}
