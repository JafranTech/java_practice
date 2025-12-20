class prime{
    public static void main(String args[]){
        int count = 0;
        int n=8;

        for(int i =1; i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if (count == 2){
            System.out.print("this is prime number");
        }
        else{
            System.out.print("this is not prime number");
        }
    }
}