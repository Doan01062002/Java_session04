import java.util.Scanner;

public class Bt10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Kiểm tra số nguyên tố");
            System.out.println("2. Kiểm tra số hoàn hảo");
            System.out.println("3. Tìm và tính tổng tất cả các ước của một số");
            System.out.println("4. Thoát chương trình");
            System.out.print("Nhập lựa chọn của bạn: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Lựa chọn không hợp lệ!");
                scanner.next();
                continue;
            }

            choice = scanner.nextInt();

            if (choice == 4) {
                System.out.println("Chương trình kết thúc.");
                break;
            }

            System.out.print("Nhập một số nguyên dương: ");
            if (!scanner.hasNextInt()) {
                System.out.println("Số nhập vào không hợp lệ!");
                scanner.next();
                continue;
            }

            int number = scanner.nextInt();
            if (number <= 0) {
                System.out.println("Số phải là số nguyên dương!");
                continue;
            }

            switch (choice) {
                case 1:
                    boolean isPrime = (number > 1);
                    for (int i = 2; i * i <= number; i++) {
                        if (number % i == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                    System.out.println(number + (isPrime ? " là số nguyên tố." : " không phải là số nguyên tố."));
                    break;

                case 2:
                    int sumDivisors = 0;
                    for (int i = 1; i < number; i++) {
                        if (number % i == 0) sumDivisors += i;
                    }
                    System.out.println(number + (sumDivisors == number ? " là số hoàn hảo." : " không phải là số hoàn hảo."));
                    break;

                case 3:
                    int sum = 0;
                    System.out.print("Các ước của " + number + ": ");
                    for (int i = 1; i <= number; i++) {
                        if (number % i == 0) {
                            System.out.print(i + " ");
                            sum += i;
                        }
                    }
                    System.out.println("\nTổng các ước của " + number + " là: " + sum);
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ! Vui lòng nhập từ 1 đến 4.");
                    break;
            }
        }
        scanner.close();
    }
}
