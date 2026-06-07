class Employee {
    private double salary;

    void setSalary(double salary) {
        if (salary > 10000) {
            this.salary = salary;
        } else {
            System.out.println("Salary must be greater than 10000");
        }
    }

    double getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        Employee e = new Employee();

        e.setSalary(9000);
        e.setSalary(15000);

        System.out.println("Employee Salary: " + e.getSalary());
    }
}
