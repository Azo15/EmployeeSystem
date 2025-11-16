// Base class -> Tüm çalışan tiplerinin ortak özellikleri
public class Employee {

    protected String name, address, department, email;
    protected float salary;

    // Getter / Setter
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public float getSalary() { return salary; }
    public void setSalary(float salary) { this.salary = salary; }

    // Dolu constructor
    public Employee(String name, String address, String department, String email, float salary) {
        this.name = name;
        this.address = address;
        this.department = department;
        this.email = email;
        this.salary = salary;
    }

    // Boş constructor
    public Employee() {
        System.out.println("This is empty constructor");
    }
}
