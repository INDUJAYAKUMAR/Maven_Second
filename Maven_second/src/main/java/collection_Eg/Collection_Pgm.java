package collection_Eg;

import java.util.ArrayList;

public class Collection_Pgm {

	public static void main(String[] args) {
		ArrayList<String> ar = new ArrayList<String>();//object created for class arraylist
		ar.add("A");//add method (input given without mentioning array index)
		ar.add("B");
		ar.add("C");
		ar.add("D");
		System.out.println(ar);
		
		ar.add(1, "Rose");// add (index,value) method // by giving input by mentioning the index position.
		System.out.println(ar);
		
		ar.set(2, "Jasmine");// set method - to replace and add value in arraylist.
		System.out.println(ar);
		
		ar.remove(0);//remove method- removing the value in the mentioned index position
		System.out.println(ar);
		
		if(ar.contains("C")){ // contains method - to check whether a value is present in tha arraylist.
			System.out.println("C is present");
		}
		else
		{
			System.out.println("Value is absent");
		}
		
		System.out.println("The value in the 1st position of array is : "+ar.get(1));     //get method-to get the value in the mentioned index position
		
		if (ar.isEmpty())
		{
			System.out.println("Array list is empty");//is empty method
			
		}
		else
		{
			System.out.println("Arraylist is not empty");
		}
		
		ar.removeAll(ar);//remove all method- remove all elements from the arraylist
		
		if (ar.isEmpty())
		{
			System.out.println("Array list is empty");//is empty method
			
		}
		else
		{
			System.out.println("Arraylist is not empty");
		}
		

	}

}
