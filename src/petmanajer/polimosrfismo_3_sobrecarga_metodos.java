/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petmanajer;

import clases.clsDog;

/**
 *
 * @author mayko
 */
public class polimosrfismo_3_sobrecarga_metodos {
    public static void main(String[] args) {
        clsDog dog = new clsDog("criollo",false,"1001","cacho",2018,"candelo","sano");
        
        dog.walkAronud();
        dog.walkAronud(true);
        dog.walkAronud(2);
    }
}
