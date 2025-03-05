import java.util.Scanner;

public class Bt02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vui lòng nhập một số nguyên");
        int number = Integer.parseInt(scanner.nextLine());

        if (number < 1) {
            System.out.println("Số nguyên không thỏa mãn");
        }else {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(number); i++ ){
                if ((number%i) == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.println(number + " là số nguyên tố");
            }else {
                System.out.println(number + " không phải là số nguyên tố");
            }
        }
    }
}
