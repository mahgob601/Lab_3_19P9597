

public class ATM_P2 {
    double balance = 0;
    withdraw w = new withdraw();
    deposit d = new deposit();

    public double operate(int x, double amount) {
        switch (x) {
            case 1:
                this.balance = w.withdraw(amount, balance);
            case 2:
                this.balance = d.deposit(amount, balance);
        }
        return balance;
    }

    public static void main(String args[]) {
    }
}

class deposit {
    double deposit(double deposit, double balance) {
        if (deposit <= 0) return balance;
        balance = balance + deposit;
        return balance;
    }
}

class withdraw {
    double withdraw(double withdraw, double balance) {
        if (balance >= withdraw) return balance - withdraw;
        else return balance;
    }
}