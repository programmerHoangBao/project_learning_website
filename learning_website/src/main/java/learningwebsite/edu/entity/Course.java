package learningwebsite.edu.entity;

import java.util.Date;
import java.util.List;

public class Course {
	
	//Attribute
	private String idCourse;
	private String courseName;
	private User teacher;
	private Date createDate;
	private String description;
	
	//List of students of the course
	private List<User> listStudent;
	
	public Course() {
		super();
	}

	public Course(String idCourse, String courseName, User teacher, Date createDate, String description) {
		super();
		this.idCourse = idCourse;
		this.courseName = courseName;
		this.teacher = teacher;
		this.createDate = createDate;
		this.description = description;
	}

	public String getIdCourse() {
		return idCourse;
	}

	public void setIdCourse(String idCourse) {
		this.idCourse = idCourse;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public User getTeacher() {
		return teacher;
	}

	public void setTeacher(User teacher) {
		this.teacher = teacher;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<User> getListStudent() {
		return listStudent;
	}

	public void setListStudent(List<User> listStudent) {
		this.listStudent = listStudent;
	}
}
