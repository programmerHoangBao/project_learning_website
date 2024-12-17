package learningwebsite.edu.entity;

public class TestDetail {
	
	//Attribute
	private Test test;
	private Question question;
	private double score;
	
	public TestDetail() {
		super();
	}

	public TestDetail(Test test, Question question, double score) {
		super();
		this.test = test;
		this.question = question;
		this.score = score;
	}

	public Test getTest() {
		return test;
	}

	public void setTest(Test test) {
		this.test = test;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}
}
