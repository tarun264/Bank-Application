public interface bankAccount {
    //methods should not be kept private so that we can call it
    // to fetch balance we require password
    public String fetchBalance(String Password);
    public double creditMoney(double amount);
    public String withdrawMoney(String password, double amount);
    String changePassword(String newPassword, String oldPassword);
    double calculateInterest(int year);
}
