/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petmanajer;

import clases. *;
import java.util.Date;

/**
 *
 * @author mayko
 */
public class PetManajer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        clsDog dog1 = new clsDog("criollo",false,"001","Firulais",2011,"Amarillo","Sano");
        
        clsCat cat1 = new clsCat("persa","002", "Chacho", 2019, "Yelow", "Enfermo");
        
        //Date es un tipo de dato que ya esta en el jdk
        Date currentDate = new Date();
        int currentYear = currentDate.getYear();
        
        int agePet1 = currentYear - dog1.getBornYear();
        int agePet2 = currentYear - cat1.getBornYear();
        if(agePet1 >agePet2){
            System.out.println("La mascota " +dog1.getName() + " es mayor que la mascota " + cat1.getName());
        }else{
            if(agePet2>agePet2){
                System.out.println("La mascota " + cat1.getName() + " es mayor que la mascota " + dog1.getName());
            }
            else{
                System.out.println("La mascota " + dog1.getName() + " tiene la misma edad de la mascota " + cat1.getName());
            }
        }
        
        dog1.Eat();
        cat1.Eat();
        
        dog1.Move();
        cat1.Sound();
        
        dog1.walkAronud();
        cat1.selfCleaning();
    }
    
}
