package encapsulation;

abstract class Vehicle{
    abstract void drive();
    void playmusic(){
        System.out.println("vehicle plays music");
    }
    final void owner(){
        System.out.println("owner is rathan");
    }
}
class Car extends Vehicle{
    void drive(){
        System.out.println("car drives"); 
    }
    
    
}

public class AbstractionExample {
    public static void main(String[] args) {
        Car benz = new Car();
        benz.drive();
        benz.playmusic();
        benz.owner();

    }
    
}
