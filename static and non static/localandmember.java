package oops;
class operator{
    int a;
    int b;
    

    int add(int a,int b){
        int c=a;
        int d=b;
        return c+d;
    }

}
public class localandmember {
    public static void main(String[] args) {
        operator sc=new operator();
        sc.a=5;
        sc.b=10;
        System.out.println(sc.add(5,10));

    }
}

