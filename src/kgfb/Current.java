package kgfb;

public class Current extends Account implements MaintenanceCharge{

	public Current(String accountNumber, String customerName, double balance) {
		super(accountNumber, customerName, balance);
		// TODO Auto-generated constructor stub
	}
	public float calcaulateMaintenaceCharge(float noOfYear) {
		int m=200;
		float maintenanceCharge = (noOfYear*m)+50;
		System.out.println("miantenance charge for current account");
		return maintenanceCharge;
		}

}
