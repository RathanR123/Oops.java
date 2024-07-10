package oops;

public class constructoroverloading {
    
    constructoroverloading (String name){
        System.out.println(name);
    }
    constructoroverloading(double sallery){
        System.out.println(sallery);
    }
    constructoroverloading(String name,int age){
        System.out.print(name);
        System.out.println(age);
    }
    constructoroverloading(double sallery,String age){
        System.out.print( sallery);
        System.out.println(age);
    }
    public static void main(String[] args) {
        constructoroverloading sc=new constructoroverloading(40000.00);
        new constructoroverloading("rathan");
        new constructoroverloading("rajesh", 21);
        new constructoroverloading(25000.00, " ankitha");
    }
}
