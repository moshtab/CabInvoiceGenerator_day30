package basic.CabInvoiceServiceDay30;

public class InvoiceSummary {
	public int numOfRides;
	public double totalFare;
	public double avgFare;

	public InvoiceSummary(int noOfRides, double totalFare) {
		this.numOfRides = noOfRides;
		this.totalFare = totalFare;
		this.avgFare = this.totalFare / this.numOfRides;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InvoiceSummary other = (InvoiceSummary) obj;
		if (Double.doubleToLongBits(avgFare) != Double.doubleToLongBits(other.avgFare))
			return false;
		if (numOfRides != other.numOfRides)
			return false;
		if (Double.doubleToLongBits(totalFare) != Double.doubleToLongBits(other.totalFare))
			return false;
		return true;
	}

}
