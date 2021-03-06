package ru.netology.unit;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldTestIfAmountLess1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 200;
        int actual = service.remain(amount);
        int excepted = 800;
        assertEquals(actual, excepted);
    }

    @Test
    public void shouldTestIfAmount1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int excepted = 0;
        assertEquals(actual, excepted);
    }

    @Test
    public void shouldTestIfAmountMore1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1500;
        int actual = service.remain(amount);
        int excepted = 500;
        assertEquals(actual, excepted);
    }
}