package learningwebsite.edu.entity;

public class Question {
	
	//Attribute
	private String idQuestion;
	private QuestionType type;
	private Lesson lesson;
	private String text;
	private String imageUrl;
	private String soundUrl;
	private String videoUrl;
	
	public Question() {
		super();
	}

	public Question(String idQuestion, QuestionType type, Lesson lesson, String text, String imageUrl, String soundUrl,
			String videoUrl) {
		super();
		this.idQuestion = idQuestion;
		this.type = type;
		this.lesson = lesson;
		this.text = text;
		this.imageUrl = imageUrl;
		this.soundUrl = soundUrl;
		this.videoUrl = videoUrl;
	}

	public String getIdQuestion() {
		return idQuestion;
	}

	public void setIdQuestion(String idQuestion) {
		this.idQuestion = idQuestion;
	}

	public QuestionType getType() {
		return type;
	}

	public void setType(QuestionType type) {
		this.type = type;
	}

	public Lesson getLesson() {
		return lesson;
	}

	public void setLesson(Lesson lesson) {
		this.lesson = lesson;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getSoundUrl() {
		return soundUrl;
	}

	public void setSoundUrl(String soundUrl) {
		this.soundUrl = soundUrl;
	}

	public String getVideoUrl() {
		return videoUrl;
	}

	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}
}
