package learningwebsite.edu.entity;

public class OptionsQuestion {
	
	//Attribute
	private String idOption;
	private Question question;
	private String text;
	
	public OptionsQuestion() {
		super();
	}

	public OptionsQuestion(String idOption, Question question, String text) {
		super();
		this.idOption = idOption;
		this.question = question;
		this.text = text;
	}

	public String getIdOption() {
		return idOption;
	}

	public void setIdOption(String idOption) {
		this.idOption = idOption;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
