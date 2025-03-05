import java.util.Scanner;

public class Bt01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vui lòng nhập một số nguyên để tính tổng");
        int n = Integer.parseInt(scanner.nextLine());


        if (n <=0) {
            System.out.println("Số nhập vào không hợp lệ");
        }else{
            int sum = 0;
            for (int i=1; i<= n; i++){
                sum += i;
            }
            System.out.printf("Tổng các số từ %d đến %d là: %d", 1, n, sum);
        }
    }
}
