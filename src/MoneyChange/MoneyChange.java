package MoneyChange;

import java.util.Scanner;

public class MoneyChange {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int rate = 23000;

        System.out.print("Nhập USD: ");
        int usd = scanner.nextInt();

        int vnd = usd*rate;

        System.out.println(usd + "USD " +"= " + vnd + "VNĐ");
    }
}
