package org.example;

public class BonusService {
    public long calculate(long amount, boolean registered) {
        int percent = registered ? 5 : 1;  // 5% для зарегистрированных, 1% для остальных
        long bonus = amount * percent / 100;
        long limit = 500;  // максимальный бонус
        return Math.min(bonus, limit);  // возвращаем меньшую из величин: бонус или лимит
    }
}