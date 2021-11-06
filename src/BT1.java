public class BT1 {
    public static void main(String[] args) {
        int count = 0;
        int number = 11;
        while (count < 20) {
            if (number % 5 == 0){
                count++;
            }
            number++;
        }System.out.println(number - 1);

    }
}
