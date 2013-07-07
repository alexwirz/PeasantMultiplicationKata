package org.lxwrz;
import junit.framework.Assert;
import org.junit.Test;

public class RussianPeasantMultiplicationTests {

	@Test
	public void mul_TwoAndTwo_Four() {
		int result = RussianPeasantMultiplication.mul (2, 2);
		Assert.assertEquals(4, result);
	}

	@Test
	public void mul_TwoAndTree_Six () {
		int result = RussianPeasantMultiplication.mul(2, 3);
		Assert.assertEquals(6, result);
	}
	
	@Test
	public void mul_ThreeAndThree_Nine () {
		int result = RussianPeasantMultiplication.mul(3, 3);
		Assert.assertEquals(9, result);
	}
	
	@Test
	public void mul_10And10_100 () {
		int result = RussianPeasantMultiplication.mul(10, 10);
		Assert.assertEquals(100, result);
	}
	
	@Test
	public void mull_47And42_1974 () {
		int result = RussianPeasantMultiplication.mul(47, 42);
		Assert.assertEquals(1974, result);
	}
	
	@Test
	public void mull_OneAndOne_One () {
		int result = RussianPeasantMultiplication.mul (1, 1);
		Assert.assertEquals(1, result);
	}
}
