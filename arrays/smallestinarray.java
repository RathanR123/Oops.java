package arrays;

public class smallestinarray {
    public static void main(String[] args) {
        int[] a={10,20,30};

        int smallest=a[0];
    
        for(int i=1;i<a.length;i++){
            if(a[i]<smallest){
                smallest=a[i];
            }
        }
        System.out.println("smallest number is "+smallest);
    }
}
