/*Create a array list of Strings and then 
 * remove all the elements from the arraylist*/
package Task12;

import java.util.ArrayList;
//Create a class Arraylist
public class Q5_ArrayListDemo {

	public static void main(String[] args) {
		//Object creation of arrayList
		ArrayList<String> name=new ArrayList<String>();
		//Adding value to arrayList
		name.add("Aarav");
		name.add("Aadhvik");
		name.add("Visakan");
		name.add("Seyon");
		name.add("Latha");
		name.add("Parthi");
		name.add("Vicky");
		//Printing all the added Elements in console
		System.out.println(name);
		//To remove an element in the ArrayList
		name.remove(4);
		System.out.println(name);
		//Removing all the elements in the ArrayList
		name.clear();
		System.out.println(name);

	}

}

/* Output:
[Aarav, Aadhvik, Visakan, Seyon, Latha, Parthi, Vicky]
[Aarav, Aadhvik, Visakan, Seyon, Parthi, Vicky]
[]
*/