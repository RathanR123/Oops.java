package inheritance;

class add{
    int a=3;
    int b=2;
     int display(int a,int b){
        return a+b;
    }
}
class sub extends add{
    int display(){
        return a-b;
    }
}
class mul extends add{
    int display(){
        return a*b;
    }
}

public class heirarchial {
    public static void main(String[] args) {
        mul sc=new mul();
        sc.display();
        
    }
    
}
