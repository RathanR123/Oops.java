package oops;

public class constructor1 {
    String brand;
    double cost;
    constructor1(String brand,double cost){
        this.brand=brand;
        this.cost=cost;
    }
    public static void main(String[] args) {
        constructor1 sc=new constructor1("Nexon ", 1200000.0);
        System.out.println(" brand :"+sc.brand+"cost is "+sc.cost);
        constructor1 sc1=new constructor1("breza ", 1200000.0);
        System.out.println(" brand :"+sc1.brand+"cost is "+sc1.cost);

    }
}
