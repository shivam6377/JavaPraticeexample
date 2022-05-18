package demo;
class BankApp {
int total_balance = 10000;



synchronized void Withdraw(int withdraw) { // 10>=6
if (total_balance >= withdraw) {
System.out.println(withdraw + " Amount Withdrawn successfully");
total_balance = total_balance - withdraw;
System.out.println("Balance left: " + total_balance);
} else {
System.out.println("Balance Not ducted");
System.out.println("Balance available " + total_balance);
}
}
}



public class BankPortal extends Thread {



static BankApp m;
int balance;



public void run() {
m.Withdraw(balance);
}



public static void main(String[] args) {



m = new BankApp();
BankPortal user1 = new BankPortal();
user1.balance = 300;
user1.start();
BankPortal user2 = new BankPortal();
user2.balance = 8000;
user2.start();



}
}

