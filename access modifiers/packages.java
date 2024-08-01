import packages.differentpackages;
class diff extends differentpackages{
    public void method3(){
        System.out.println(publicVar);
       // System.out.println(privateVar);
        System.out.println(protectedVar);
       // System.out.println(defaultVar);

    }
 }
public class packages {
    public static void main(String[] args) {
    diff c3 = new diff();
    c3.method3();
    }
}
