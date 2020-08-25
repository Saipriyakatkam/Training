
public class StudentManipulation {

	Student[] createStudents()
	{
		Student [] studentsobj=new Student[4];
		studentsobj[0]=new Student("Sai","Female",19,9,new int[]{24,65,76,87,90});
		studentsobj[1]=new Student("Raju","Male",22,8,new int[]{23,85,66,97,90});
		studentsobj[2]=new Student("Ravi","Male",21,10,new int[]{0,25,36,67,50});
		studentsobj[3]=new Student("Sita","Female",10,1,new int[]{84,99,76,97,40});
	
		return studentsobj ;
	}
	int total(Student st)
	{
		int totalmarks=0;
		for(int m:st.getMarks())
		{
			totalmarks+=m;
		}
		return totalmarks;
	}
	Student findMax(Student[] students)
	{
		Student maxStud=null;
		int max=0,total1;
		for(Student stu:students)
		{
			total1=total(stu);
			
			if(max<total1)
			{
				max=total1;
				maxStud=stu;
			}
			
		}
		return maxStud;
	}
	
}
