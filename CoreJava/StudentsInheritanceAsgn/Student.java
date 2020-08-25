
public class Student {

	private int rollno;
	private String name;
	private String Collegename;
	
	public Student()
	{
		
	}
	
	
	public Student(int rollno, String name, String collegename) {
		super();
		this.rollno = rollno;
		this.name = name;
		Collegename = collegename;
	}


	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCollegename() {
		return Collegename;
	}

	public void setCollegename(String collegename) {
		Collegename = collegename;
	}
	
	public String toString(String val) {
		// TODO Auto-generated method stub
		return rollno+"\t"+name+"\t"+Collegename+"\t"+val;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Student s=(Student)obj;
		return this.getRollno()==s.getRollno() &&
				this.getName().equals(s.getName()) &&
				this.getCollegename().equals(s.getCollegename());
				
	}
	
}
