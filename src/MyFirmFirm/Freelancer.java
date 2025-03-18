package MyFirmFirm;

public class Freelancer extends EmployeeData implements Employee{

    public Freelancer(String name, Integer vatID, Integer baseSalary, Integer bonus) {
        super(name, vatID, baseSalary, bonus);
    }

    @Override
    public Integer calculateSalary() {
        return baseSalary - bonus;
    }

    @Override
    public String getName() {
        return name;
    }
}
