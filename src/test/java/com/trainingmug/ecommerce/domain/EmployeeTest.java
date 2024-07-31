package com.trainingmug.ecommerce.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {

    private Employee employee1;
    private Employee employee2;
    private Employee employee3;

    @BeforeEach
    void setUp() {
        employee1 = new Employee(1, "John Doe", "Software Engineer", 5000f, 300f, 200f, 100f, 5f, "123456789");
        employee2 = new Employee(1, "John Doe", "Software Engineer", 5000f, 300f, 200f, 100f, 5f, "123456789");
        employee3 = new Employee(2, "Jane Doe", "Software Engineer", 5500f, 350f, 250f, 150f, 6f, "987654321");
    }

    @Test
    @Order(1)
    @DisplayName("1. Check if hashCode() and equals(Object obj) methods are overridden")
    void checkHashCodeEqualsMethodsOverridden() {
        assertTrue(hasMethod(Employee.class, "hashCode", new Class<?>[0]), "hashCode() method is not overridden.");
        assertTrue(hasMethod(Employee.class, "equals", new Class<?>[]{Object.class}), "equals(Object obj) method is not overridden.");
    }

    private boolean hasMethod(Class<?> clazz, String methodName, Class<?>[] parameterTypes) {
        try {
            clazz.getDeclaredMethod(methodName, parameterTypes);
            return true;
        } catch (NoSuchMethodException e) {
            return false;
        }
    }

    @Test
    @Order(2)
    @DisplayName("2. Check if hashCode() and equals(Object obj) methods are working as expected")
    void checkHashCodeEqualsMethodsFunctionality() {
        // Check if employee1 and employee2 are equal and have the same hash code
        assertEquals(employee1, employee2, "employee1 and employee2 should be equal.");
        assertEquals(employee1.hashCode(), employee2.hashCode(), "employee1 and employee2 should have the same hash code.");

        // Check if employee1 and employee3 are not equal and have different hash codes
        assertNotEquals(employee1, employee3, "employee1 and employee3 should not be equal.");
        assertNotEquals(employee1.hashCode(), employee3.hashCode(), "employee1 and employee3 should have different hash codes.");
    }

}
