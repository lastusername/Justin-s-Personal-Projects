public class BankAccountTester
{

    public static void main (String[] args)
    {

        input imp = new input();
        
      
        
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount(imp.monStart());


        account2.withdraw(imp.withdrawalAmt());
        System.out.println("Your current balence is $" + account1.getBalance());
        System.out.println("Your current balence is $" + account2.getBalance());
    
    }
}