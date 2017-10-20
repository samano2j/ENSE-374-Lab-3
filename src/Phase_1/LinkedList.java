package Phase_1;

public class LinkedList {
	// private variable
	private ListElement head;
	
	// constructor
	public LinkedList ()
	{
		this.head = null;
	}
	
	public LinkedList(int item, ListElement x)
	{
		head = new ListElement(item, x);
	}
	
	//add element to head
	public void addElement(ListElement le) 
	{
		head = new ListElement(le.getData(), head);
	}
	
	//get element
	public ListElement getElement(int index) {
		int counter = 0;
		ListElement temp = head;
		
		while (counter != index) { 
			temp = temp.getNext();
			counter++; 
		}
		
		return temp; 
	}
	//delete element
	public ListElement deleteElement(int index) {
		ListElement temp = new ListElement();
		ListElement del = new ListElement();
		int counter = 0;
		
		temp = head;
		while (counter <= index ) { 
			if((counter + 1) == index ) 
			{
				temp.setNext(temp.getNext().getNext());
			} 
			else
			{
				temp = temp.getNext(); 
				
			}
			counter++; 
		}
		
		return temp;
	}
	
	//print list
	public void printLinkedListHead() 
	{	
		ListElement temp = head;
		
		if (temp != null)
		{
			while(temp != null)
			{
				System.out.println(temp.getData());
				temp = temp.getNext();
			}
		}
		else
		{
			System.out.println("The list is empty!");
		}
	}
}





















