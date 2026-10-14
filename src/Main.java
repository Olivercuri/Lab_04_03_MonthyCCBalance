public class Main {
    public static void main(String[] args) {

        double balance = 5000.00;
        double annualInterestRate = 0.17;
        double monthlyInterestRate = annualInterestRate / 12;

        double interestOneMonth = balance * monthlyInterestRate;
        double balanceAfterOneMonth = balance + interestOneMonth;

        double interestTwoMonths = balanceAfterOneMonth * monthlyInterestRate;
        double balanceAfterTwoMonths = balanceAfterOneMonth + interestTwoMonths;

        System.out.println("Starting balance: $" + balance);
        System.out.println("Interest after one month: $" + interestOneMonth);
        System.out.println("Balance after one month: $" + balanceAfterOneMonth);
        System.out.println("Interest after two months: $" + interestTwoMonths);
        System.out.println("Balance after two months: $" + balanceAfterTwoMonths);
    }
}