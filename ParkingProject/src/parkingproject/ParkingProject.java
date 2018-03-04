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
public class ParkingProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String greeting;
        Celador miCelador=new Celador();
        Dueño Dueño1 = new Dueño();
        Dueño Dueño2 = new Dueño();
        Dueño Dueño3 = new Dueño();
        Dueño Dueño4 = new Dueño();
        
        Dueño1.alcoholLevel=0;
        Dueño1.genreK="Mujer";
        greeting=miCelador.greeting("Mujer");
        System.out.println(greeting);
        
      
        Dueño1.alcoholLevel=2;
        Dueño1.genreK="Mujer";
        greeting=miCelador.greeting("Mujer");
        System.out.println(greeting);
        greeting=miCelador.greeting(true);
        System.out.println(greeting);
        
        Dueño2.alcoholLevel=0;
        Dueño2.genreK="Hombre";
        greeting=miCelador.greeting("Hombre");
        System.out.println(greeting);
        
        Dueño3.alcoholLevel=2;
        Dueño3.genreK="Hombre";
        greeting=miCelador.greeting("Hombre");
        System.out.println(greeting);
        greeting=miCelador.greeting(true);
        System.out.println(greeting);
        
      
    
        // TODO code application logic here
    }
    
}
