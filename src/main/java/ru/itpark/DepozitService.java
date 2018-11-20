package ru.itpark;

public class DepozitService {
    public int calculateDeposit(int deposit, int percent, int date) {
        int sum = (deposit * percent * date / 100) + deposit;
        return sum;
    }
}

