package polymorphism;

class emp{
    String name;
    int age;
    double sallery;
    void display(String name){
        System.out.println("name is "+name);
    }
    void display(String name,int age){
        System.out.println("name is "+name + "age is"+age);
    }
    void display(int age,double sallery){
        System.out.println("age is "+age + " sallery is "+sallery);
    }
}


public class Compiletime{
    public static void main(String[] args) {
        emp e=new emp();
        e.display("rathan");
        e.display(21, 40000.0);
        e.display("rajesh", 19);
    }
}