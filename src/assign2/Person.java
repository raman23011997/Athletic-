/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign2;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Shanty
 */
public class Person {/**
 * instance variable that are of string ,double and localdate
 */
    private String name,fatherName,InterestedField;
    private double height,weight,heartrate,besttime100m,besttime200m,besttime5km;
    private LocalDate dateofbirth;
 /**
  * constructor named as similar to that of class
  * @param name
  * @param fathername
  * @param InterestedField
  * @param height
  * @param weight
  * @param heartrate
  * @param besttime100m
  * @param besttime200m
  * @param besttime5km
  * @param dateofbirth 
  */   
    
    public Person(String name,String fathername,String InterestedField,double height,double weight,double heartrate,double besttime100m,double besttime200m,double besttime5km,LocalDate dateofbirth){
        this.name=name;/**
         * validation of the instance variable to that of user input
         */
        fatherName=fathername;
        setheightincm(height);
        setweightinkg(weight);/**
         * method forwarded for  the validation
         */
        methodforfield(InterestedField);
        beatspermin( heartrate);
        besttimeinsec( besttime100m, besttime200m, besttime5km);
    setage(dateofbirth);
    }/**
     * method validate height if its greater than  160 else throw an error
     * @param height 
     */
        public void setheightincm(double height){
            if(height>160){
                this.height=height;
            }else
                throw new IllegalArgumentException("height should be greater than 160 cm");
            
        }
        /**
         * method validate weight is in between 50-70 else throw an error
         * @param weight 
         */
         public void setweightinkg(double weight){
            if(weight>50 &&  weight<70){
                this.weight=weight;
            }else
                throw new IllegalArgumentException("weigth should be greater than 50kg and 70 kg");
            
        }
         /**
          * method validate method for the field if its longraces or shortrace else throw an error
          * @param interest 
          */
         public void methodforfield(String interest){
             if(interest.equalsIgnoreCase("shortraces") || interest.equalsIgnoreCase("longraces") ){
             InterestedField=interest;
         } else 
                  throw new IllegalArgumentException("interset should be short or long races");
         }/**
          * method validates beats per min to be in between 70-80 else throw an error
          * @param heartrate 
          */
          public void beatspermin(double heartrate){
            if(heartrate>70 &&  heartrate<80){
                this.heartrate=heartrate;
            }else
                throw new IllegalArgumentException("heartrate should be between 70-80");
            
        }/**
         * validates if the best time of 100m 200m 5km are within the requirements
         * @param besttime100m
         * @param besttime200m
         * @param besttime5km 
         */
           public void besttimeinsec(double besttime100m,double besttime200m,double besttime5km){
            if(besttime100m<11.32 || besttime200m<22 || besttime5km<1200){
                this.besttime100m=besttime100m;
                this.besttime200m=besttime200m;
                this.besttime5km=besttime5km;
                
            }else
                throw new IllegalArgumentException("Work hard..to achieve the target time");
            
        
    }
/**
 * all the method that return the value of instance variable
 * @return 
 */
    public String getName() {
        return name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public String getInterestedField() {
        return InterestedField;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeartrate() {
        return heartrate;
    }

    public double getBesttime100m() {
        return besttime100m;
    }

    public double getBesttime200m() {
        return besttime200m;
    }

    public double getBesttime5km() {
        return besttime5km;
    }

    public LocalDate getDateofbirth() {
        return dateofbirth;
    }
           /**
            * set age method that calculate the age and check if its between 18-30
            * @param birthdate
            * @return 
            */
            public int setage(LocalDate birthdate){
             LocalDate now= LocalDate.now();
            int  age1=Period.between( birthdate,now).getYears();
            if(age1>18 && age1<30){
                dateofbirth=birthdate;
            } else 
                throw new IllegalArgumentException("age should be between 18-30 years");
            return age1;
         }
           /**
            * to string method that return the method in the following way
            * @return 
            */
            
            public String toString() {
                return name + " s/d of " + fatherName + " who's best timing is " + this.besttime100m + ", " + this.besttime200m + ", " + this.besttime5km;
            }
}
