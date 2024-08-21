public class BankAccount {
    private double balance;

public BankAccount()
{
    balance = 0;
}
public BankAccount(double amt)
{
    balance = amt;
}
void deposit(double amt)
{
    balance += amt;
}
void withdraw(double amt)
{
    balance -= amt;
}
double getBalance()
{
    return balance;
}
}