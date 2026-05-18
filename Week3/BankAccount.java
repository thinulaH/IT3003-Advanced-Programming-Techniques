public class BankAccount {
    private int balance;

    public int getBalance() {

        return balance;
    }

    public void setBalance(int balance) {
        if(balance >=0) {
            this.balance = balance;
        }else{
            System.out.println("Balance need to be greater than 0 !");
        }
    }
    public static void main(String[] args){
        BankAccount ba = new BankAccount();
        ba.setBalance(2000);
        System.out.println("Balance = "+ ba.balance);
    }
}

