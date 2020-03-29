package deafultpackage;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.fxml.FXML;


public class Processing {
	
	@FXML
	public Label result;
	private float number1 = 0;
	private float number2;
	private boolean start = true;
	private String operator = "";
	private Calc model = new Calc();
	
	@FXML
	public void processNumbers(ActionEvent event)
	{
		if(start)
		{
			result.setText("");
			start = false;
		}
		
		String value = ((Button)event.getSource()).getText();
		result.setText(result.getText()+value);
		
		
	}
	@FXML
	public void processOperators(ActionEvent event)
	{
		String value = ((Button)event.getSource()).getText();
		if(!value.contentEquals("="))
		{
			if(!operator.isEmpty())
				switch(value)
				{
				case "C":
				result.setText("");
				this.number1=0;
				this.number2=0;
				break;
			default:
				break;
				
				}
			operator = value;
			number1 = Long.parseLong(result.getText());
			result.setText("");
			return;
		}
		else {
			if(operator.isEmpty())
				return;
			number2 = Long.parseLong(result.getText());
			float output = model.calculate(number1, number2, operator);
			result.setText(String.valueOf(output));
			operator = "";
			number1 = 0;
			number2 = 0;
			start = true;
			
		}
	}
}
