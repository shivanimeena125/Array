 class RemoveEvenNumber {
    public static void main(String[] args) {
        int []a={2,3,5,4,7,8,10,11};
        int sum=0;
        int count=0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2!=0){
                count++;
                sum+=a[i];
                System.out.println(a[i]);
            }
        }
        System.out.println("sum of="+sum);
        System.out.println(count);
    }
}
