CREATE DATABASE LearningWebsite;
USE LearningWebsite;

-- Quan hệ người dùng
CREATE TABLE Users(
	id_user CHAR(6) PRIMARY KEY,
    username VARCHAR(100) NOT NULL,
    password_user VARCHAR(100) NOT NULL,
    email VARCHAR(150) NOT NULL,
    full_name VARCHAR(150) NOT NULL,
    sign_up_date DATETIME NOT NULL,
    role_user VARCHAR(20) NOT NULL,
    image_url VARCHAR(500) NOT NULL,
    CONSTRAINT CHK_ROLE_USER CHECK (role_user in ("ADMIN", "TEACHER", "STUDENT"))
);

-- Quan hệ khóa học
CREATE TABLE Course(
	id_course CHAR(6) PRIMARY KEY,
    course_name VARCHAR(150) NOT NULL,
	id_teacher CHAR(6) NOT NULL,
    create_date DATE NOT NULL,
    description_courses VARCHAR(1000) NOT NULL,
    CONSTRAINT FK_Teacher_Courses FOREIGN KEY(id_teacher) REFERENCES Users(id_user)
);

-- Quan hệ danh sách học viên của khóa học
CREATE TABLE List_Student(
    id_student CHAR(6) NOT NULL,
    id_course CHAR(6) NOT NULL,
    CONSTRAINT PK_List_Student PRIMARY KEY(id_student, id_course),
    CONSTRAINT FK_List_Student FOREIGN KEY(id_student) REFERENCES Users(id_user),
    CONSTRAINT FK_Course_Of_List_Student FOREIGN KEY(id_course) REFERENCES Course(id_course)
);

-- Quan hệ bài học 
CREATE TABLE Lesson(
	id_lesson CHAR(6) PRIMARY KEY,
    id_course CHAR(6) NOT NULL,
    lesson_name VARCHAR(250) NOT NULL,
    CONSTRAINT FK_Lesson_Course FOREIGN KEY(id_course) REFERENCES Course(id_course)
);

-- Quan hệ chi tiết bài học
CREATE TABLE Lesson_Detail(
	id_lesson_detail CHAR(6) PRIMARY KEY,
    id_lesson CHAR(6) NOT NULL,
    file_path VARCHAR(250) NOT NULL,
    CONSTRAINT FK_Lesson_Detail FOREIGN KEY(id_lesson) REFERENCES Lesson(id_lesson)
);

-- Quan hệ loại câu hỏi
CREATE TABLE Question_Type(
	id_question_type CHAR(6) PRIMARY KEY,
    question_type_name VARCHAR(100) NOT NULL
);

-- Quan hệ câu hỏi
CREATE TABLE Question(
	id_question CHAR(6) PRIMARY KEY,
    id_question_type CHAR(6) NOT NULL,
	id_lesson CHAR(6) NOT NULL,
    texts VARCHAR(1000), -- văn bản
    image_url VARCHAR(500), -- hình ảnh
    sound_url VARCHAR(500), -- âm thanh
    video_url VARCHAR(500), -- video
    CONSTRAINT FK_Question_Type FOREIGN KEY(id_question_type) REFERENCES Question_Type(id_question_type),
    CONSTRAINT FK_Question_Lesson FOREIGN KEY(id_lesson) REFERENCES Lesson(id_lesson)
);

-- Quan hệ phương án chọn cho câu hỏi
CREATE TABLE Options_Question(
	id_option CHAR(6) PRIMARY KEY,
    id_question CHAR(6) NOT NULL,
    texts VARCHAR(1500) NOT NULL,
    CONSTRAINT FK_Options_Question FOREIGN KEY(id_question) REFERENCES Question(id_question)
);

-- Quan hệ đáp án
CREATE TABLE Answer(
	id_answer CHAR(6) PRIMARY KEY,
    id_oprion CHAR(6) NOT NULL,
    CONSTRAINT FK_Option_Answer FOREIGN KEY(id_option) REFERENCES Options_Question(id_option)
);

-- Quan hệ bài kiểm tra
CREATE TABLE Test(
	id_test CHAR(6) PRIMARY KEY,
    id_course CHAR(6) NOT NULL,
    number_of_question INT NOT NULL,
    start_time DATETIME NOT NULL,
    end_time DATETIME NOT NULL,
    CONSTRAINT FK_Test_Course FOREIGN KEY(id_course) REFERENCES Course(id_course)
);

-- Quan hệ chi tiết bài kiểm tra
CREATE TABLE Test_Detail(
    id_test CHAR(6) NOT NULL,
    id_question CHAR(6) NOT NULL,
    score DOUBLE NOT NULL,
    CONSTRAINT PK_Test_Detail PRIMARY KEY (id_test, id_question), 
    CONSTRAINT FK_Test_Detail FOREIGN KEY(id_test) REFERENCES Test(id_test),
    CONSTRAINT FK_Test_Question FOREIGN KEY(id_question) REFERENCES Question(id_question)
);