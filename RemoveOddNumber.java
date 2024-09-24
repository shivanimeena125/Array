public class RemoveOddNumber {
    public static void main(String[] args) {
        int a[]={2,3,5,1,7,8,11,10};
        int sum=0;
        int count=0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2!=0){
                sum+=a[i];
                count++;
               System.out.println(a[i]); 
            }
        }
        System.out.println("sum of="+sum);
        System.out.println(count);
    }
}
