package oops;

public class parameterizedconstructor {
    String name;
    parameterizedconstructor(String name){
       this.name=name;
    }
    public static void main(String[] args) {
        parameterizedconstructor sc=new parameterizedconstructor("rathan");
        System.out.println("name is "+sc.name);
    }
}
