package learningwebsite.edu.entity;

import java.util.Date;
import java.util.List;

public class Test {
	
	//Attribute
	private String idTest;
	private Course course;
	private int numberOfQuestion;
	private Date startTime;
	private Date endTime;
	
	//List of questions in the test
	private List<TestDetail> listQuestion;

	public Test() {
		super();
	}

	public Test(String idTest, Course course, int numberOfQuestion, Date startTime, Date endTime) {
		super();
		this.idTest = idTest;
		this.course = course;
		this.numberOfQuestion = numberOfQuestion;
		this.startTime = startTime;
		this.endTime = endTime;
	}

	public String getIdTest() {
		return idTest;
	}

	public void setIdTest(String idTest) {
		this.idTest = idTest;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public int getNumberOfQuestion() {
		return numberOfQuestion;
	}

	public void setNumberOfQuestion(int numberOfQuestion) {
		this.numberOfQuestion = numberOfQuestion;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public List<TestDetail> getListQuestion() {
		return listQuestion;
	}

	public void setListQuestion(List<TestDetail> listQuestion) {
		this.listQuestion = listQuestion;
	}
}
