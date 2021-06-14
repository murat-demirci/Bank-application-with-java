import java.util.Scanner;

public class BankApplication {
    public static void main(String[] args) throws InterruptedException {
        Scanner scan=new Scanner(System.in);
        double account=0;
        int dMoney,wdMoney;
        boolean process=true;
        System.out.println("-->WELCOME<--");
        while(process){
            System.out.print("""
                    1-> Account Balance
                    2->Deposit
                    3->Withdrawal
                    4->Exit
                    enter number-> """);

            int option= scan.nextInt();
            switch (option) {
                case 1 -> System.out.println("Account Balance-> " + account + "\n");
                case 2 -> {
                    System.out.print("Enter your amount-> ");
                    dMoney = scan.nextInt();
                    account += dMoney;
                    System.out.println("Wait...");
                    Thread.sleep(3000);
                    System.out.print("Completed!\n");
                }
                case 3 -> {
                    System.out.print("Enter your amount-> ");
                    wdMoney = scan.nextInt();
                    account -= wdMoney;
                    System.out.println("Processing...");
                    Thread.sleep(3000);
                    System.out.print("Completed!\n");
                }
                case 4 -> {
                    System.out.print("Have a good day!!\n");
                    process = false;
                }
                default -> System.out.print("please select again");
            }
        }
    }
}
