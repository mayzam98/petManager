/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petmanajer;

import clases.*;

/**
 *
 * @author mayko
 */
public class AbstractClass {
    public static void main(String[] args) {
        clsDoctor Doctor = new clsDoctor("Jose Camilo", "112541");
        clsVeterinary Veterinary = new clsVeterinary("kira", "3112544845", "poblado", Doctor);
        
        Veterinary.setData(Veterinary.getName()+"----"+Veterinary.getAddress());
        
        String data = Veterinary.getHospitalInformation();
        String type = Veterinary.getPatientType();
        String surgery = Veterinary.Surgery();
        
        System.out.println("Data: " + data);
        System.out.println("Type: " + type);
        System.out.println("Surgery: "+ surgery);
        
        
        
    }
}
