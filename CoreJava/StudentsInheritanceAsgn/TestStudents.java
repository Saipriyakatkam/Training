
public class TestStudents {

	public static boolean search(Student[] students,Student student)
	 {
		for(Student s:students)
		{
			if(s.getClass()==student.getClass())
			{
			if(s.equals(student))
				return true;
			}
		}
		return false;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Step1
		Student[] stud=new Student[7];
		stud[0]=new EnggStudent(524,"Priya","GCTC","CSE");
		stud[1]=new EnggStudent(589, "Sai", "VNR", "ECE");
		stud[2]=new EnggStudent(876,"Ravi","MLR","CE");
		stud[3]=new BscStudent(345,"Riya","GRRR","BCom");
		stud[4]=new BscStudent(899,"Rita","GCTC","BArch");
		stud[5]=new CommerceStudent(456,"Raju","MVR","CA");
		stud[6]=new CommerceStudent(789,"Rose","CMR","ACCOUNTS");
		
		//display
		for(Student s:stud)
		{
			System.out.println(s.toString());
			
		}
		
		//Step2
		boolean val;
		Student cs=new CommerceStudent(789,"Rose","CMR","ACCOUNTS");
		//System.out.println(cs.toString());
		val=search(stud, cs);
		if(val==true)
			System.out.println("Student Available");
		else
			System.out.println("Student Not Available");
		
		
		Student es=new EnggStudent(523,"Swathi","FDI","ME");
		val=search(stud, es);
		if(val==true)
			System.out.println("Student Available");
		else
			System.out.println("Student Not  Available");
		
		
		 

	}

}
