import java.util.Scanner;
public class Array_user {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number");
    int a=sc.nextInt();
    int arr[]=new int[a];
    System.out.println("enter the element of array");
    for(int i=0;i<a;i++){ 
        arr[i]=sc.nextInt();
    }
System.out.println("array element are");
    for(int i=0;i<a;i++){
        System.out.println(arr[i]);
    }
   } 
}
