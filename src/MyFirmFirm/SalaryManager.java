package MyFirmFirm;

import java.util.ArrayList;
import java.util.List;

public class SalaryManager {
    private final List<Employee> employeeList = new ArrayList<>();

    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }

    public Employee getEmployeeByName(String name){
        return employeeList.stream().filter(e -> e.getName().equals(name)).findFirst().orElse(null);
    }
}
