package inheritance;

class father{
    void display(){
        System.out.println("new bike");
    }
}
class son extends father{
    void display(){
        System.out.println("old bike");
    }
}
class mother extends son{
    void display(){
        System.out.println("hii son");
    }
}
class duaghter extends mother{
    void display(){
        System.out.println("Hello mom");
    }
}

public class multilevel {
    public static void main(String[] args) {
        duaghter sc=new duaghter();
        sc.display();
    }
}
