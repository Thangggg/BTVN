import java.util.Scanner;

public class BT3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào số :");
        int number = input.nextInt();
        if (isPrime(number)){
            System.out.println("Đây là số nguyên tố");
        }else {
            System.out.println("Đây k phải số nguyên tố");
        }
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
