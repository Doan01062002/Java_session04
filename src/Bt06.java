import java.util.Scanner;

public class Bt06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập một số nguyên từ bàn phím");
        int number = Integer.parseInt(scanner.nextLine());

        if(number < 0){
            number = number*(-1);
            int sum = 0;
            while (number>0){
                sum += number%10;
                number /= 10;
            }
            System.out.println("Tổng các chữ số là: " + sum);
        }else {
            int sum = 0;
            while (number>0){
                sum += number%10;
                number /= 10;
            }

            System.out.println("Tổng các chữ số là: " + sum);
        }
    }
}
