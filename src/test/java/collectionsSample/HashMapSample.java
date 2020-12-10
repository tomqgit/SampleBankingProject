package collectionsSample;

import java.util.HashMap;

public class HashMapSample {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		HashMap hm1 = new HashMap();
		hm.put(101, "David");
		hm.put(102, "Zach");
		hm.put(103, "Jane");
		hm.put(104, "Kate");
		hm.put(105, "Ben");
		hm.put(106, "Hose");
		hm.put(107, "Hunt");
		hm1.put("#12", "Lee");
		hm1.put("#14", "Zach");
		hm1.put("#15", "Jane");
		hm1.put("#16", "Kate");
		hm1.put("#17", "Ben");
		hm1.put("#18", "Hose");
		hm1.put("#19", "Hunt");
		hm1.put("#20", "Don");
		
		hm1.put("#13", "Dean");
		hm.putAll(hm1);
		
		System.out.println(hm);
		System.out.println(hm1);
		System.out.println(hm.get(101));
		System.out.println(hm.size());
		
    main();
	}

	
	
	public static void main() {
		int x=10;
		System.out.println(x);
		
	}
	
}
