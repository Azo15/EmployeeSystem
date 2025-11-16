public class Main {
    public static void main(String[] args) {

        // Temel çalışan
        Employee e1 = new Employee("Azo", "Istanbul", "IT", "azo@gmail.com", 3200);
        System.out.println("E1 Salary = " + e1.getSalary());

        // Maaş + bonus alan çalışan
        SalariedEmployee e2 = new SalariedEmployee("Azo", "Istanbul", "IT", "azo@gmail.com", 3200, 200);
        System.out.println("E2 Salary = " + e2.getSalary());

        // Günlük çalışan
        DailyEmployee e3 = new DailyEmployee("Azo", "Istanbul", "IT", "azo@gmail.com", 3200, 25, 35);
        System.out.println("E3 Salary = " + e3.getSalary());

        // Saatlik çalışan
        HourlyEmployee e4 = new HourlyEmployee("Azo", "Istanbul", "IT", "azo@gmail.com", 3200, 180, 7);
        System.out.println("E4 Salary = " + e4.getSalary());
    }
}
