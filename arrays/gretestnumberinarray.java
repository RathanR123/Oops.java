package arrays;

public class gretestnumberinarray {
    public static void main(String[] args) {
        int [] a={10,20,30};
        int gretest=a[2];
        for(int i=1;i<a.length;i++){
            if(gretest<a[i]){
                gretest=a[2];
            }
        }
        System.out.println("gretest number is"+gretest);
    }
}
