public class StackUsingLinkedList 
{






	public static class Node
	{
		public int data;
		public Node nextNode;
		
		public Node(int data)
		{
			this.data = data;
			this.nextNode = null;
		}
	}
	
	
	
	
	
	
	public Node headNode = null;
	public Node tailNode = null;
	public Node tempNode = null;
	
	
	
	
	
	
	public  void push(int data)
	{
		Node newNode = new Node(data);
		if(headNode == null)
		{
			headNode = tailNode = newNode;
			newNode.nextNode = null;
			return;
		}
		newNode.nextNode = headNode ;
		headNode = newNode;
	}
	
	
	
	
	
	
	public boolean isItEmpty()
	{
		return headNode == null;
	}
	
	
	
	
	
	
	
	public int pop()
	{
		if(headNode == null)
		{
			return Integer.MIN_VALUE;
		}
	
		if(headNode.nextNode == null)
		{
			int data = headNode.data; 
			headNode = null;
			tailNode = null;
			return data;
		}
		
		
		int data = headNode.data;
		tempNode = headNode.nextNode;
		headNode.nextNode = null;
		headNode = tempNode;
		return data;
		
	}
	
	
	
	
	
	public void display()
	{
		if(!isItEmpty())
		{
			tempNode = headNode;
			System.out.print("[");
			while(tempNode != null)
			{
				System.out.print(tempNode.data);
				tempNode = tempNode.nextNode;
			}
			System.out.println("]");
		}
	}
	
	
	
	
	public static void main(String[] args)
	{
		StackUsingLinkedList  list = new StackUsingLinkedList ();
		list.push(0);
		list.push(1);
		list.push(2);
		list.push(3);
		list.push(4);
		list.push(5);
		list.display();
		list.pop();
		list.display();
	}
	
}
