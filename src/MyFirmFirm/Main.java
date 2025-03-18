package MyFirmFirm;

public class Main {
    public static void main(String[] args) {
        SalaryManager salaryManager = new SalaryManager();

        Employee empl1 = new FullTime("Hugó", 56456352, 100000, 10000);
        salaryManager.addEmployee(empl1);
        //így is lehet?
        salaryManager.addEmployee(new Freelancer("Sanyi", 753972454, 100000, 20000));
        salaryManager.addEmployee(new PartTime("Béci", 52434542, 100000, 20000));
        salaryManager.addEmployee(new FullTime("FickóMan", 4334455, 100000, 20000));
        //lol
        System.out.println(salaryManager.getEmployeeByName("Sanyi").calculateSalary()); //tőle levontuk a bónuszt
        System.out.println(salaryManager.getEmployeeByName("Béci").calculateSalary()); //dupla bónuszt kap
        System.out.println(salaryManager.getEmployeeByName("FickóMan").calculateSalary()); //megkapta a bónuszt

    }
}
