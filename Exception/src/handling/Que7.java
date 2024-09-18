package handling;


import java.util.ArrayList;
import java.util.List;


public class Que7 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(789);
		list.add(897);
		list.add(581);
		list.add(580);
		System.out.println("Before Coverting: " +list);
		Integer[]intArray = new Integer[list.size()];
		list.toArray(intArray);
		for (Integer integer : intArray) {
			System.out.println("After converting :" +integer);
		}
		

	}

}
