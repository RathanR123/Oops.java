package oops;

public class methodoverloading2 {
    void display(String name){
        System.out.println("nameof a person is  "+name);
    }
    void display(int age){
        System.out.println("age of a person is " +age);
    }
    void display(String name,int age){
        System.out.println("nameof a person is  "+name+ " and age is " +age);

    }
    void display(int age,String name){
        System.out.println(" age is " +age+" and name of a person is  "+name);

    }

    public static void main(String[] args) {
        methodoverloading2 sc=new methodoverloading2();
        sc.display("rathan", 23);
        sc.display("rajesh");
        sc.display(20);
        sc.display(25, "vidyadhara");
    }
}
