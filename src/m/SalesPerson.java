package m;

public class SalesPerson extends Employee {

    private int percent;

    public SalesPerson(String name, double salary, int percent) {
        super(name, salary);
        this.percent = percent;
    }

    public void setBonus(double bonus){
        if(percent>100 && percent<200)
            bonus = bonus*2;
        else if(percent >=200)
            bonus = bonus*3;
    }



}
