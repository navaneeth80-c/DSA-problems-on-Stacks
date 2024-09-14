import java.util.*;

public class StackFromCollectionFrameWork
{
	public static void main(String[] args)
	{
		Stack<Integer> stack = new Stack<>();
		stack.push(0);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		System.out.println(stack);
		System.out.println(stack.isEmpty());
		System.out.println(stack.pop());
	}
}
