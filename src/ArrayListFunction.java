
/*
 * Here we are Creating an object of ArrayList class and perform the following functions:
 */
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListFunction {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// here we are creating an ArrayList object
		ArrayList<String> arrlist = new ArrayList<String>();
		// here we are Adding elements to ElementList
		// use add() method to add element
		arrlist.add("Nitish");
		arrlist.add("Vishal");
		arrlist.add("Abhishek");
		arrlist.add("Vikash");
		arrlist.add("Bhawani");

		// let us print all the elements available in list
		for (String name : arrlist) {
			System.out.println("name = " + name);
		}

		// this will print the size of this list
		int numOfElements = arrlist.size();
		System.out.println("Size of list = " + numOfElements);

		// here we are applying boolean to check the element Present in the list
		// or not
		// we are using the contain Method for checking the element present in
		// the list or not

		boolean retval = arrlist.contains("Aman");
		// here we are applying the if condition to check the element

		if (retval == true) {
			System.out.println("element Aman is contained in the list");
		} else {
			System.out.println("element Aman  is not contained in the list");
		}

		// here we are Converting the arraylist into the array
		// here we are using the toarray Method
		String[] elementListasArray = arrlist.toArray(new String[numOfElements]);
		
		System.out.println(elementListasArray[0]);

		// Here we are taking the element which i have to replace
		String replace = "Abhishek";
		int i = 0, j = 0;
		// here we are applying the iterator method to check the arraylist one
		// by one
		Iterator<String> itr = arrlist.iterator();
		while (itr.hasNext()) {
			// here i will increment
			i++;

			// here we are taking new string if the element will match
			// it will replaced by the new string
			String string = (String) itr.next();
			if (string.equals(replace)) {
				// here the previous element will be removed in the List
				itr.remove();
				j = i;
			}

		}
		// here we are adding the new element in the list
		// by the help of add method
		arrlist.add(j, "Ashutosh");
		for (String name : arrlist) {
			System.out.println(name);

		}

	}
}
