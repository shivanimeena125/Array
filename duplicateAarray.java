public class duplicateAarray {
    public static void main(String[] args) {
        int a[]={1,2,5,3,2,4,2};
        int element=0;
        int num=0;
        
        for(int i=0;i<a.length;i++){
            int count=0;
            for(int j=1;j<a.length;j++){
               if(a[i]==a[j]){
                count++;
               } 
            }
        
        if(count>num){
            num=count;
            element=a[i];
        }
    }
    System.out.println("duplicate element= "+element);
    System.out.println("number of time= "+num);
    }
}
