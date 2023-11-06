import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        ArrayList<Employee> e = new ArrayList<>();
        for (int i = 0; i < n; i++) {

            e.add(new Employee(s.next(), s.next(), s.nextDouble(), s.nextInt(), s.nextInt()));
        }
        s.close();
        for (Employee emp : e) {
            System.out.println(emp.calculateMonthlyIncome());
        }
    }
}