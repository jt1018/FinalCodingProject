package app.controller;

import app.StudentCalc;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;


public class LoanCalcViewController implements Initializable  {

	private StudentCalc SC = null;
	
	@FXML
	private TextField LoanAmount;

	@FXML 
	private TextField InterestRate;
	
	@FXML 
	private TextField NbrOfYears;
	
	@FXML
	private Label lblTotalPayments;
	
	@FXML
	private DatePicker PaymentStartDate;
	
	@FXML
	private TextField AdditionalPaymentAmount;
	
	@FXML
	private Label lblTotalInterestPayments;
	
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
	}

	public void setMainApp(StudentCalc sc) {
		this.SC = sc;
	}
	
	/**
	 * btnCalcLoan - Fire this event when the button clicks
	 * 
	 * @version 1.0
	 * @param event
	 */
	@FXML
	private void btnCalcLoan(ActionEvent event) {

		System.out.println("Initial Loan Amount: $" + LoanAmount.getText());
		double dLoanAmount = Double.parseDouble(LoanAmount.getText());
		System.out.println("Amount: " + dLoanAmount);	
		
		System.out.println("Term of Loan: " + NbrOfYears.getText() + " years");
		lblTotalPayments.setText("123");
		
		LocalDate localDate = PaymentStartDate.getValue();
	 
		System.out.println("Payment begins on " + localDate);
	}
}