import java.util.Scanner;

public class Bt04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        while (true){
            System.out.println("Nhập số nguyên: ");
            int number = Integer.parseInt(scanner.nextLine());
            if (number == 0){
                System.out.println("Tổng các số đã nhập: " + sum);
                break;
            }
            sum += number;
        }
    }
}
