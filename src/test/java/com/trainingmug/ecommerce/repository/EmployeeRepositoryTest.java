package com.trainingmug.ecommerce.repository;
import com.trainingmug.ecommerce.domain.Designer;
import com.trainingmug.ecommerce.domain.Employee;
import org.junit.jupiter.api.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeRepositoryTest {
    private EmployeeRepository employeeRepository;

    @BeforeEach
    void setUp() {
        employeeRepository = new EmployeeRepository();
    }

    /*
    * Verifies that the EmployeeRepository class is created.
    * Since Java doesn't provide direct access to package information through reflection,
    * this test checks if the EmployeeRepository instance is not null,
    * indicating that the class is loaded.
    * */
    @Test
    @Order(1)
    @DisplayName("1. Check if the repository package is created")
    void checkPackageCreation() {
        assertNotNull(employeeRepository, "EmployeeRepository class is not created.");
    }

    @Test
    @Order(2)
    @DisplayName("2. Check if the EmployeeRepository class is created")
    void checkClassCreation() {
        assertNotNull(employeeRepository, "EmployeeRepository class is not created.");
    }

    @Test
    @Order(3)
    @DisplayName("3. Check if the no-argument constructor is created")
    void checkNoArgConstructor() {
        EmployeeRepository repo = new EmployeeRepository();
        assertNotNull(repo, "No-argument constructor is not created.");
    }


    @Test
    @Order(4)
    @DisplayName("4. Check if employeeSet is initialized to HashSet")
    void checkEmployeeSetInitialization() {
        assertTrue(employeeRepository.getEmployeeSet() instanceof HashSet,
                "employeeSet is not initialized to HashSet.");
    }

    @Test
    @Order(5)
    @DisplayName("5. Check if all Employee, Developer, and Designer objects are added to the employeeSet")
    void checkEmployeeObjectsAdded() {
        Set<Employee> employees = employeeRepository.getEmployeeSet();
        assertEquals(6, employees.size(), "Not all Employee, Developer, and Designer objects are added to the employeeSet.");
    }

//    @Test
//    @Order(6)
//    @DisplayName("6. Check if adding a duplicate object does not increase the size of the employeeSet")
//    void checkDuplicateObjectsNotAdded() {
//        Set<Employee> employees = employeeRepository.getEmployeeSet();
//        employees.add(new Designer(8888, "Daniel Faviet", "Junior UI/UX Designer", 4339.45F, 277.5F, 526.45F,
//                316.34F, 12.8F, "01243657343", 3));
//        assertEquals(6, employees.size(), "Duplicate object was added to the employeeSet.");
//    }
}
