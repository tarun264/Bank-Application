import java.util.UUID;

public class HDFCBank implements bankAccount {
    private String name;
   private  String accountNo;
    private double balance;
    private String password;
    final double rateOfInterest=6.1;
//always keep default and parameterized constructors
    public HDFCBank() {
    }

    public HDFCBank(String name, double balance, String password) {
        this.name = name;
        //it will give unique random number
        this.accountNo = String.valueOf(UUID.randomUUID());
        this.balance = balance;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String fetchBalance(String Password) {
        if(this.password.equals(Password)){
            return "Your current balance is: "+ this.balance;

        }
        return "Incorrect Password";
    }

    @Override
    public double creditMoney(double amount) {
        return this.balance+=amount;
    }

    @Override
    public String withdrawMoney(String password, double amount) {
        if(password.equals(this.password)){
            if(amount<=this.balance) {
                this.balance-=amount;
                return "Money has been withdrawn. The remaining balance is: "+ this.balance;
            }
        }
            else{
                return "Low Balance";
            }
        return "Please enter valid Password";
    }

    @Override
    public String changePassword(String newPassword, String oldPassword) {
        if(this.password.equals(oldPassword)){
            this.password=newPassword;
            return "Password Changed";
        }
        return "Incorrect old Password";
    }

    @Override
    public double calculateInterest(int year) {
        return (this.balance*this.rateOfInterest*year)/100;
    }
}
