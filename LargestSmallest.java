public class LargestSmallest {
    public static void main(String[] args) {
        int []a={2,5,3,8,10,6,15,22};
        int l=a.length-1;
        int temp;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                // if(a[i]>a[j]){
                       if(a[i]<a[j]){        
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
            System.out.println(a[i]);
        }
        System.out.println("second smallest="+a[1]);
        System.out.println("second largest="+a[l-1]);
    }
}
