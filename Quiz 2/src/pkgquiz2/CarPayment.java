package pkgquiz2;

public class CarPayment {
	double CarCost;
	double interestRate;
	int lengthofLoan;
	double Downpayment;
	double Principal;
	

	public static void main(String[] args) {
	}

	
	public CarPayment(double carCost, double interestRate, int lengthofLoan, double downpayment, double principal) {
		super();
		CarCost = carCost;
		this.interestRate = interestRate;
		this.lengthofLoan = lengthofLoan;
		Downpayment = downpayment;
		Principal = principal;
	}

	public double getCarCost() {
		return CarCost;
	}

	public void setCarCost(double carCost) {
		CarCost = carCost;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public int getLengthofLoan() {
		return lengthofLoan;
	}

	public double getDownpayment() {
		return Downpayment;
	}


	public void setDownpayment(double downpayment) {
		Downpayment = downpayment;
	}


	public double getPrincipal() {
		return Principal;
	}


	public void setPrincipal(double principal) {
		Principal = principal;
	}


	public void setLengthofLoan(int lengthofLoan) {
		this.lengthofLoan = lengthofLoan;
	}
	public double Monthlypayment() {
		int monthlypayment= (int) (this.Principal*(this.interestRate/12)*Math.pow((1+this.interestRate/12),this.lengthofLoan*12)/Math.pow((1+this.interestRate/12),this.lengthofLoan*12)-1;
	     return monthlypayment;
	}
	public double SpentOninterest() {
	  int AmountSpent=(int) ((int)(this.interestRate/12)*Math.pow((1+this.interestRate/12),this.lengthofLoan*12)/Math.pow((1+this.interestRate/12),this.lengthofLoan*12)-1)/(this.lengthofLoan*12));
	  return AmountSpent;
	}
	
	

}
