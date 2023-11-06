class Employee {
    private String name;
    private String email;
    private double hourRate;
    private int capacity;
    private int freeDays;
    public Employee(String name, String email, double hourRate, int capacity, int freeDays) {
        this.name = name;
        this.email = email;
        this.hourRate = hourRate;
        this.capacity = capacity;
        this.freeDays = freeDays;
    }
    public double calculateMonthlyIncome() {
        return hourRate * (22 - freeDays) * capacity;
    }
}

