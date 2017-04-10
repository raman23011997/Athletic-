/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign2;

import java.time.LocalDate;
import java.time.Month;
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
public class PersonTest {
    Person raman = new Person("Raman", "jagdev", "shOrtraces", 180, 65, 78, 9.2,20.6,180.6, LocalDate.of(1996, 3, 3));
       
    public PersonTest() {
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
     * Test of getName method, of class Person.
     */
    
    @Test
    public void testInvalidPerson() {
        try
        {
             Person invalidraman = new Person("Raman", "jagdev", "longjump", 180, 65, 78, 9.2,20.6,180.6, LocalDate.of(1996, 3, 3));
            fail("the invalid field should have thrown an exception");
        }
        catch (IllegalArgumentException e)
        {
            System.out.printf("Constructor with an invalid interested field threw the exception \"%s\"", e.getMessage());
        }
    }
    @Test
    public void testInvalidheartrate() {
        try
        {
             Person invalidraman = new Person("Raman", "jagdev", "longjump", 180, 65, 120, 9.2,20.6,180.6, LocalDate.of(1996, 3, 3));
            fail("the invalid postal code should have thrown an exception");
        }
        catch (IllegalArgumentException e)
        {
            System.out.printf("Constructor with an higher heartrate threw the exception \"%s\"", e.getMessage());
        }
    }
    @Test
    public void testGetName() {
         String expResult = "Raman";
        String result = raman.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     
    }

    /**
     * Test of getFatherName method, of class Person.
     */
    @Test
    public void testGetFatherName() {
        
        String expResult = "jagdev";
        String result = raman.getFatherName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of getInterestedField method, of class Person.
     */
    @Test
    public void testGetInterestedField() {
        
       
        String expResult = "shOrtraces";
        String result = raman.getInterestedField();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getHeight method, of class Person.
     */
    @Test
    public void testGetHeight() {
        
        double expResult = 180.0;
        double result = raman.getHeight();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getWeight method, of class Person.
     */
    @Test
    public void testGetWeight() {
        System.out.println("getWeight");
       
        double expResult = 65;
        double result = raman.getWeight();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of getHeartrate method, of class Person.
     */
    @Test
    public void testGetHeartrate() {
       
        double expResult = 78;
        double result = raman.getHeartrate();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getBesttime100m method, of class Person.
     */
    @Test
    public void testGetBesttime100m() {
        
        double expResult = 9.2;
        double result = raman.getBesttime100m();
        assertEquals(expResult, result, 0.0);
           }

    /**
     * Test of getBesttime200m method, of class Person.
     */
    @Test
    public void testGetBesttime200m() {
        
        double expResult = 20.6;
        double result = raman.getBesttime200m();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getBesttime5km method, of class Person.
     */
    @Test
    public void testGetBesttime5km() {
        
        double expResult = 180.6;
        double result = raman.getBesttime5km();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getDateofbirth method, of class Person.
     */
    @Test
    public void testGetDateofbirth() {
       
        
        LocalDate expResult = LocalDate.of(1996, 3, 3);
        LocalDate result = raman.getDateofbirth();
        assertEquals(expResult, result);
        
    }
    

    /**
     * Test of toString method, of class Person.
     */
    @Test
    public void testToString() {
       
        String expResult = "Raman s/d of jagdev who's best timing is 9.2, 20.6, 180.6";
        String result = raman.toString();
        assertEquals(expResult, result);
        
    }
    @Test
    public void testage() {        
        LocalDate age1 = LocalDate.of(1980, Month.MARCH, 1);
        try{
            raman.setage(age1);
           
        }
        catch(IllegalArgumentException e){
         System.out.printf("Test set age over 30 exception = \"%s\"%n", e.getMessage());}
    }
    @Test
    public void testageat1998() {        
        LocalDate age1 = LocalDate.of(1998, Month.MARCH, 6);
        try{
            raman.setage(age1);
           
        }
        catch(IllegalArgumentException e){
         System.out.printf("Test set age exception = \"%s\"%n", e.getMessage());}
    }
    @Test
    public void testageat2015() {        
        LocalDate age1 = LocalDate.of(2015, Month.MARCH, 3);
        try{
            raman.setage(age1);
           
        }
        catch(IllegalArgumentException e){
         System.out.printf("Test set birthday under 18 exception = \"%s\"%n", e.getMessage());}
    }
    @Test
    public void testweightat98kg(){
        double weight=98;
        try
        {
            raman.setweightinkg(weight);
            
        }
        catch(IllegalArgumentException e){
         System.out.printf("Test over weight exception = \"%s\"%n", e.getMessage());}
            
        }
    @Test
    public void testweightat42kg(){
        double weight=42;
        try
        {
            raman.setweightinkg(weight);
            
        }
        catch(IllegalArgumentException e){
         System.out.printf("Test under weight exception exception = \"%s\"%n", e.getMessage());}
            
        }
    
    @Test
    public void testsetheightcmunderheight(){
        double height=60;
        try
        {
            raman.setheightincm(height);
            
        }
        catch(IllegalArgumentException e){
        
       System.out.printf("Test under height  exception = \"%s\"%n", e.getMessage());  
        }
            
        }
    @Test
    public void testsetheightcmperfectheight(){
        double height=180;
        try
        {
            raman.setheightincm(height);
            
        }
        catch(IllegalArgumentException e){
         System.out.printf("Test perfect height = \"%s\"%n", e.getMessage());}
            
        }
    @Test
    public void testmethodforshortfield(){
       String field="shortraces";
        try
        {
            raman.methodforfield(field);
            
        }
        catch(IllegalArgumentException e){}
            
        }
    @Test
     public void testmethodforlongfield(){
       String field="longraces";
        try
        {
            raman.methodforfield(field);
            
        }
        catch(IllegalArgumentException e){
         System.out.printf("nO exception = \"%s\"%n", e.getMessage());}
            
        }
     @Test
     public void testinvalidmethodforfield(){
       String field="nointerest";
        try
        {
            raman.methodforfield(field);
            
        }
        catch(IllegalArgumentException e){
         System.out.printf("EITHER ENTER shortraces or longraces exception = \"%s\"%n", e.getMessage());}
            
        }
     @Test
     public void testoverbeatspermin(){
       int heartrate=90;
        try
        {
            raman.beatspermin(heartrate);
            
        }
        catch(IllegalArgumentException e){
         System.out.printf("heartrate over 80 exception = \"%s\"%n", e.getMessage());}
            
        }
     @Test
     public void testlessbeatspermin(){
       int heartrate=40;
        try
        {
            raman.beatspermin(heartrate);
            
        }
        catch(IllegalArgumentException e){
         System.out.printf("heartrate under 72 exception = \"%s\"%n", e.getMessage());}
            
        }
    @Test
     public void testexactbeatspermin(){
       int heartrate=75;
        try
        {
            raman.beatspermin(heartrate);
            
        }
        catch(IllegalArgumentException e){
         System.out.printf("No exception = \"%s\"%n", e.getMessage());}
            
        }
     @Test
     public void testvalidbesttimefor100m(){
      double timefor100m =9.32;
      double timefor200m = 30.69;
      double timefor5km=19350;
        try
        {
            raman.besttimeinsec(timefor100m, timefor200m, timefor5km);
            
        }
        catch(IllegalArgumentException e){
         System.out.printf("100m timing over 11.32 exception = \"%s\"%n", e.getMessage());}
            
        }
      @Test
     public void testvalidbesttimefor5km(){
      double timefor100m =15.32;
      double timefor200m = 30.69;
      double timefor5km=1000;
        try
        {
            raman.besttimeinsec(timefor100m, timefor200m, timefor5km);
            
        }
        catch(IllegalArgumentException e){
         System.out.printf("5 km time over 1800sec  exception = \"%s\"%n", e.getMessage());
        }
            
        }
      @Test
     public void testvalidbesttimefor200m(){
      double timefor100m =15.32;
      double timefor200m = 19.69;
      double timefor5km=19350;
        try
        {
            raman.besttimeinsec(timefor100m, timefor200m, timefor5km);
            
        }
        catch(IllegalArgumentException e){
         System.out.printf("200m timing over 22 sec exception = \"%s\"%n", e.getMessage());}
            
        }
    }

