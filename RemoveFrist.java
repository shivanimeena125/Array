public class RemoveFrist {



                                            //remove the frist element
//     public static void main(String[] args) {                                    
//       int []arr={11,12,13,14,15};
//             //   for(int i=1;i<arr.length;i++){
//             //     System.out.println(arr[i]);
//             //   }                  
//     int Delete=arr[0];
//     for(int i=0;i<arr.length;i++){
//         if(Delete==arr[i]){
//             for(int j=i;j<arr.length-1;j++){
//                     arr[j]=arr[j+1];
//                 }
//             }
//             }
//             for(int i=0;i<arr.length-1;i++){
//                 System.out.println(arr[i]);
//             }
// }
// }
public static void main(String[] args) {
    int a[]={11,12,13,14};
    int n=a.length;
    for(int i=0;i<n-1;i++){
        a[i]=a[i+1];
    }
    n--;
    for(int i=0;i<n;i++){
        System.out.println(a[i]);
    }

}
}