package org.example;

public class BonusService {
    public long calculate(long amount, boolean registered) {
        int percent = registered ? 5 : 1;
        long bonus = amount * percent / 100;
        long limit = 500;
        return Math.min(bonus, limit);
    }
}
