// Günlük çalışan -> maaş = günlük fiyat * gün sayısı
public class DailyEmployee extends Employee {

    private float workDayPrice;
    private int dailyRate;

    // Getter/Setter
    public int getDailyRate() { return dailyRate; }
    public void setDailyRate(int dailyRate) { this.dailyRate = dailyRate; }

    public float getWorkDayPrice() { return workDayPrice; }
    public void setWorkDayPrice(float workDayPrice) { this.workDayPrice = workDayPrice; }

    public DailyEmployee() {
        System.out.println("This is empty constructor");
    }

    // Dolu constructor
    public DailyEmployee(String name, String address, String department, String email, float salary,
                         int dailyRate, float workDayPrice) {

        super(name, address, department, email, salary);
        this.dailyRate = dailyRate;
        this.workDayPrice = workDayPrice;
    }

    @Override
    public float getSalary() {
        return workDayPrice * dailyRate;
    }
}
