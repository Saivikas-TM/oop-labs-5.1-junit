package com.trainingmug.ecommerce.repository;

import com.trainingmug.ecommerce.domain.Designer;
import com.trainingmug.ecommerce.domain.Developer;
import com.trainingmug.ecommerce.domain.Employee;

import java.util.HashSet;
import java.util.Set;

public class EmployeeRepository {

    Set<Employee> employeeSet;

    public EmployeeRepository() {
        this.employeeSet = new HashSet<>();
        this.employeeSet.add(new Employee(3333, "Nancy Davolio", "Devops Engineer", 4569.45F, 280.5F, 535.45F, 326.34F,
                12.5F, "00343538343"));
        this.employeeSet.add(new Employee(4444, "Steven Buchanan", "Frontend Developer", 4769.45F, 286.5F, 525.45F,
                336.34F, 12.0F, "01443558343"));
        this.employeeSet.add(new Developer(5555, "David Austin", "Senior Backend Developer", 6579.45F, 332.5F,
                629.45F, 398.34F, 9.5F, "01642558343", 5));
        this.employeeSet.add(new Developer(6666, "Nancy Greenberg", "Junior Backend Developer", 4369.45F, 278.5F,
                529.45F, 318.34F, 12.5F, "02743538343", 3));
        this.employeeSet.add(new Designer(7777, "Daniel Faviet", "Senior UI/UX Designer", 6349.45F, 322.5F, 618.45F,
                387.34F, 8.5F, "01642568343", 5));
        this.employeeSet.add(new Designer(8888, "Daniel Faviet", "Junior UI/UX Designer", 4339.45F, 277.5F, 526.45F,
                316.34F, 12.8F, "01243657343", 3));
        this.employeeSet.add(new Designer(8888, "Daniel Faviet", "Junior UI/UX Designer", 4339.45F, 277.5F, 526.45F,
                316.34F, 12.8F, "01243657343", 3));
    }

    public Set<Employee> getEmployeeSet(){
        return this.employeeSet;
    }
}
