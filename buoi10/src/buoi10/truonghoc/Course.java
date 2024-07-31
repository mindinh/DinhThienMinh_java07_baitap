package buoi10.truonghoc;

public class Course {
	private String courseName;
	private String courseCode;
	private Teacher teacher;
	
	public Course(String name, String code) {
		this.courseName = name;
		this.courseCode = code;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseCode() {
		return courseCode;
	}
	
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	
	public Teacher getTeacher() {
		return teacher;
	}
	
	public void assignTeacher(Teacher t) {
		this.teacher = t;
	}
	
	public void displayInfo() {
		System.out.println("Course name " + this.courseName + " code " + this.courseCode + 
				" Teacher " + (this.teacher != null ? teacher.getName() : "unassigned"));
	}
	
}
