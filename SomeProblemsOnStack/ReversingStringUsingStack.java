import java.util.*;

public class ReversingStringUsingStack
{
	public static void main(String[] args)
	{
		String str = "hello world";
		
		System.out.println(reverse(str));
	}
	
	public static String reverse(String str)
	{
		Stack<Character> s = new Stack<>();
		int index =0 ;
		while( index < str.length())
		{
			s.push(str.charAt(index++));
		}
		System.out.println(s);
		StringBuilder sb = new StringBuilder();
		while(!s.isEmpty())
		{
			sb.append(s.pop());
		}
		System.out.println(sb.toString());
		return sb.toString();
		
		
	}
}
