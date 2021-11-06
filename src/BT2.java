public class BT2 {
    public static void main(String[] args) {
        int number = 10;
        int sum = 0;
        for (int i = 10; i < 50; i++) {
            if (isPrime(i)){
                sum += i;
                System.out.println(i);

            }
        }
        System.out.println(sum);
    }

    public static boolean isPrime (int num) {
        boolean check = true;
            for (int i = 2; i <= Math.sqrt(num) ; i++) {
                if (num % i ==0){
                    check = false;
                    break;
            }
        }
                return check;
    }
}

