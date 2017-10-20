package Phase_1;
import java.util.Scanner;

public class LinkedListTest {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in); // read user input
		int counter = 0;		// counter for the items
		int input = 0;		// user input
		char choice = ' '; 	// user choice input
		LinkedList list = new LinkedList();	// list

		while (choice != 'x')
		{
			// display instructions
			System.out.println("Enter a to add item");
			System.out.println("Enter d to delete item");
			System.out.println("Enter p to print list");
			System.out.println("Enter s to search item");
			System.out.println("Enter x to exit program");
			System.out.println("Insert choice: ");
			choice = in.next().charAt(0); // input
			
			if (choice == 'a') 	// add item
			{ 
					System.out.println("Insert item: ");
					input = in.nextInt();
					ListElement le = new ListElement();
					le.setData(input);
					list.addElement(le);
					counter++;
			}
			else if (choice == 'd') { // delete item
				System.out.println("Enter an index to delete:");
				input = in.nextInt();
				
				if (input > counter) 
				{
					System.out.println("The index you entered is larger than list!");
				} 
				else if (input < 0) 
				{
					System.out.println("The index you entered cannot be negative");
				} 
				else if (counter == 0) 
				{
					System.out.println("The list is empty!");
				}
				else 
				{
					ListElement delItem = new ListElement();
					delItem = list.deleteElement(input);
					System.out.print("Element " + input + ":  " + delItem.getData() + " was deleted \n");
					counter--;
				}
			}
			else if (choice == 'p') { // print item
				list.printLinkedListHead();
			}
			else if (choice == 's') { // search item
				System.out.println("Enter an index to get:");
				input = in.nextInt();
				
				if (input > counter) 
				{
					System.out.println("The index you entered is larger than the list!");
				} 
				else if (input < 0) 
				{
					System.out.println("The index you entered cannot be negative");
				} 
				else 
				{
					ListElement sItem = new ListElement();
					sItem = list.getElement(input);
					System.out.print("Element " + input + ":  " + sItem.getData() + "\n");
				}
				
			}
			else if (choice == 'x') { // exit message
				System.out.println("Bye!");
			}  
			else { // for invalid inputs
				System.out.println("Invalid input");
			} 
		}

	}

}
