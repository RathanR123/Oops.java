package oops;

public class nonstatic2 {
    String brand="Nexon";
    void start(){
        System.out.println("car started");
    }
    public static void main(String[] args) {
        nonstatic2 sc=new nonstatic2();
        System.out.println("brand is " +sc.brand);
        sc.start();
    }
}
