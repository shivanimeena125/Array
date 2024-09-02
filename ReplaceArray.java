public class ReplaceArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        for(int i=0;i<arr.length;i++){
            if(arr[2]==3){
                arr[2]=99;
            }
            System.out.println(arr[i]);
        }

    }
}
