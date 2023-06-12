import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // create 1st acoount
        HDFCBank account1= new HDFCBank("Tarun",1000000,"abc123");
        System.out.println("Congrats "+ account1.getName()+" Your account has been created with account no"+ account1.getAccountNo());
        //create 2nd account
        HDFCBank account2= new HDFCBank("Bunty",200000,"qwe123");
        System.out.println("Congrats "+ account2.getName()+" Your account has been created with account no"+ account2.getAccountNo());
//add money to account 1
        account2.creditMoney(25000);

//to check balance
        System.out.println(account2.fetchBalance("qwe123"));

        account1.withdrawMoney("abc123",25000);
//changing password with wrong old password
        System.out.println(account1.changePassword("asd","q12w"));
        //changing password with correct pld passowrd
        System.out.println(account1.changePassword("asd","abc123"));

        System.out.println("Enters the years to get interest");
        int year=sc.nextInt();
        System.out.println(account1.calculateInterest(year));
        System.out.println(account2.calculateInterest(year));

    }
}