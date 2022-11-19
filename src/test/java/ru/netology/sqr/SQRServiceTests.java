package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class SQRServiceTests {

    @ParameterizedTest
    @CsvSource({
            "200, 300, 3",  //внутри диапазона
            "100, 9801, 90", //весь диапазон
            "0, 99, 0",  //вне диапазона слева
            "9802, 10000, 0",  //вне диапазона справа
    })
    void calculateForInterval(int x, int y, int expected) {
        SQRService service = new SQRService();

        int actual = service.calcService(x, y);
        Assertions.assertEquals(expected, actual);
    }
}