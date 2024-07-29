package interfaceinjava;

interface Abc {

    void method1();
}
interface Def{
    void method2();
}

class Efg implements Abc,Def{
    public void method1(){

    }
    public void method2(){
        System.out.println("rathan is an employee");
    }

}

public class InterfacesExample {
    public static void main(String[] args) {
        Efg d = new Efg();
        d.method1();
        d.method2();
    }
    
}
