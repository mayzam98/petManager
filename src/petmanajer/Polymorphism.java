/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petmanajer;

import clases.clsCat;
import clases.clsDoctor;
import clases.clsDog;
import clases.clsVeterinary;

/**
 *
 * @author mayko
 */
public class Polymorphism {
    public static void main(String[] args) {
        //instancias de las clases hijas
        clsDog dog = new clsDog("criollo",false,"001","Firulais",2011,"Amarillo","Sano");
        
        clsCat cat = new clsCat("persa","002", "Chacho", 2019, "Yelow", "Enfermo");
        
        //instancia de la veterinaria
        
        clsDoctor Doctor = new clsDoctor("Juana de arco", "11001100");
        clsVeterinary veterinary = new clsVeterinary("Tu vete", "3112089819", "barrio lejos", Doctor);
        
        String careDog = veterinary.petCare(dog);
        System.out.println("El estado de salud de "+dog.getName()+" es "+ careDog);
        
        String careCat = veterinary.petCare(cat);
        System.out.println("El estado de salud de "+cat.getName()+ " es "+ careCat);
        
    }
    
}
