package typecasting;

class father{
    void display(){
        System.out.println("old man");
    }

}
class son extends father{
    int sonage=25;
    void display(){
        System.out.println(sonage);
    }
}
class daughter extends father{
    int dauage=21;
    void display(){
        System.out.println(dauage);
    }
}
public class Classcastexeption {
    public static void main(String[] args) {
        father f=new son();

        if(f instanceof son){
            son s=(son)f;
            f.display();
        }
        else if (f instanceof daughter){
            daughter d=(daughter)f;
            f.display();
        
        }
    }
}
