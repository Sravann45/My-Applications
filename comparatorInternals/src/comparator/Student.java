package comparator;

public class Student implements Comparable<Student>{

	private Integer sid;
	private String sname;

	public Student(Integer sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + "]";
	}

	@Override
	public int compareTo(Student arg0) {
		if(this.sid>arg0.getSid()) {
			return -1;
		}else if(this.sid<arg0.getSid()) {
			return 3;
		}
		else {
			return 0;
		}
	}

}
