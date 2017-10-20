package Phase_1;

public class ListElement {
	//private variables
	private ListElement next;
	private int data;
	
	//constructors
	public ListElement ()
	{
		this.data = 0; 
		this.next = null;
	}
	
	public ListElement(int item, ListElement le)
	{
		this.data = item;
		this.next = le;
	}
	
	//setters and getter
	public void setData(int data) {
		this.data = data;
	}
	
	public int getData() {
		return this.data;
	}
	
	public void setNext(ListElement next) {
		this.next = next;
	}
	
	public ListElement getNext() {
		return this.next;
	}
}
