package polymorphism;

abstract class car{
    abstract void work();
}
class person extends car{
    @Override
   void work(){
        System.out.println("working");
    }
}

public class abstraction {
    public static void main(String[] args) {
       car e=new person();
       e.work(); 
    }
}
