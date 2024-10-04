public class RemoveLast {
    public static void main(String[] args) {
        //remove the last element
// int []arr={1,2,3,4,5};
// for(int i=0;i<arr.length-1;i++){
    // System.out.println(arr[i]);
// }
        int[]a={1,2,3,4,5};
        int Delete=a[a.length-1];
        for(int i=0;i<a.length;i++){
        if(Delete==a[i]){
            for(int j=i;j<a.length-1;j++){
                a[j]=a[j+1];
            }
        }
        }
                 for(int i=0;i<a.length-1;i++){
             System.out.println(a[i]);
         }
     }
}

