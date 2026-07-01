import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String accNumber=sc.next();
        String accName=sc.next();
        double bal=sc.nextDouble();
        BankAccount acc = new BankAccount(accNumber, accName, bal);
        acc.deposit(200);
        acc.withdraw(800);
        System.out.println(acc.getBalance());
    }
}