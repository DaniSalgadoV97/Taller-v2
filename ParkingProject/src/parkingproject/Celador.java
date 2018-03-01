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
public class Celador {
    String greeting()
   {
       return "¡¡BIENVENIDO!!";
   }
   
    String greeting(boolean ebrio)
   {
      
       return "¡¡LARGO DE AQUÍ!!";
   }
    
   String greeting(String genreK)
   {
       if(genreK=="Mujer")
       {
           return "Hola bebé, ¿qué más pues?";
       }
       else
       {
           return "Hola doctor";
           
       }
       
   }
}
