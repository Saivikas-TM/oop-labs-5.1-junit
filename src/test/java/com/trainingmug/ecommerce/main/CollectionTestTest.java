package com.trainingmug.ecommerce.main;

import com.trainingmug.ecommerce.repository.EmployeeRepository;
import com.trainingmug.ecommerce.service.PayrollImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CollectionTestTest {
    @Test
    @Order(1)
    @DisplayName("1. Check if CollectionTest class is created")
    void checkClassCreation() {
        assertDoesNotThrow(() -> Class.forName("com.trainingmug.ecommerce.main.CollectionTest"),
                "CollectionTest class is not created.");
    }

    @Test
    @Order(2)
    @DisplayName("2. Check if EmployeeRepository object is created")
    void checkEmployeeRepositoryCreation() {
        EmployeeRepository empRepository = new EmployeeRepository();
        assertNotNull(empRepository, "EmployeeRepository object is not created.");
    }

    @Test
    @Order(3)
    @DisplayName("3. Check if PayrollImpl object is created")
    void checkPayrollImplCreation() {
        PayrollImpl payroll = new PayrollImpl();
        assertNotNull(payroll, "PayrollImpl object is not created.");
    }
}
