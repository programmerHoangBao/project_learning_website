package learningwebsite.edu.entity;

public class Answer {
	
	//Attribute
	private String idAnswer;
	private OptionsQuestion answer;
	
	public Answer() {
		super();
	}

	public Answer(String idAnswer, OptionsQuestion answer) {
		super();
		this.idAnswer = idAnswer;
		this.answer = answer;
	}

	public String getIdAnswer() {
		return idAnswer;
	}

	public void setIdAnswer(String idAnswer) {
		this.idAnswer = idAnswer;
	}

	public OptionsQuestion getAnswer() {
		return answer;
	}

	public void setAnswer(OptionsQuestion answer) {
		this.answer = answer;
	}
}
