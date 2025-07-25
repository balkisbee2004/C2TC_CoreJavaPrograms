package demoprograms.packagesclass;

public class Student extends Person{
	private int sid;
	private String sname;
	private String coursename;
	
	public Student(int pid,String name,String city,int sid,  String coursename) {
		super(pid,name,city);
		this.sid = sid;
		
		this.coursename = coursename;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	@Override
	public String toString() {
		return "Student [Student id:"+super.getPid()+", Student name:"+super.getName()+", Student City:"+super.getCity()+", sid=" + sid + ", coursename=" + coursename + "]";
	}
	
	

}
