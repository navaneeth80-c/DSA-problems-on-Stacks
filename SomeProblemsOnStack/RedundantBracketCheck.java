import java.util.*;

public class RedundantBracketCheck
{
public static void main(String[] args)
{
String str1 ="((a+b)+(a+b))";
System.out.println(isItOkay(str1));
	
}

// wrong
/*
public static boolean redundantCheck(String str)
{
	Stack<Character> stack = new Stack<>();
	
	int count = 0; 
	for(int i=0;i<str.length();i++)
	{
		if(str.charAt(i)!=')')
		{
		stack.push(str.charAt(i));
		
		
		}else if(str.charAt(i) == ')'){
		count =0;
			while(stack.peek()!='(')
			{
				stack.pop();
				count++;
			}
			if(count <1)
		{
			return true;
		}
			
		}
		
		
	}
	
	return false;
}
*/
public static boolean isItValid(String str)
{
	Stack <Character> s = new Stack<>();
	//int count =0;
	
	for(int i=0;i< str.length();i++)
	{
		if(str.charAt(i)==')')
		{
			int count =0;
			
			while(s.pop()!='(')
			{
				count++;
			}
			
			if(count <1)
			{
				return true;
			}
		}else{
			s.push(str.charAt(i));
		}
	}
	return false;
}



public static  boolean isItOkay(String str1)
{
	Stack<Character> s = new Stack<>();
	int count;
	
	for(int i=0;i<str1.length();i++)
	{
		if(str1.charAt(i) == ')')
		{
			count =0;
			
			while(s.pop() !='(')
			{
				count++;
			}
			
			if(count < 1)
			{
				return false ;
 // its not okay means it have a extra bracket that inbetween there is no other character like this ()  if anything is in between the bracket then it wont be zero means (a+b) in this case stack will contains all the char upto ) when ) comes it will pop everthing and increments the count  untill ( comes if  only like this () then count won't become zero and the it won't return true. 
			}
		}else{
			s.push(str1.charAt(i));
			}
	}
	return true;
// means it won't contain extra things.
}
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


