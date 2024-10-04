import java.util.Scanner;

public class FindIndex {
    public static void main(String[] args) {
    //     int element;
    //     int index=-1;
    // Scanner sc=new Scanner(System.in);
    // System.out.println("Enter no of elements");
    // int n=sc.nextInt();
    // System.out.println("Enter array elements");
    // int a[]=new int[n];
    // for(int i=0;i<n;i++){
    //     a[i]=sc.nextInt();
    // }
    // System.out.println("enter element of find index");
    // element=sc.nextInt();
    // for(int i =0;i<n;i++){
    //     if(a[i]==element){
    //         index=i;
    //         break;
    //     }
    // }
    // System.out.println("Index of  "+element+"  is "+index);
    int arr[]={1,2,13,4,5};
    int element=13;
    int index=-1;
    for(int i=0;i<arr.length;i++){
        if(arr[i]==element){
            index=i;
            break;
        }
    }
    System.out.println(index);
    }
}
