package Chapter08.DuplicateObservedData.before;

import java.awt.Frame;

public class IntervalWindow extends Frame {
	java.awt.TextField _startField;
	java.awt.TextField _endField;
	java.awt.TextField _lengthField;

	class SymFocus extends java.awt.event.FocusAdapter {
		public void focusLost(java.awt.event.FocusEvent event) {
			Object object = event.getSource();
			if (object == _startField)
				StartField_FocusLost(event);
			else if (object == _endField)
				EndField_FocusLost(event);
			else if (object == _lengthField)
				LengthField_FocusLost(event);
		}
	}

	void StartField_FocusLost(java.awt.event.FocusEvent event) {
		if(isNotInteger(_startField.getText()))
			_startField.setText("0");
		calculateLength();
	}

	void EndField_FocusLost(java.awt.event.FocusEvent event) {
		if(isNotInteger(_endField.getText()))
			_endField.setText("0");
		calculateLength();
	}

	void LengthField_FocusLost(java.awt.event.FocusEvent event) {
		if(isNotInteger(_lengthField.getText()))
			_endField.setText("0");
		calculateLength();
	}
	
	boolean isNotInteger(String text){
		try{
			Integer.parseInt(text);
			return false;
		}catch(NumberFormatException e){
			return true;
		}
	}
	
	void calculateLength(){
		try{
			int start = Integer.parseInt(_startField.getText());
			int end = Integer.parseInt(_endField.getText());
			int length = end - start;
			_lengthField.setText(String.valueOf(length));
		}catch(NumberFormatException e){
			throw new RuntimeException("잘못된 숫자 형식 에러.");
		}
	}
	
	void calculatedEnd(){
		try{
			int start = Integer.parseInt(_startField.getText());
			int length = Integer.parseInt(_lengthField.getText());
			int end = start + length;
			_endField.setText(String.valueOf(end));
		}catch(NumberFormatException e){
			throw new RuntimeException("잘못된 숫자 형식 에러.");
		}
	}
}
