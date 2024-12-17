package learningwebsite.edu.entity;

import java.util.List;

public class Lesson {
	
	//Attribute
	private String idLesson;
	private Course course;
	private String lessonName;
	
	//Details of the lesson
	private List<LessonDetail> lessonDetails;

	public Lesson() {
		super();
	}

	public Lesson(String idLesson, Course course, String lessonName) {
		super();
		this.idLesson = idLesson;
		this.course = course;
		this.lessonName = lessonName;
	}

	public String getIdLesson() {
		return idLesson;
	}

	public void setIdLesson(String idLesson) {
		this.idLesson = idLesson;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public String getLessonName() {
		return lessonName;
	}

	public void setLessonName(String lessonName) {
		this.lessonName = lessonName;
	}

	public List<LessonDetail> getLessonDetails() {
		return lessonDetails;
	}

	public void setLessonDetails(List<LessonDetail> lessonDetails) {
		this.lessonDetails = lessonDetails;
	}
}
