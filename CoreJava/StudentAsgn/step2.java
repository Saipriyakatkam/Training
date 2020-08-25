
public class step2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student [] stud=new Student[4];
		stud[0]=new Student("Sai","Female",19,9,new int[]{24,65,76,87,90});
		stud[1]=new Student("Raju","Male",22,8,new int[]{23,85,66,97,90});
		stud[2]=new Student("Ravi","Male",21,10,new int[]{0,25,36,67,50});
		stud[3]=new Student("Sita","Female",10,1,new int[]{84,99,76,97,40});
	
	
	for(Student s:stud)
	{
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

}
