public class Reversarray {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int a1[]=new int[5];
        int x=0;
        for(int i=a.length-1;i>=0;i--){
            a1[x]=a[i];
            x++;
            System.out.println(a[i]);
        }
    }
}
