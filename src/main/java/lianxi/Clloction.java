package lianxi;

import java.util.*;

public class Clloction {

	/**
	 * @param args
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Collection a=new HashSet();
		a.add("1");
		a.add('j');
		a.add(1.3);
		
		System.out.println(a);
		for(Iterator a1=a.iterator();a1.hasNext();)
		{
			System.out.println(a1.next());
		}*/
		List a2=new LinkedList(); 
		a2.add("qa");
		a2.add("q");
		a2.add("a");
		a2.add("ew");
		a2.add(2);
		System.out.println(a2);
		//a2.add(new Integer(33));
		//System.out.println(a2);
		//a2.add(2, "hah");
		
		System.out.println(a2);
		a2.set(2,"hehe");
		System.out.println(a2);
		//System.out.println(a2.get(4));
		a2.remove(0);
		System.out.println(a2);
		/*Collections.shuffle(a2);
		System.out.println(a2);
		Collections.shuffle(a2);
		System.out.println(a2);*/
		Collections.reverse(a2);
		System.out.println(a2);
		a2.remove(0);
		Collections.sort(a2);
		System.out.println(a2);
		Set<Integer> a3=new TreeSet<Integer>();
		a3.add(1);
		a3.add(4);
		a3.add(8);
		a3.add(44);
		a3.add(0);
		a3.add(22);
		System.out.println(a3);
		
		System.out.println(a3);
		Map a4=new TreeMap();
		a4.put(new Integer(1),2);
		a4.put(new Integer(2), 2);
		a4.put(new Integer(3),3);
		a4.put(new Integer(4),"aa");
		System.out.println(a4.containsKey(4));
		Stack a5=new Stack();
		a5.push(1);
		a5.push(2);
		a5.push(3);
		a5.push(4);
		a5.push(5);
		System.out.println(a5);
		a5.pop();
		System.out.println(a5);
		a5.peek();
		System.out.println(a5.peek());
	
	
	
	}

}
