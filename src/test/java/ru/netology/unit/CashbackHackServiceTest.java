package ru.netology.unit;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldTestIfAmountLess1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 500;
        int actual = service.remain(amount);
        int excepted = 500;
        assertEquals(excepted, actual);
    }

    @Test
    public void shouldTestIfAmount1000() {
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