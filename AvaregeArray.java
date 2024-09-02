public class AvaregeArray {
    public static void main(String[] args) {
        int[]arr={2,3,5,7,8};
        // int avarage=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println("avarage ="+sum/5);
        System.out.println(sum);
    }
}
