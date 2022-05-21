import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoffeeTest {
    Coffee coff;
    Stock k;
    Coins c;
    String s;

    @BeforeEach
    public void setUp() {
        coff = new Coffee();
        k = new Stock();
        c = new Coins();
    }

    class insertCoinVal {
        int insert(int coff) {
            if (coff > 0) return coff;
            else return 0;
        }
    }

    @Test
    public void CoffeeStub() {
        insertCoinVal y = new insertCoinVal();
        coff.despence(y.insert(5));
        assertEquals(coff.k.Stock, 5);
    }

    class doubleCoffee {
        String check(int coff) {
            if (coff % 2 == 0) return "Making double coffees";
            else return "Cannot make double coffees";
        }
    }

    @Test
    public void StockDriver() {
        doubleCoffee y = new doubleCoffee();
        s = y.check(k.available());
        assertEquals(s, "Making double coffees");
        k.take();
        s = y.check(k.available());
        assertEquals(s, "Cannot make double coffees");
    }

    @AfterEach
    public void clean() {
        coff = null;
    }
}