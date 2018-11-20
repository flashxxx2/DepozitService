package ru.itpark;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DepositServiceTest {

    @Test
    void calculateDeposit() {
        DepozitService depositService = new DepozitService();
        int deposit = depositService.calculateDeposit(1_000_000, 10, 3);

        assertEquals(1_300_000,deposit);

    }
}