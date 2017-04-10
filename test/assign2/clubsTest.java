/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign2;

import java.time.LocalDate;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Shanty
 */
public class clubsTest {
     clubs valid = new clubs();
   Person athlete = new Person("Raman", "jagdev", "shOrtraces", 180, 65, 78, 9.2,20.6,180.6, LocalDate.of(1996, 3, 3));
    Person invalidraman = new Person("Raman", "jagdev", "longjump", 180, 65, 78, 9.2,20.6,180.6, LocalDate.of(1996, 3, 3));
   public clubsTest() {
   
    
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getClubforshortraces method, of class clubs.
     */
    @Test
    public void testGetClubforshortraces() {
         valid.getClubforshortraces();
        ArrayList<Person> expResult = new ArrayList<>();
        ArrayList<Person> result = valid.getClubforshortraces();
        assertEquals(expResult, result);
    }

    /**
     * Test of getClubforlongrace method, of class clubs.
     */
    @Test
    public void testGetClubforlongrace() {
         valid.getClubforlongrace();
        ArrayList<Person> expResult = new ArrayList<>();
        ArrayList<Person> result = valid.getClubforlongrace();
        assertEquals(expResult, result);
    }
        
    

    /**
     * Test of addathleteforshortraces method, of class clubs.
     */
    @Test
    public void testAddathleteforshortraces() {
     
        valid.addathleteforlongraces(athlete);
        ArrayList<Person> expResult = new ArrayList<>();
        expResult.add(athlete);
        assertEquals(valid.getClubforlongrace(), expResult);
    }

    /**
     * Test of addathleteforlongraces method, of class clubs.
     */
    @Test
    public void testAddathleteforlongraces() {
        valid.addathleteforshortraces(athlete);
        ArrayList<Person> expResult = new ArrayList<>();
        expResult.add(athlete);
        assertEquals(valid.getClubforshortraces(), expResult);
    }
    
}
