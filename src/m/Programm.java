package m;

public class Programm {

    public static void main(String[] args) {
        Manager mOne = new Manager("Serhii" ,4500, 150 );
        Manager mTwo = new Manager("Vika",3800, 50);
        Manager mThree = new Manager("Yulia", 6000, 250);
        SalesPerson sOne = new SalesPerson("Olha", 2500, 150);
        SalesPerson stwo = new SalesPerson("Katya", 3500, 250);
        SalesPerson sThree = new SalesPerson("Luda", 4800, 130);

        Employee[] employees = new Employee[6];
        employees[0] = mOne;
        employees[1] = mTwo;
        employees[2] = mThree;
        employees[3] = sOne;
        employees[4] = stwo;
        employees[5] = sThree;

            Company company = new Company(employees);

        System.out.println(company.totalToPay());


    }
}
