package MyFirmFirm;

public class PartTime extends EmployeeData implements Employee {

    public PartTime(String name, Integer vatID, Integer baseSalary, Integer bonus) {
        super(name, vatID, baseSalary, bonus);
    }

    @Override
    public Integer calculateSalary() {
        return baseSalary + (bonus * 2);
    }

    @Override
    public String getName() {
        return name;
    }
}
