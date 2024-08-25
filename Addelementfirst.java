public class Addelementfirst {
    public static void main(String[] args) {
        int arr[]={7,8,9,10};
        int element=6;
        int arr1[]=new int[arr.length+1];
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
            arr1[i+1]=arr[i];

        }
        System.out.println("add element");
        for(int i=0;i<arr1.length;i++){
            arr1[0]=element;
            System.out.println(arr1[i]);
        }
    }
}
