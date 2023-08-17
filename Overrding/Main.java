package Overrding;

public class Main {
    public static void main (String[] args){
       
       //Creating an object in the Car class so the move method is the one from the car class its overriding the vehicle method
       
        Vehicle c = new Car();
        c.move();
        
        
        Vehicle v = new Vehicle();
        v.move(); 
    }
}
