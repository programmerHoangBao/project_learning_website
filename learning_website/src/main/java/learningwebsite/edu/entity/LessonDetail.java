package learningwebsite.edu.entity;

public class LessonDetail {
	//Attribute
	private String idLessonDetail;
	private Lesson lesson;
	private String filePath;
	
	public LessonDetail() {
		super();
	}

	public LessonDetail(String idLessonDetail, Lesson lesson, String filePath) {
		super();
		this.idLessonDetail = idLessonDetail;
		this.lesson = lesson;
		this.filePath = filePath;
	}

	public String getIdLessonDetail() {
		return idLessonDetail;
	}

	public void setIdLessonDetail(String idLessonDetail) {
		this.idLessonDetail = idLessonDetail;
	}

	public Lesson getLesson() {
		return lesson;
	}

	public void setLesson(Lesson lesson) {
		this.lesson = lesson;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
}
