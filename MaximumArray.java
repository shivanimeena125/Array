public class MaximumArray {
    public static void main(String[] args) {
        int a[]={3,5,4,10,20,15,5};
        int max=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
            System.out.println(a[i]);
        }
        
        System.out.println("maximum value of="+max);
    }
}
