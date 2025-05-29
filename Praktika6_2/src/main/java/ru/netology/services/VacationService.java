package ru.netology.services;

public class VacationService {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету

        for (int month = 0; month < 12; month++) {
            if (money >= threshold) {
                // Режим отдыха:
                // 1. Сначала вычитаем expenses
                // 2. Затем уменьшаем остаток в 3 раза
                money -= expenses;
                money /= 3;
                count++;
            } else {
                // Режим работы:
                // income - expenses
                money += income - expenses;
            }
        }
        return count;
    }
}
