public class ShortArrayAccending {
    public static void main(String[] args) {
        int a[]={4,8,10,20,2,11,5};
        int temp;
        // int l=a.length-1;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){   
                            
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        
        System.out.println(a[i]);
        }
        System.out.println(a[2]);
    }
}
