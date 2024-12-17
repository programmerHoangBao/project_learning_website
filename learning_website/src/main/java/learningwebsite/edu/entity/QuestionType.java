package learningwebsite.edu.entity;

public class QuestionType {
	//Attribute
	private String idQuestionType;
	private String typeName;
	
	public QuestionType() {
		super();
	}

	public QuestionType(String idQuestionType, String typeName) {
		super();
		this.idQuestionType = idQuestionType;
		this.typeName = typeName;
	}

	public String getIdQuestionType() {
		return idQuestionType;
	}

	public void setIdQuestionType(String idQuestionType) {
		this.idQuestionType = idQuestionType;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
}
