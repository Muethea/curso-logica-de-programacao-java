package exercios;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class prova {

	public static void main(String[] args) {
		ArrayList<Integer> n1 = new ArrayList<>();
		ArrayList<Integer> n2 = new ArrayList<>();
		n1.add(4);
		n1.add(10);
		n1.add(1);
		n1.add(3);
		n1.add(22);
		n2.add(12);
		n2.add(7);
		n2.add(15);
		n2.add(2);
		n2.add(5);
		n1.addAll(n2);
		Collections.sort(n1);
		System.out.println(n1);

	}
}
