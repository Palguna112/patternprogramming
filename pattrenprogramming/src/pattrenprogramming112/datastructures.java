package pattrenprogramming112;

import java.util.ArrayList;

public class datastructures {

	public static void main(String[] args) {

		
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(10.0);
		al.add(true);
		al.add("hello");
		al.add(10);
		al.add(1,100);
		al.add(20);
		al.set(0, 300);
		al.add(30);
		al.add(null);
		al.add(40);
		al.addFirst(200);
		al.addLast(300);
		System.out.println(al.contains(80));
		System.out.println(al.size());
		System.out.println(al.get(0));
		System.out.println(al);
		for(int i=0;i<al.size();i++)
		{
			
		}
	}

}
