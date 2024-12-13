public class Main {
    public static void main(String[] args) {
       
        double startingBalance = 5000;
        double balance = 0;
       final double interestRate = .17;
        double interest = 0;

        System.out.println("Your current balance is " + startingBalance);
        interest = startingBalance * interestRate;
        balance = startingBalance + interest;
        System.out.println("1st Month Balance: " + balance);
       interest = balance * interestRate;
       balance = balance + interest;
        System.out.println("2nd Month Balance: " + balance);
       
    }

}