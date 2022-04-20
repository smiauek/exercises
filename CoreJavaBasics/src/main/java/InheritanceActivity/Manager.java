package InheritanceActivity;

public class Manager extends Employee {

	public Manager(long employeeId, String employeeName, String employeeAddress, long employeePhone,
			double basicSalary) {
		super(employeeId, employeeName, employeeAddress, employeePhone, basicSalary);

	}

	@Override
	public double calculateTransportAllowance() {
		double transportAllowance = 15 * getBasicSalary() / 100;

		return transportAllowance;
	}

}
