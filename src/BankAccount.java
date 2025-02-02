public class BankAccount{
    public static void main(String [] args){
        double balance = 2175.37; //starting balance
        balance -= 302.50; //withdrew 302.50
        balance += 50.03; //deposited 50.03
        balance /= 2; // withdrew half his balance
        balance += 20.00; //deposited 20.00
        balance -= 1; //withdrew 1
        balance *= 2; // deposited paycheck that doubled balance
        balance += 1; // deposited 1
        System.out.print(balance);
    }

}
