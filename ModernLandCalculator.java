package oop.polymorphism;

public class ModernLandCalculator extends LandCalculator{
	
	@Override
	public int areaOfLand(int pointA, int pointB, int pointC, int pointD) {
		int total = pointA + pointB + pointC + pointD + 1;
		return total;
		
		

		

	}

}
