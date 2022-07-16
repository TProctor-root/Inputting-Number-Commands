public class Paycheck {
	private double money;
	private double time;

	public Paycheck(double wage, double hoursWorked) {
		money = wage;
		time = hoursWorked;
	}
	public double getPay() {
		double pay = 0.0;
		if(time > 40.0) {
			pay = (40 * money) + ((time - 40) * (money *  1.5));
		}
		else {
			pay = money * time;
		}
		return pay;
	}
} 