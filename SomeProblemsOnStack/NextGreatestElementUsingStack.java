import java.util.*;

public class NextGreatestElementUsingStack
{

public static void main(String[] args)
{
	int[] num = {6,8,0,1,3};
	int[] num1 = new int[num.length];
	greatestElement(num,num1);
	printArray(num1);

}

public static void greatestElement(int[] a1,int[] a2)
{
	Stack<Integer> s = new Stack<>();
	//s.push(a1[a1.length -1]);
	for(int i=a1.length -1 ; i>=0 ; i--){
	while((!s.isEmpty()) && a1[s.peek()] <= a1[i]){ 
		s.pop();
	}
	if(!s.isEmpty())
	{
		a2[i] = a1[s.peek()];
	}else
	{
		a2[i] = -1;
	}
	
	s.push(i);
	}
	
}

public static void printArray(int[] num)
{
	for(int i=0;i<num.length;i++)
	{
		System.out.print(num[i]);
	}
}
}
