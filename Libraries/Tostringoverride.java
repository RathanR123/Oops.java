package Libraries;

class Person{
    int age=21;
    String name="ram";
    public String toString(){
        return age+"\n"+name;
    }
}
public class Tostringoverride {
    public static void main(String[] args) {
        Person p=new Person();
        System.out.println(p.toString());//explictely used tostring 
        System.out.println(p);//
    }
}
