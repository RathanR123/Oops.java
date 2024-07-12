package constructor;

public class Student {
    int age;
    String name;

    public Student(int a, String n) {
        age = a;
        name = n;
    }
}

class Solution{
    public static void main(String[] args) {
        Student[] sc = new Student[2];
        sc[0] = new Student(21, "rathan");
        sc[1] = new Student(19, "rajesh");
        for (Student student : sc) {
            System.out.println("Name: " + student.name + ", Age: " + student.age);
        }
    }
}

