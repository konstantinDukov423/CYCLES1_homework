package ru.netology.sqr;

public class SQRService {

    public int calcService(int x, int y) {
        int result = 0;
        for (int i = 10; i < 100; i++) {
            if ((i * i >= x) && (i * i <= y)) {
                result++;
            }
        }
        return result;
    }
}

