/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training.weather;

import org.junit.Test;
import static org.junit.Assert.*;


public class CityTest {
    
    City Madrid = new City("Madrid");
    

    @Test
    public void nameTest(){
        assertEquals("Madrid",Madrid.getName());
    }
}
