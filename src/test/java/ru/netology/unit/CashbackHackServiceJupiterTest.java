package ru.netology.unit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceJupiterTest {

    @Test
    void shouldTestIfAmountLess1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 500;
        int actual = service.remain(amount);
        int excepted = 500;
        assertEquals(excepted, actual);
    }

    @Test
    void shouldTestIfAmount1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int excepted = 0;
        assertEquals(excepted, actual);
    }

    @Test
    public void shouldTestIfAmountMore1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1300;
        int actual = service.remain(amount);
        int excepted = 700;
        assertEquals(excepted, actual);
    }
}