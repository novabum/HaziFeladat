package MyFirmFirm;

public class FullTime extends EmployeeData implements Employee{

    public FullTime(String name, Integer vatID, Integer baseSalary, Integer bonus) {
        super(name, vatID, baseSalary, bonus);
    }

    @Override
    public Integer calculateSalary() {
        return baseSalary + bonus;
    }

    @Override
    public String getName() {
        return name;
    }
}
