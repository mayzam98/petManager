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
public class clsVeterinary extends AbsHospital{
    private String name;
    private String phone;
    private String address;
    private clsDoctor Doctor;

    public clsVeterinary(String name, String phone, String address, clsDoctor Doctor) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.Doctor = Doctor;
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
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the Doctor
     */
    public clsDoctor getDoctor() {
        return Doctor;
    }

    /**
     * @param Doctor the Doctor to set
     */
    public void setDoctor(clsDoctor Doctor) {
        this.Doctor = Doctor;
    }
    
    public String petCare(clsPet pet){
        System.out.println("Atendiendo a la mascota "+pet.getName());
        return pet.getHealthStatus();
    }

    @Override
    public String getPatientType() {
        return "Animal";
    }

    @Override
    public String Surgery() {
        return "Surgery animal data";
    }
    
    
    
}
