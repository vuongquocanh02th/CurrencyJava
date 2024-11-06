import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter USD: ");
        double usd = sc.nextDouble();
        double vnd = usd * 23000;
        System.out.print("Gia tri VND la "+vnd);
    }
}
