package Overrding;

public class Car extends Vehicle{

    public void move(){
        super.move();
        System.out.println("The car is moving!!!");
    }
    
}
