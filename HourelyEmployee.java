package opps;

public class HourelyEmployee extends Employee{
	private double  hourlyRate;
	private int numberOfHours;
	
	public HourelyEmployee(int id, String name,double  hourlyRate,
	 int numberOfHours ) {
		super(id, name);
		this.hourlyRate=hourlyRate;
		this.numberOfHours=numberOfHours;
	}

	@Override
	public String toString() {
		return super.toString()+
				"HourlyEmployee [hourlyRate=" + hourlyRate + ", "
				+ "numberOfHours=" + numberOfHours + "]";
	}

	@Override
	public double getPayment() {
		return hourlyRate*numberOfHours;
	}
	
	
	
}
