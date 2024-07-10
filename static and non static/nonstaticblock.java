package oops;
class rathan{
    {
        System.out.println("good");
    }
}

public class nonstaticblock {
    public static void main(String[] args) {
        nonstaticblock sc=new nonstaticblock();
        System.out.println("hi");
    }
    {
        System.out.println("hello");
    }
    {
        System.out.println("well come");
    }
}
