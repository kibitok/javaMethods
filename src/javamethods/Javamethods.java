/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamethods;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author STUDENT
 */
public class Javamethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here\
            /*
            we are looking at three tpes of methods
            1) void type methods-  it does not return anything
            2) return type method - it return the value of the given data type
            3) parse/pass type method - passing or retriving something. it can be void or return type
            */
            Thread.sleep(3000);
        } catch (Exception ex) {
            
        }
        
        boolean isTrue = false;
        if (isTrue)
            return;
        
      System.out.println(sum(11.0,4.5));
      System.out.println(name());
      System.out.println(checkHealth(60.0,1.2,"Bett"));
      System.out.println(condition());
      System.out.println(factorial(10));
      
      
      
     
    }
    public static void addition(){
    System.out.println("welcome to methods");
    }
    public static String name(){
        String bett = "bett";
        return bett;
        
    }
    public static double sum(double a, double b){
        double c = a+b;
        return c;
    }
    public static String checkHealth(double weight, double height, String name){
        double BMI = (weight/(height*height));
        if (BMI< 18)
            return "Hey my name is "+ name + " with a BMI of  "+BMI+" and am underwight";
        
        if (BMI>=18 && BMI<25)
            return "Hey my name is "+ name + " with a BMI of  "+BMI+" and am healthy";
        
        if (BMI> 25)
            return "Hey my name is "+ name +" with a BMI of  "+BMI+" and am overweight";
        
        return null;
    }
    public static String condition(){
        String name= "Bett";
        if (name.matches("kibitok"))
            return "kibitok matches the name";
        else if (name.matches("abraham"))
            return "abraham matches bett";
        else if (name.matches(name))
            return "name matches name";
        return "Nothing was found";
    }
    
    static int factorial(int n){    
    if (n == 0)    
        return 1;    
    else    
        return(n * factorial(n-1));    
 }  
}
