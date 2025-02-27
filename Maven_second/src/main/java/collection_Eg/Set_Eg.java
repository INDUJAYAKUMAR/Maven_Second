package collection_Eg;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Set_Eg {

	public static void main(String[] args) {
		HashSet<String> ar = new HashSet<String>();
			{
			ar.add("rose");
			ar.add("jasmine");
			ar.add("lilly");
			ar.add("lotus");
			
			Iterator<String>ar1 = ar.iterator();
			
			while(ar1.hasNext())
			{
				System.out.println(ar1.next());
			}
			HashSet<String> var = new HashSet<String>();
			var.add("A");
			var.add("B");
			var.add("C");
			var.add("D");
			
			var.addAll(ar);
			System.out.println(var);
			
		    var.removeAll(var);
		    System.out.println(var);
			
		    if(var.isEmpty())
		    		{
		    		System.out.println("Set is empty");
		    		}
		    else
		    {
		    	System.out.println("Set is not empty");
		    }
			}
			
			
			

	}

}
