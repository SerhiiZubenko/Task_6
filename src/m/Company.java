package m;

public class Company {
    private Employee[] employees;
    private double companyBonus ;

    public Company(Employee[] employees) {

        this.employees = employees;
    }

    public void setGiveEverybodyBonus(double companyBonus) {

        this.companyBonus = companyBonus;
    }

//    public double totalToPay(Employee[] employees(String name, double salary)) {
    public double totalToPay() {
        double total = 0;
        double result = 0;
        for (int i = 0; i < employees.length; i++) {
            total = employees[i].getSalary() + companyBonus;
            result += total;
        }
        return result;
    }

    public String nameMaxSalary() {
        double max = employees[0].getSalary();
        String result =employees[0].getName();
        for (int i=0; i< employees.length; i++){
            if(max< employees[i].getSalary()){
                result =employees[i].getName();
            }
        }
        return result;
    }



}