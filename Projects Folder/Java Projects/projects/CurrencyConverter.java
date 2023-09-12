package projects;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class CurrencyConverter extends JFrame{
	private JLabel amount, curr1, curr2, result;
	private JTextField amountField;
	private JComboBox<String> curr1_box, curr2_box;
	private JButton convert;
	private DecimalFormat format = new DecimalFormat("#,##0.00");
	
	private final String[] currency = {"USD", "EUR", "JPY", "GBP", "CAD", "AUD", "CHF", "CNY", "INR"};
	private double[] rates = {1.00, 0.84, 109.65, 0.72, 1.27, 1.30, 0.92, 6.47, 87.14};
	
	public CurrencyConverter() {
		setTitle("Java Currency Converter");
		setLayout(new GridLayout(4, 2));
		amount = new JLabel("Amount: ");
		add(amount);
		
		amountField = new JTextField();
		add(amountField);
		
		curr1 = new JLabel("Currency 1: ");
		add(curr1);
		curr1_box = new JComboBox<>(currency);
		add(curr1_box);
		
		curr2 = new JLabel("Currency 2: ");
		add(curr2);
		curr2_box = new JComboBox<>(currency);
		add(curr2_box);
		
		convert = new JButton("Convert Currencies");
		add(convert);
		
		result = new JLabel();
		add(result);
	
	convert.addActionListener(new ActionListener() {
		@Override
		public void action(ActionEvent e) {
			try {
				double total = Double.parseDouble(amount.getText());
				String curr_1 = (String)curr1_box.getSelectedItem();
				String curr_2 = (String)curr2_box.getSelectedItem();
				double exchange = rates[getIndex(curr_2)] / rates[getIndex(curr_1)];
				double output = total * exchange;
				result.setText(format.format(output) + " " + curr_2);
			}
			catch (Exception ex){
				result.setText("Invalid Input");
			}
		}
	});
	setSize(300, 200);
	setVisible(true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

	private int getIndex(String curr) {
		for (int i = 0; i < currency.length; i++) {
			if (curr.equals(currency[i])) {
				return 1;
		}
	}
		return -1;
}
	
	public static void main(String[] args) {
		new CurrencyConverter();
	}

}
