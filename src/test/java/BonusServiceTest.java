import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1000_60;
        boolean registered = true;
        long expected = 40;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1_000_000_60;
        boolean registered = true;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForNOTRegisteredAndLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 4_500_000;
        boolean registered = false;
        long expected = 450;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForNOTRegisteredAndOverLimited() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 6_000_000_60;
        boolean registered = false;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }


    @org.junit.jupiter.api.Test
    void shouldCalculateForNOTRegisteredAnd_Border_OverLimited() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 5_000_001;
        boolean registered = false;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }


    @org.junit.jupiter.api.Test
    void shouldCalculateForNOTRegisteredAnd_Border_Limited() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 4_999_999;
        boolean registered = false;
        long expected = 499;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }



    @org.junit.jupiter.api.Test
    void shouldCalculateForNOTRegisteredAnd_Equali_Limited() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 5_000_000;
        boolean registered = false;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }








    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAnd_Border_OverLimited() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1_666_668;
        boolean registered = true;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }


    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAnd_Border_Limited() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1_666_665;
        boolean registered = true;
        long expected = 499;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }



    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAnd_Equali_Limited() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1_666_667;
        boolean registered = true;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
}