
public class step4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentManipulation sm=new StudentManipulation();
		Student[] students=new Student[4];
		Student studmax=null;
		//int [] total=new int[] {0,0,0,0};
		students=sm.createStudents();
		
		for(Student s:students)
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
		int total;
		for(int i=0;i<4;i++)
		{
			total=sm.total(students[i]);
			students[i].setTotal(total);
			System.out.println(students[i].getName()+" Marks = "+students[i].getTotal());
		}
		
		studmax=sm.findMax(students);
		System.out.println("Maximun Marks = "+studmax.getName());
		
		
		
	}

}
