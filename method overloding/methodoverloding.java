package oops;
public class methodoverloding {
    int add(int a,int b){
        return a+b;
    }
    double add(int a,double b){
        return a+b;
    }
    double add(double a,int b){
        return a+b;
    }

    public static void main(String[] args) {
        methodoverloding sc=new methodoverloding();
        int add=sc.add(12,15);
        double add1=sc.add(2.3,5);
        double add2=sc.add(5,10.4);
        System.out.println(add1);
        System.out.println(add);
        System.out.println(add2);
    }
}


  