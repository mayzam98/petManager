/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petmanajer;

import clases.clsCat;
import clases.clsDog;

/**
 *
 * @author mayko
 */
public class Interface {
    public static void main(String[] args) {
        
        clsDog dog = new clsDog("criollo",false,"001","Firulais",2011,"Amarillo","Sano");
        clsCat cat = new clsCat("persa","002", "Chacho", 2019, "Yelow", "Enfermo");
        
        System.out.println(dog.getAnimalType());
        System.out.println(cat.getAnimalType());
        
        System.out.println("" + dog.getNumberOfBones());
        System.out.println("" + cat.getNumberOfBones());
        
    }
        
    
}
