package MyFirmFirm;

abstract class EmployeeData {
    protected String name;
    protected Integer vatID;
    protected Integer baseSalary;
    protected Integer bonus;

    public EmployeeData(String name, Integer vatID, Integer baseSalary, Integer bonus) {
        this.name = name;
        this.vatID = vatID;
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

}
