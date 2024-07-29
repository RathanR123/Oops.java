package inheritance;

class father{
    void display(){
        System.out.println("hi");
    }
}
class son extends father{
    void display(){
        super.display();
        System.out.println("hello");
    }
}

public class inherit {
    public static void main(String[] args) {
        son sc=new son();
        sc.display();
    }
    
}
