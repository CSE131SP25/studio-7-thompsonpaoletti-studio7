package studio7;

public class Fractions {
	private int numerator;
	private int denominator;

	public Fractions(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	public static int gcd(int p, int q) {
		while (q != 0) {
			int temp = q;
			q = p % q;
			p = temp;
		}
		return p;
	}
	
	public void simplify() {
		int commonFactor = gcd(this.numerator, this.denominator);
		this.numerator = this.numerator/commonFactor;
		this.denominator = this.denominator/commonFactor;
	}
	
	public Fractions fractionSum(Fractions a) {
		int newDenominator = this.denominator * a.denominator;
		int newNumerator1 = this.numerator * newDenominator / this.denominator;
		int newNumerator2 = a.numerator * newDenominator / a.denominator;
		Fractions newFraction = new Fractions((newNumerator1 + newNumerator2) , newDenominator);
		newFraction.simplify();
		return newFraction;
	}
	
	public Fractions fractionProduct(Fractions a) {
		int newDenominator = this.denominator * a.denominator;
		int newNumerator = this.numerator * a.numerator;
		Fractions newFraction = new Fractions (newNumerator, newDenominator);
		newFraction.simplify();
		return newFraction;
	}
	
	public Fractions fractionReciprocal() {
		int newDenominator = this.numerator;
		int newNumerator = this.denominator;
		Fractions newFraction = new Fractions (newNumerator, newDenominator);
		newFraction.simplify();
		return newFraction;
	}
}
