import java.util.Scanner;

public class Coffee {
    Coins c = new Coins();
    Stock k = new Stock();

    public void Coffee() {
    }

    public void Coffee(int s) {
        k.refill(s);
    }

    void despence(int x) {
        while (x > 0 && k.checkStock()) {
            System.out.println("Coffee");
            c.addCoin();
            k.take();
            x--;
        }
        if (x != 0) System.out.println("machine empty");
    }

    void status() {
        System.out.println("there are " + k.checkStock() + " Coffees in Stock\n" + "there are " + c.checkCoins() + " Coins\n");
    }

    public static void main(String args[]) {
    }
}

class Coins {
    int c = 0;

    void empty(int c) {
        c = 0;
    }

    void addCoin() {
        c++;
    }

    boolean checkCoins() {
        if (c > 0) return true;
        else return false;
    }
}
class Stock {
    int Stock = 10;

    void refill(int k) {
        Stock += k;
    }

    void take() {
        Stock -= 1;
    }

    void empty() {
        Stock = 0;
    }

    int available() {
        return Stock;
    }

    boolean checkStock() {
        if (Stock > 0) return true;
        else return false;
    }
}
