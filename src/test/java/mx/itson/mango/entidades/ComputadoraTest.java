/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package mx.itson.mango.entidades;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author alumnog
 */
public class ComputadoraTest {
    
    public ComputadoraTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of cambiarEspacioDisco method, of class Computadora.
     */
    @Test
    public void testCambiarEspacioDisco() {
        System.out.println("cambiarEspacioDisco");
        int disminucionDisco = 128;
        Computadora pc = new Computadora("Asus","Ninja2000","Blanca", 128, 512);
        String expResult = "Se disminuyo el espacio del disco a 384";
        String result = pc.disminuirEspacio(128);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
