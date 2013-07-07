package org.lxwrz;
import junit.framework.Assert;
import org.junit.Test;

public class RussianPeasantMultiplicationTests {

	@Test
	public void Mul_TwoAndTwo_Four() {
		int result = RussianPeasantMultiplication.Mul (2, 2);
		Assert.assertEquals(4, result);
	}

	@Test
	public void Mul_TwoAndTree_Six () {
		int result = RussianPeasantMultiplication.Mul(2, 3);
		Assert.assertEquals(6, result);
	}
	
	@Test
	public void Mul_ThreeAndThree_Nine () {
		int result = RussianPeasantMultiplication.Mul(3, 3);
		Assert.assertEquals(9, result);
	}
	
	@Test
	public void Mul_10And10_100 () {
		int result = RussianPeasantMultiplication.Mul(10, 10);
		Assert.assertEquals(100, result);
	}
	
	@Test
	public void Mull_47And42_1974 () {
		int result = RussianPeasantMultiplication.Mul(47, 42);
		Assert.assertEquals(1974, result);
	}
	
	@Test
	public void Mull_OneAndOne_One () {
		int result = RussianPeasantMultiplication.Mul (1, 1);
		Assert.assertEquals(1, result);
	}
}
