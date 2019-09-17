package inputoutput_operations;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;





public class CountOfWords {

	public static void main(String[] args)throws FileNotFoundException,IOException {
		
		BufferedReader br=new BufferedReader(new FileReader("inputfile.txt"));
		Map<String,Integer> m=new HashMap<>();
		String line=br.readLine();
		while(line!=null) {
			if(!line.trim().equals("")) {
			String[] word=line.split(" ");
			for(String w:word) {
				
				if(m.containsKey(w)){
					m.put(w, m.get(w)+1);
				}else {
					m.put(w, 1);
				}
			}
			}
			line=br.readLine();
		}
		
Map<String,Integer> hmap=new TreeMap<>(m);
     Set<String> keys=hmap.keySet();
     Iterator<String> it=keys.iterator();
     while(it.hasNext()) {
    	 String key=(String)it.next();
    	 int value=(Integer)hmap.get(key);
    	 System.out.println(key+" : "+value);
    	 
     }
     br.close();
	}

}
