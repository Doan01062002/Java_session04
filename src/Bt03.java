import java.util.Scanner;

public class Bt03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vui long nhap mot so nguyen duong");
        int number = Integer.parseInt(scanner.nextLine());
        if (number < 1){
            System.out.println("Số nhập vào không hợp lệ");
        }else {
            for (int i=1; i <= 10; i++){
                System.out.printf(number + " x " + i + " = " + (number*i));
                System.out.println("\n");
            }
        }
    }
}
