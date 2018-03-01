/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkingproject;

/**
 *
 * @author danis
 */
public class Dueño {
     int alcoholLevel;
    String genreK;

    boolean ebrio() {
        if (alcoholLevel > 3) {
            return true;
        }
        return false;
    }

    String genre() {
        return genreK;
    }
    
}
