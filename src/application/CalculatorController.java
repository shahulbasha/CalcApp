package application;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class CalculatorController {

	Double data;
	int operation;
    @FXML
    private JFXButton one;

    @FXML
    private JFXButton five;

    @FXML
    private JFXButton three;

    @FXML
    private JFXButton four;

    @FXML
    private JFXButton add;

    @FXML
    private JFXButton two;

    @FXML
    private JFXButton six;

    @FXML
    private JFXButton subtract;

    @FXML
    private JFXButton seven;

    @FXML
    private JFXButton eight;

    @FXML
    private JFXButton nine;

    @FXML
    private JFXButton multiply;

    @FXML
    private JFXButton zero;

    @FXML
    private JFXButton equals;

    @FXML
    private JFXButton clear;

    @FXML
    private JFXButton divide;

    @FXML
    private TextField display;

    @FXML
    void buttonClicked(ActionEvent event) {
    	if(event.getSource()==one) {
    		display.setText(display.getText()+"1");
    	}
    	else if (event.getSource()==two) {
    		display.setText(display.getText()+"2");
		}
    	else if (event.getSource()==three) {
    		display.setText(display.getText()+"3");
		}
    	else if (event.getSource()==four) {
    		display.setText(display.getText()+"4");
		}
    	else if (event.getSource()==five) {
    		display.setText(display.getText()+"5");
		}
    	else if (event.getSource()==six) {
    		display.setText(display.getText()+"6");
		}
    	else if (event.getSource()==seven) {
    		display.setText(display.getText()+"7");
		}
    	else if (event.getSource()==eight) {
    		display.setText(display.getText()+"8");
		}
    	else if (event.getSource()==nine) {
    		display.setText(display.getText()+"9");
		}
    	else if (event.getSource()==zero) {
    		display.setText(display.getText()+"0");
		}
    	else if (event.getSource()==clear) {
    		display.clear();
		}
    	else if(event.getSource()==add && !display.getText().isEmpty()) {
    		data=Double.parseDouble(display.getText());
    		operation=1;
    		display.setText("");
    	}
    	else if(event.getSource()==subtract && !display.getText().isEmpty()) {
    		data=Double.parseDouble(display.getText());
    		operation=2;
    		display.setText("");
    	}
    	else if(event.getSource()==multiply && !display.getText().isEmpty()) {
    		data=Double.parseDouble(display.getText());
    		operation=3;
    		display.setText("");
    	}
    	else if(event.getSource()==divide && !display.getText().isEmpty()) {
    		data=Double.parseDouble(display.getText());
    		operation=4;
    		display.setText("");
    	} 
    	else if(event.getSource()==equals && !display.getText().isEmpty()) {
    		if(operation==1) {
    			data+=Double.parseDouble(display.getText());
    		}
    		if(operation==2) {
    			data-=Double.parseDouble(display.getText());
    		}
    		if(operation==3) {
    			data*=Double.parseDouble(display.getText());
    		}
    		if(operation==4) {
    			
    			try {
					data/=Double.parseDouble(display.getText());
				} catch (ArithmeticException e) {
					display.setText("Error");

				}
    		}
    		display.setText(String.valueOf(data));
    	}
    }

}
