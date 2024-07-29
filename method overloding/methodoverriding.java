package methodoverloding;

class son{
    void display(){
        System.out.println("hi");
    }
}
class father extends son{
    @Override
    void display(){
        super.display();
        System.out.println("hello");
    }
}

public class methodoverriding {
    public static void main(String[] args) {
       father sc=new father();
       sc.display(); 
    }
    
}
