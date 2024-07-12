package arrays;

public class mulof5inarray {
    public static void main(String[] args) {
        int [] a={2,4,5,10,12,15,20,23,25,27,30,35,40,45,43,50};
        for(int i=0;i<a.length;i++){
            if(a[i]%5==0){
                System.out.println(a[i]);
            }
        }
    }
}
