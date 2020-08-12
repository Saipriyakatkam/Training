
public class Stack {
	int top=-1;
	String[] arr=new String[10];
	public static void main(String args[])
	{
		Stack s=new Stack();
		s.push("a");
		s.push("b");
		s.push("c");
		System.out.println("Printing Elements");
		s.print();
		
		System.out.println("Poped element = "+s.pop());
		System.out.println("Top Element = "+s.peek());
		System.out.println("Printing Elements");
		s.print();
		
		
	}

void push(String val)
{
	top++;
	arr[top]=val;
}
String pop()
{
	if(top==-1)
		return "No Elements";
	else
	{
		String val=arr[top];
		arr[top]="";
		top--;
		return val;
	}
	
}
String peek()
{
	return arr[top];
}
void print()
{
	for(int i=top;i>=0;i--)
	{
		System.out.println(arr[i]);
	}
		
}

}

