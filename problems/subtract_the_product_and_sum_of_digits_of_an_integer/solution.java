class Solution {
    public static int subtractProductAndSum(int n) {
        int temp,sum=0;
        int product=1;
        while(n>0){
            temp=n%10;
            sum=sum+temp;
            product=product*temp;
            n=n/10;
        }
        int result;
        result = product-sum;
        return result;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.print(subtractProductAndSum(n));
    }
}