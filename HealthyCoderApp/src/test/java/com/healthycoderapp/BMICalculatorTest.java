package com.healthycoderapp;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class BMICalculatorTest {

	@Test
	void should_ReturnTrue_When_DietRecommended() {
	
	//given
	double weight = 89.0;
	double height=1.72;
	
	//when
	boolean recommended = BMICalculator.isDietRecommended(weight, height);
	
	//then
  assertTrue(recommended);
  

}

	@Test
	void should_ReturnTrue_When_DietNotRecommended() {
	
	//given
	double weight = 50.0;
	double height=1.92;
	
	//when
	boolean recommended = BMICalculator.isDietRecommended(weight, height);
	
	//then
  assertFalse(recommended);
  

}

	@Test
	void should_ReturCorrectBMIScoreArray_When_CoderListNotEmpty() {
	
	//given
	List<Coder> coders = new ArrayList<>();
	coders.add(new Coder(1.80, 60.0));
	coders.add(new Coder(1.82, 98.0));
	coders.add(new Coder(1.82, 64.7));
	double[] expected = {18.52, 29.22, 2.99};
	
	//when
double[] bmiScores = BMICalculator.getBMIScores(coders);	
	//then
   assertEquals(expected, bmiScores);

}



}
