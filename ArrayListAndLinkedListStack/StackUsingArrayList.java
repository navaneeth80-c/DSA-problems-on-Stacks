import java.util.ArrayList;

public class StackUsingArrayList
{
	public static class Stack
	{
		public static ArrayList<Integer> list = new ArrayList<>();
		
		
		
		
		
		public static boolean isItEmpty()
		{
				return list.size()==0;
		}
		
		
		
		
		public static int pop()
		{
			if(!isItEmpty()){
				int top = list.get(list.size()-1);
				list.remove(list.size()-1);
				return top;
			}
			return Integer.MIN_VALUE;
		}
		
		
		
		
		public static void push(int data)
		{
			list.add(data);
		}
	
	
	
	
	
	
	}
	
	
	
	public static void main(String[] args)
	{
		Stack stack = new Stack();
		stack.push(1);
		stack.push(2);
		//stack.push(3);
		stack.push(3);
		stack.push(4);
		System.out.println(stack.pop());
		System.out.println(stack.list);
		System.out.println(stack.pop());
		System.out.println(stack.list);
		System.out.println(stack.pop());
		System.out.println(stack.list);
		System.out.println(stack.pop());
		System.out.println(stack.list);
		System.out.println(stack.pop());
		System.out.println(stack.list);
		System.out.println(stack.pop());
		System.out.println(stack.list);
		System.out.println(stack.pop());
		System.out.println(stack.list);
	}




}
