package typecasting;

class father{
    int age=55;
    void display(){
        System.out.println("age "+age);
    }
}
class secson extends father{
    int secsonAge=21;
    void display(){
        System.out.println("age "+secsonAge);
    }
}
class secdaughter extends father{
    int secdauage=20;
    void display(){
        System.out.println("age"+secdauage);
    }
}
public class Upcasting {
    public static void main(String[] args) {
        father f=new secson();
        f.display();
        father f1=new secdaughter();
        f1.display();   
    }
}
