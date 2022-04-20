package InheritanceActivity;

public class InheritanceActivity {

	public static void main(String[] args) {

		Manager m1 = new Manager(126534, "Peter", "Chennai India", 237844, 65000);
		System.out.println("Manager salary: " + m1.calculateSalary());
		System.out.println("Manager transport allowance: " + m1.calculateTransportAllowance());

		Trainee t1 = new Trainee(29846, "Jack", "Mumbai India", 442085, 45000);
		System.out.println("Trainee salary: " + t1.calculateSalary());
		System.out.println("Trainee transport allowance: " + t1.calculateTransportAllowance());

	}

}
