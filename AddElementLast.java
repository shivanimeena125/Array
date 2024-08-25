public class AddElementLast {
    public static void main(String[] args) {
                        //add the element in the end
        //  int[]arr={1,2,3,4,5};
        // int count=0;
        // for(int i=0;i<arr.length+1;i++){
        //     count++;
        //     System.out.println(count);
        // }

        int arr[]={1,2,3,4};
        int newelement=5;
        int arr1[]=new int[arr.length+1];
        for(int i=0;i<arr.length;i++){
            // System.out.println(arr[i]);
            arr1[i]=arr[i];
        }
        System.out.println("add element");
        arr1[arr.length]=newelement;
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]);
        }
             
           
}
}