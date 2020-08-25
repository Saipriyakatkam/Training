
public class CommerceStudent extends Student {

	private String majorSub;

	
	public CommerceStudent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CommerceStudent(int rollno, String name, String collegename,String majorSub) {
		super(rollno, name, collegename);
		this.majorSub = majorSub;

		// TODO Auto-generated constructor stub
	}
	

	public String getMajorSub() {
		return majorSub;
	}

	public void setMajorSub(String majorSub) {
		this.majorSub = majorSub;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString(this.majorSub);
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		CommerceStudent s=(CommerceStudent)obj;
	return this.getRollno()==s.getRollno() &&
			this.getName().equals(s.getName()) &&
			this.getCollegename().equals(s.getCollegename()) &&
			this.getMajorSub().equals(s.getMajorSub());
	}
	
}
