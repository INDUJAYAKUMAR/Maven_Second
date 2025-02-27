package collection_Eg;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_Eg {

	public static void main(String[] args) {
		ArrayList<String>ar = new ArrayList<String>();
		ar.add ("Indu");
		ar.add ("Anna");
		ar.add ("Rose");
		Iterator<String> ar1 = ar.iterator();// stores values in ar to ar1
		while(ar1.hasNext())//will check whether ar1 has value or not
		{
			System.out.println((ar1.next()));//will print element one by one
		}
		
		ar1.remove();// to remove the last element of the list
		System.out.println(ar);
		

	}

}
