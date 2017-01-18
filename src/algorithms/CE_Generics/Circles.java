package algorithms.CE_Generics;

import java.util.Arrays;

public class Circles implements Comparable{
	int radius; 
	
	public Circles(int r) {
		radius = r;
	}
	
	
	public static void main(String[] args) {
		Circles[] myCircleArray = {new Circles(5),
		new Circles(7), new Circles(4), new Circles(99),
		new Circles(1),	new Circles(6),
		new Circles(3), new Circles(11)};
		
		Arrays.sort(myCircleArray);
		
		for(Circles c : myCircleArray) {
			System.out.println(c.toString());
		}
	}


	@Override
	public String toString() {
		return "Circles radius =" + radius;
	}

	@Override
	public int compareTo(Object c) {
		if(this.radius > ((Circles) c).radius) {
			return 1;
		}
		else if(this.radius == ((Circles) c).radius) {
			return 0;
		}
		else return -1;
	}


	

}
