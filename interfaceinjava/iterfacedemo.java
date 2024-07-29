package interfaceinjava;

interface ratha{
    void display1();
}
interface raj{
    void display2();
}
class ram implements ratha,raj{
    public void display1(){      
    }
    public void display2(){
        System.out.println("my name is rajesh");
    }
}

public class iterfacedemo {
    public static void main(String[] args) {
        ram r=new ram();
        r.display1();
        r.display2();
    }    
}
