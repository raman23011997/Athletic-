/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign2;

import java.util.ArrayList;

/**
 *
 * @author Ramanjeet
 */
public class clubs {/**
 * arraylist list are instance variable that accept person class
 */
private ArrayList <Person> Clubforshortraces; 
private ArrayList <Person> Clubforlongrace;


 public clubs(){/**
  * initialize the array list
  */
    Clubforshortraces=new ArrayList <>();
    Clubforlongrace=new ArrayList <>();
   
}
/**
 * return alll the members
 * @return 
 */
    public ArrayList<Person> getClubforshortraces() {
        return Clubforshortraces;
    }
/**
 * return alll the members
 * @return 
 */
    public ArrayList<Person> getClubforlongrace() {
        return Clubforlongrace;
    }
/**
 * check if it validates the required values and add it to short races club
 * @param athlete 
 */

public void addathleteforshortraces(Person athlete){
    if(athlete.getBesttime100m() > 11.32 || athlete.getBesttime200m()  < 22) {
        Clubforshortraces.add(athlete);
    }
}
/**
 * check if it validates the required values and add it to long races club
 * @param athlete 
 */
public void addathleteforlongraces(Person athlete){
    if(athlete.getBesttime5km()<1200) {
        Clubforlongrace.add(athlete);
    }
}



}
