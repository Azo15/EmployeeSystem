// Saatlik çalışan -> maaş = saatlik ücret * çalışma saati
public class HourlyEmployee extends Employee {

    private float workHourPrice;
    private int hourlyRate;

    // Getter/Setter
    public int getHourlyRate() { return hourlyRate; }
    public void setHourlyRate(int hourlyRate) { this.hourlyRate = hourlyRate; }

    public float getWorkHourPrice() { return workHourPrice; }
    public void setWorkHourPrice(float workHourPrice) { this.workHourPrice = workHourPrice; }

    public HourlyEmployee() {
        System.out.println("This is empty constructor");
    }

    public HourlyEmployee(String name, String address, String department, String email, float salary,
                          int hourlyRate, float workHourPrice) {

        super(name, address, department, email, salary);
        this.hourlyRate = hourlyRate;
        this.workHourPrice = workHourPrice;
    }

    @Override
    public float getSalary() {
        return workHourPrice * hourlyRate;
    }
}
