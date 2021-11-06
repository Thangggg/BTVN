import java.util.Scanner;

public class BT5 {
    public static void main(String[] args) {
        System.out.println("Nhập vào a, b ,c");
        Scanner input = new Scanner(System.in);
        int a , b , c;
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        double delta = Math.pow(b,2) - 4*a*c;

        if (delta < 0) {
            System.out.println("Phương trình vô nghiệm");
        }else if (delta == 0) {
            System.out.println("Phương trình có nghiệm kép là : " + -b/2*a );
        }else {
            System.out.println("x1 : " + (-b + Math.sqrt(delta)/ 2*a ));
            System.out.println("x2 : " + (-b - Math.sqrt(delta)/ 2*a ));
        }

    }
}
