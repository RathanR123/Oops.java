package oops;

public class nonparameterized {
    String name;
    int age;
    double sallery;
    public nonparameterized(){
        name="rathan";
        age=21;
        sallery=40000.00;
    }
    public static void main(String[] args) {
        nonparameterized sc=new nonparameterized();
        System.out.println(sc.name);
        System.out.println(sc.age);
        System.out.println(sc.sallery);
    }
}
