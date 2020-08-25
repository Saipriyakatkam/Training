
public class EnggStudent extends Student {

	private String stream;

	public EnggStudent()
	{
		
	}
	
	public EnggStudent(int rollno, String name, String collegename,String stream) {
		super(rollno, name, collegename);
		this.stream = stream;
		// TODO Auto-generated constructor stub
	}

		public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString(this.stream);
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		EnggStudent s=(EnggStudent)obj;
		return this.getRollno()==s.getRollno() &&
				this.getName().equals(s.getName()) &&
				this.getCollegename().equals(s.getCollegename()) &&
				this.getStream().equals(s.getStream());
	}
	
}
