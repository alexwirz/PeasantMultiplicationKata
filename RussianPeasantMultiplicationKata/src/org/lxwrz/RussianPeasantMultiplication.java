package org.lxwrz;

import java.util.ArrayList;
import java.util.List;

public class RussianPeasantMultiplication {
	public static int Mul(int i, int j) {
		List<Integer> rightSide = new ArrayList<Integer> ();
		peasantMul(i, j, rightSide);		
		return sum (rightSide);
	}

	private static void peasantMul(int i, int j, List<Integer> rightSide) {
		int leftSide = i;
		int temp = j;
		while (leftSide > 0) {
			if (leftSide % 2 != 0) {
				rightSide.add(temp);
			}
			leftSide /= 2;
			temp *= 2;
		}
	}
	
	private static int sum (List<Integer> list) {
		int sum = 0;
		for (int i : list) {
			sum += i;
		}
		
		return sum;
	}
}
