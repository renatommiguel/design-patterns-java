public class Account {
    private float balance;

    public float getBalance() {
        System.out.printf("Balance is: %.2f \n", this.balance);
        return this.balance;
    }


    public void deposit (float amount){
        if(amount > 0)
            this.balance += amount;
    }

    public void withdraw (float amount){
        if(amount > 0)
            this.balance -= amount;
    }

}
