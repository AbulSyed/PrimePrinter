public class primeNumber {

    public static void main(String[] args) {
        //print the first 5 prime numbers within the range specified
        int count=0;
        for (int i=1; i <=50; i++){
            if (isPrime(i)){
                System.out.println("Number " + i +" is a prime number!");
                count++;
                if (count==5){
                    System.out.println("First " + count + " prime numbers!");
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int n){
        if (n == 1){
            return false;
        }
        for (int i=2; i <= n/2; i++){
            if (n % i == 0){
                return false;
            }
        }return true;
    }
}
