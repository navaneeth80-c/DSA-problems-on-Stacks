import java.util.*;

/*problem : https://www.geeksforgeeks.org/problems/stock-span-problem-1587115621/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card
*/
public class StockSpanProblem
{
	public static void main(String[] args)
	{
		int[] stockPrice = {100,80,60,70,60,75,85};
		int[] stockSpan = new int[stockPrice.length];
		stockSpan(stockPrice,stockSpan);
		printArray(stockSpan);
		
		
		
	}
	public static void printArray(int[] num)
	{
		for(int i=0;i<num.length;i++)
		{
			System.out.println(num[i]);
		}
	}
	
	public static  void stockSpan(int[] stockPrice,int[] span)
	{
		if(stockPrice.length == 0)
		{
			return;
		}
		
		Stack<Integer> stockIndex = new Stack<>();
		span[0] = 1; //beacuse stock price at the beggining is always zerow.
		stockIndex.push(0);
		for(int i=1;i<stockPrice.length;i++)
		{
			int currentStockPrice = stockPrice[i];
			while(!stockIndex.isEmpty() && currentStockPrice > stockPrice[stockIndex.peek()])
			{
				stockIndex.pop();
			}
			
			if(stockIndex.isEmpty())
			{
				span[i] = i+1;
			}else{
				span[i] =i - stockIndex.peek();
			}
			stockIndex.push(i);
		}
		
		
	} 
}
