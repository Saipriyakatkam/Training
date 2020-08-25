
public class BscStudent extends Student {

	private String specialization;

	
	
	public BscStudent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BscStudent(int rollno, String name, String collegename,String specialization) {
		super(rollno, name, collegename);
		this.specialization = specialization;

		// TODO Auto-generated constructor stub
	}

	
	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString(this.specialization);
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		BscStudent s=(BscStudent)obj;
		return this.getRollno()==s.getRollno() &&
				this.getName().equals(s.getName()) &&
				this.getCollegename().equals(s.getCollegename()) &&
				this.getSpecialization().equals(s.getSpecialization());
	}
}
