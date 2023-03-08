package kgfb;

public class Saving extends Account implements MaintenanceCharge{

	public Saving(String accountNumber, String customerName, double balance) {
		super(accountNumber, customerName, balance);
		// TODO Auto-generated constructor stub
	}
	
	public float calcaulateMaintenaceCharge(float noOfYear) {
	int m=50;
	float maintenanceCharge = (noOfYear*m)+50;
	System.out.println("Maintenance charge for saving account:");
	return maintenanceCharge;
	}
}


