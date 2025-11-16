// Maaşlı + bonus alan çalışan
public class SalariedEmployee extends Employee {

    private float bonus;

    public float getBonus() { return bonus; }
    public void setBonus(float bonus) { this.bonus = bonus; }

    public SalariedEmployee(String name, String address, String department, String email, float salary, float bonus) {
        super(name, address, department, email, salary);
        this.bonus = bonus;
    }

    public SalariedEmployee() {
        System.out.println("This is empty constructor");
    }

    @Override
    public float getSalary() {
        return salary + bonus;
    }
}
