import java.util.*;

public class PushAtTheEnd
{
	public static void main(String[] args)
	{
		
		Stack <Integer> stack = new Stack <>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		System.out.println(stack);
		pushToTheLast(stack,5);
		System.out.println(stack);
	}
	
	public static void pushToTheLast(Stack<Integer> s,int num)
	{
		if(s.isEmpty())		//base condetion for stack...
		{
			s.push(num);
			return;
		}
		int top = s.pop();
		pushToTheLast(s,num);
		s.push(top);
	}
}
