package typecasting;
class father{
    int age=55;
    void display(){
        System.out.println(age);
    }
}
class firstson extends father{
    int fsonage=24;
    void display(){
        System.out.println(fsonage);
    }
}
class firstdaughter extends father{
    int firstdauage=21;
    void display(){
        System.out.println(firstdauage);
    }
}
public class Downcasting {
    public static void main(String[] args) {
        father s=new firstson();
        firstson S=(firstson)s;
        s.display();
        father f=new firstdaughter();
        firstdaughter d=(firstdaughter)f;
        f.display();
    }
}
