package com.wmora.projecteuler;

/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these
 * multiples is 23.
 * <p>
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */
class ProjectEuler1 {

    static long solution(int n) {
        long sum = 0;

        if (n < 3) {
            return sum;
        }

        sum += sumOfMultiples(n - 1, 3);
        sum += sumOfMultiples(n - 1, 5);
        sum -= sumOfMultiples(n - 1, 15);

        return sum;
    }

    private static long sumOfMultiples(long number, long multiple) {
        long lastMultipleInSeries = lastMultipleInSeries(number, multiple);
        long termsInSeries = termsInSeries(lastMultipleInSeries, multiple);
        return arithmeticSeriesSum(termsInSeries, multiple, lastMultipleInSeries);
    }

    private static long lastMultipleInSeries(long number, long multiple) {
        return number - (number % multiple);
    }

    private static long termsInSeries(long last, long difference) {
        return last / difference;
    }

    private static long arithmeticSeriesSum(long n, long a1, long an) {
        return (a1 + an) * n / 2;
    }

}
