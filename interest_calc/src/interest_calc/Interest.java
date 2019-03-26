package interest_calc;

public class Interest {
	//Simple interest method
	public double simpleInterest(int p, double r, int t){
		return (p*r*t)/100;
	}
	//Compound interest method
	public double compoundInterest(int p, double i, int t){
		//simplifying calculations for compound interest formula
		double a=Math.pow((1+(i/100)), t);
		return p*(a-1);
	}
}
