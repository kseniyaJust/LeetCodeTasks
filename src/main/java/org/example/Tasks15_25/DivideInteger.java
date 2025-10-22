package org.example.Tasks15_25;

public class DivideInteger {
    public static int divide(int dividend, int divisor) {
                // Крайний случай: переполнение
                if (dividend == Integer.MIN_VALUE && divisor == -1) {
                    return Integer.MAX_VALUE;
                }

                // Определяем знак результата. Исключающее ИЛИ вернет true только если знаки разные
                boolean negative = (dividend < 0) ^ (divisor < 0);

                // Преобразуем в long и работаем с абсолютными значениями
                long dvd = Math.abs((long) dividend);
                long dvs = Math.abs((long) divisor);
                int quotient = 0;

                while (dvd >= dvs) {
                    long temp = dvs;
                    long multiple = 1;

                    // Находим наибольшее temp = dvs * 2^k, при котором temp <= dvd.
                    //сдвиг на бит k аналогичен умножению делению на 2^k
                    while (dvd >= (temp << 1)) {
                        temp <<= 1;
                        multiple <<= 1;
                    }

                    // Вычитаем найденный блок
                    dvd -= temp;
                    quotient += multiple;
                }
                if (negative) {
                    quotient = -quotient;
                }
                return quotient;
    }
}
