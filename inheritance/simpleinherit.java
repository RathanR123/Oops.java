package inheritance;

class bike{
    void display(){
        System.out.println("old bike");
    }
}
class car extends bike{
    void display(){
        System.out.println("new bike");
    }
}

public class simpleinherit {
    public static void main(String[] args) {
        car sc=new car();
        sc.display();
    }

}
