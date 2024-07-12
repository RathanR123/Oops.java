package constructor;

public class employee {
    String name;
    int id;
    double sallery;

    public employee(String n,int i,double s){
        name = n;
        id = i;
        sallery =s;
    }
}
class mainclass{
    public static void main(String[] args) {
        employee[] sc=new employee[3];

        sc[0]=new employee("rathan", 122, 40000.00);
        sc[1]=new employee("rajesh", 123, 40000.00);
        sc[2]=new employee("ankitha", 124, 40000.00);

        for(employee employee:sc){
            System.out.println("name of emp is "+employee.name+" id is "+employee.id+" and sallery is "+employee.sallery);
        }
    }
}
