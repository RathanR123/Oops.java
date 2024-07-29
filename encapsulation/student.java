package encapsulation;

public class student {
    private String name;
    private int age;
    private int id;

    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name=name;
    }
    public int getage(){
        return age;
    }
    public void setage(int age){
        this.age=age;
    }
    public int getid(){
        return id;
    }
    public void setid(int id){
        this.id=id;
    }
    
}
class details{
    public static void main(String[] args) {
        student sc=new student();
        
    }
}
