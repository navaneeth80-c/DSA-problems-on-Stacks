import java.util.*;
public class ReverseAStack
{
	public static void main(String[] args)
	{
		Stack<Integer> s = new Stack<>();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		System.out.println(s);
		reverseTheStack(s);
		System.out.println(s);
		
	}
	
	public static void reverseTheStack(Stack<Integer> stack)
	{
		if(stack.isEmpty())
		{
			return;
		}
		int top = stack.pop();
		reverseTheStack(stack);
		pushAtTheBottom(stack,top);
		
		
	}
	
	public static void pushAtTheBottom(Stack<Integer> stack,int num)
	{
		if(stack.isEmpty())
		{
			stack.push(num);
			return;
		}
		int top = stack.pop();
		pushAtTheBottom(stack,num);
		stack.push(top);
	}
}
