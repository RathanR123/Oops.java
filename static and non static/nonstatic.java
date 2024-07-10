package oops;
class nonstatic{
    String name;
    int age;
     public static void main(String[] args) {
        nonstatic e1=new nonstatic();
        nonstatic e2=new nonstatic();
        e1.name="rathan";
        System.out.println(e1.name);
        e1.age=21;
        System.out.println(e1.age);
        e2.name="sadhan";
        System.out.println(e2.name);
        e2.age=22;
        System.out.println(e2.age);
    }
}
