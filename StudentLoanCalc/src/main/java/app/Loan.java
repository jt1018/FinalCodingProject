package app;

import java.util.LinkedList;
import org.apache.poi.ss.formula.functions.FinanceLib;
public class Loan {
	double dLoanAmount;
	double dInterestRate;
	double iTerm;
	double dFutureValue;
	boolean bInterestCalc;
	double dExtraPayment;
	
	private LinkedList<Payment> loanPayments = new LinkedList<Payment>();
	
	public Loan(double dLoanAmount, double dInterestRate, double iTerm, double dFutureValue, boolean bInterestCalc
			,double dExtraPayment) {
		super();
	 }
	
}
	 

