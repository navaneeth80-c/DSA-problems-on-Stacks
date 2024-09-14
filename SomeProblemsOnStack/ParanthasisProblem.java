import java.util.*;

public class ParanthasisProblem
{
	public static void main(String[] args)
	{
		String str = "{([<>])}";
		System.out.println(isValid(str));
	}
	
	public static boolean isValid(String str)
	{
		if(str.isEmpty())
		{
			return false;
		}
		Stack<Character> s = new Stack<>();
		for(int i=0;i<str.length();i++)
		{
			if((str.charAt(i)=='{') ||(str.charAt(i)=='[') || (str.charAt(i)=='(' )|| (str.charAt(i)=='<'))
			{
				s.push(str.charAt(i));
			}else
			{
				if(s.isEmpty())
				{
					return false;
				}
				if((str.charAt(i)=='}' && s.peek()=='{')|| str.charAt(i)=='>' && s.peek()=='<'|| str.charAt(i)==']' && s.peek()=='[' || str.charAt(i)==')' && s.peek()=='(')
				{
					s.pop();
				
				}else{
					return false;
				}
			}
			
		
	}
	return true;
	}
	
}
/*
import java.util.Stack;

public class ParanthasisProblem {
    public static void main(String[] args) {
        String str = "{([<>])}";
        System.out.println(isValid(str));  // This should print true
    }
    
    public static boolean isValid(String str) {
        if(str.isEmpty()) {
            return false;
        }
        Stack<Character> s = new Stack<>();
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c == '{' || c == '[' || c == '(' || c == '<') {
                s.push(c);
            } else {
                if(s.isEmpty()) {
                    return false;
                }
                char top = s.peek();
                if((c == '}' && top == '{') || 
                   (c == '>' && top == '<') || 
                   (c == ']' && top == '[') || 
                   (c == ')' && top == '(')) {
                    s.pop();
                } else {
                    return false;
                }
            }
        }
        return s.isEmpty();
    }
}
*/

