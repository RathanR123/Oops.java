package Libraries;
class Car{
    int cost=1000000;
    public int hashCode(){
        return cost;
    }
}
public class Hashcodeoverride {
    public static void main(String[] args) {
        Car c=new Car();
        System.out.println(c);
        System.out.println(c.hashCode());
    }
   

}
