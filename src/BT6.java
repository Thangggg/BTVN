

import java.util.Scanner;

public class BT6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.println("Game ai là triệu phú");
        System.out.println("LỚP C0921K1 CÓ BAO NHIÊU BẠN NỮ.");
        System.out.println("1. 1 Bạn");
        System.out.println("2. 2 Bạn");
        System.out.println("3. 3 Bạn");
        System.out.println("4. 4 Bạn");
        number = input.nextInt();

        switch (number){
            case 1:
            case 2:
            case 4:
                System.out.println("Sai rồi");
                break;
            case 3:
                System.out.println("Chuẩn đét");
                break;
            default:
                System.out.println("Vui lòng chọn 1 - 4");
        }

    }
}
