import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner accountScanner = new Scanner(System.in);
        System.out.print("Please enter the branch and account numbers: ");
        String account = accountScanner.nextLine();

        int verifyingDigit = VerifyingDigitCalculator.calculateVerifyingDigit(account);
        System.out.println("verifyingDigit == " + verifyingDigit);
    }
}
