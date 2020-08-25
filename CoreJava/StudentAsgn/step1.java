
public class step1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student("Priya","Female",20,10,new int[]{23,85,66,97,90});
		System.out.println("Name = "+s.getName());
		System.out.println("Gender = "+s.getIdentifier());
		System.out.println("Age = "+s.getAge());
		System.out.println("Standard = "+s.getStandard());
		System.out.println("Marks:");
		for(int val:s.getMarks())
		{
			System.out.println(val);
		}
		

	}

}
