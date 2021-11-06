import java.util.Random;
import java.util.Scanner;

public class BT4 {
    public static void main(String[] args) {
        Random random = new Random();
        int answer = random.nextInt(11);
        System.out.println(answer);
        System.out.println("Nhập vào số từ 1-10");


       boolean check = true;
        Scanner input = new Scanner(System.in);
       while (check) {
           int number = input.nextInt();
           if (number > answer) {
               System.out.println("Nhập vào số nhỏ hơn");
           } else if (number < answer) {
               System.out.println("Nhập vào số lớn hơn");
           } else {
               System.out.println("Chúc mừng đã đoán đúng");
               check = false;
           }
       }

    }
}
