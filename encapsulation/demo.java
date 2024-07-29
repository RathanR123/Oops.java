package encapsulation;

class Parent{
   private int age=21;
   void setAge(int a){
    age=a;
   }
   int getAge(){
    return age;
   }

}
public class demo {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.setAge(25);
        int result = p.getAge();
        System.out.println(result);
       
    }
}
