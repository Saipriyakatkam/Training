
public class Student {

	private String name;
	private String identifier;
	private int age;
	private int standard;
	int[] marks;
	int total;
	public Student()
	{
		
	}
	/*public Student()
	{
		name="Priya";
		identifier="Female";
		age=20;
		standard=10;
		marks[0]=70;
		marks[1]=87;
		marks[2]=54;
		marks[3]=97;
		marks[4]=80;
	}*/
	public Student(String name,String identifier,int age,int standard,int[] marks)
	{
		this.name=name;
		this.identifier=identifier;
		this.age=age;
		this.standard=standard;
		this.marks=marks;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIdentifier() {
		return identifier;
	}
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getStandard() {
		return standard;
	}
	public void setStandard(int standard) {
		this.standard = standard;
	}
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
		
		


}
