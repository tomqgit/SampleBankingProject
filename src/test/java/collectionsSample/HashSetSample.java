package collectionsSample;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetSample {
	HashSet NumberSet = new HashSet();
	public Object NumberSet() {
		
		NumberSet.add(10);
		NumberSet.add(100);
		NumberSet.add(1000);
		return NumberSet;
	}

	public static void main(String[] args) {
		
		HashSetSample HSS = new HashSetSample();
		HashSet hs = new HashSet(100,(float) 1.99);
		HashSet hs1 = new HashSet();
		
		hs.add(123);
		hs.add("Welcome to the Hash Set");
		hs.add(true);
		hs.add(false);
		hs.add('z');
		hs.add(12.3);
		hs.add(null);
		
		System.out.println(hs);
		System.out.println(hs.remove(null));
		System.out.println(hs);
		boolean a = hs.contains('z');
		System.out.println(a);
		System.out.println(hs.isEmpty());
		System.out.println(hs1.isEmpty());
		System.out.println("---");
		for (Object O:hs) {
			
			System.out.println(O);
		}
		hs.addAll(HSS.NumberSet);
		System.out.println("---");
		Iterator it = hs.iterator();
		while(it.hasNext())
		{
			
			System.out.println(it.next());
		}
		
		System.out.println("---");
		
          System.out.println(HSS.NumberSet());
          hs.addAll(HSS.NumberSet);
          System.out.println(hs);
          
          
	}

}
