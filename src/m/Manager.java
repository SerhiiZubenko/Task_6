package m;


public class Manager extends Employee {

    private int quantity;

    public Manager(String name, double salary, int quantity) {
        super(name, salary);
        this.quantity = quantity;
    }

    public void setBonus(double bonus) {
        if(quantity>100 && quantity<150)
        bonus = bonus+500;
        else if(quantity>=150)
            bonus = bonus +1000;
    }
}
