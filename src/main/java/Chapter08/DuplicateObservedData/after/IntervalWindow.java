package Chapter08.DuplicateObservedData.after;

import java.awt.Frame;
import java.util.Observable;
import java.util.Observer;

public class IntervalWindow extends Frame implements Observer{
	
	private Interval _subject;
	
	public IntervalWindow(){
		_subject = new Interval();
		_subject.addObserver(this);
		update(_subject,null);
	}
	
	java.awt.TextField _startField;
	java.awt.TextField _endField;
	java.awt.TextField _lengthField;
	
	String getEnd(){
		return _subject.getEnd();
	}
	
	void setEnd(String arg){
		_subject.setEnd(arg);
	}
	
	String getStart(){
		return _subject.getStart();
	}
	
	void setStart(String arg){
		_subject.setStart(arg);
	}
	
	String getLength(){
		return _subject.getLength();
	}
	
	void setLength(String arg){
		_subject.setLength(arg);
	}

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
		setStart(_startField.getText());
		if(isNotInteger(getStart()))
			setStart("0");
		_subject.calculateLength();
	}

	void EndField_FocusLost(java.awt.event.FocusEvent event) {
		setEnd(_endField.getText());
		if(isNotInteger(getEnd()))
			setEnd("0");
		_subject.calculateLength();
	}

	void LengthField_FocusLost(java.awt.event.FocusEvent event) {
		setLength(_lengthField.getText());
		if(isNotInteger(getLength()))
			setLength("0");
		_subject.calculateLength();
	}
	
	boolean isNotInteger(String text){
		try{
			Integer.parseInt(text);
			return false;
		}catch(NumberFormatException e){
			return true;
		}
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		_endField.setText(_subject.getEnd());
		_startField.setText(_subject.getStart());
		_lengthField.setText(_subject.getLength());
	}
}
