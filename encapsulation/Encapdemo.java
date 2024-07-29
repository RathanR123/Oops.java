package encapsulation;

class model{
    private String name="rathan";
    private int id=2123;
    void setName(String n){
        name = n;
    }
    String getName(){
        return name;
    }
    void setId(int i){
        id =i;
    }
    int  getId(){
        return id;
    }
}


public class Encapdemo {
    public static void main(String[] args) {
        model m=new model();
        m.setName("rajesh");
        String name=m.getName(); 
        m.setId(123);
        int id=m.getId();
        System.out.println(m.getId());
        System.out.println(m.getName());
    }
}
