package handling;

import java.util.ArrayList;

public class Que5 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList();
		
         list.add(9);
         list.add(158);
         list.add(222);
         list.add(25);
         list.add(61);
         list.add(8);
         
         System.out.println(list);
         
         list.remove(5);
         list.remove(3);
         System.out.println(list);
         
	}

}
