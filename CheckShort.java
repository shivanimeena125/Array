import java.util.Scanner;

public class CheckShort {
    public static void main(String[] args) {
        // int [] a={1,2,3,4,5};
        // int[]a1=new int[a.length+1];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        System.out.println("Enter the element");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            }
            System.out.println("array element are");
            int temp;
            for(int i=1;i<n;i++){
                for(int j=i+1;j<n;i++){
            if(a[i]>a[j]){        //ascending order
                 // if(a[i]<a[i-1]){       disending order 
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                }
                if(a[i]>a[i-1]){
                    System.out.println("short");
                }
            
            else{
                System.out.println("not short");
            }
        }
    }
    }
}
