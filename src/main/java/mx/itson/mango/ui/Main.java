/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.mango.ui;

import mx.itson.mango.entidades.Computadora;
import mx.itson.mango.entidades.Television;

/**
 *
 * @author alumnog
 */
public class Main {
    
    public static void main(String[] args) {
        
        Television tv = new Television("Samsung","XDWA","Negro", 50, 67);
        Computadora pc = new Computadora("Asus","Ninja2000","Blanca", 128, 512);
        
        System.out.print( tv.encender());
        tv.cambiarVolumen(62);
        
          System.out.print( pc.encender());
           System.out.print(tv.encender());
        
        pc.disminuirEspacio(128);
    }
    
}
