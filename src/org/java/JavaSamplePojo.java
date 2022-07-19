package org.java;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class JavaSamplePojo {

	public static void main(String[] args) {
//		JavaSample s=new JavaSample();
//		s.setUsername("Rams");
//		String user=s.getUsername();
//		System.out.println(user);
//	}
//	
	
		
	Map<String,Integer>m=new HashMap();
	
	m.put("GT",18);
	m.put(null, 60);
	m.put("CSK", 60);
	m.put("CSK", null);
	m.put(null, null);
	m.put(null, null);
	m.put(null, null);
	
	System.out.println(m);
	
	Set<Entry<String,Integer>> ens=m.entrySet();
	
	for(Entry<String,Integer> e:ens)
	{
		System.out.println(e);
	}
	}
	
	
	
}
