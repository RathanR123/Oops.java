package oops;
class Rathan{
    String name="raj";
    void name(String name){
        System.out.println(name);
        System.out.println(this.name);
    }
}

public class thiskey {
    public static void main(String[] args) {
        Rathan sc=new Rathan();
        sc.name("rathan");
    }
    
}