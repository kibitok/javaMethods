# javaMethods

this is a simple example to show the various types of methods in java, calculating BMI and also calulating factorials

## Types of Methods

- void type methods-  it does not return anything
- return type method - it return the value of the given data type
- parse/pass type method - passing or retriving something. it can be void or return type

## void type methods Example
this is a simple example of a void type method
```
public static void addition(){
    System.out.println("welcome to methods");
    }
```

## return type method
this is a simple example of a return type method
```
public static String name(){
        String bett = "bett";
        return bett;
```
## parse/pass type method
this is a simple example of a pass/parse type method
```
public static double sum(double a, double b){
        double c = a+b;
        return c;
```

## calulating factorials
a method to calulate factrorials using recursion
```
static int factorial(int n){    
    if (n == 0)    
        return 1;    
    else    
        return(n * factorial(n-1));    
 }  
```
## calculating BMI 
a simple method to calulate the BMI
```
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
```

