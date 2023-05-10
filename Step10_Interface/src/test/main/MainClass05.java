package test.main;

import java.lang.invoke.ConstantCallSite;

import test.mypac.Calc;

public class MainClass05 {

	public static void main(String[] args) {
		
		Calc add = new Calc() {
			
			@Override
			public double execute(double num1, double num2) {
				return num1 + num2;
			}
		};
		
		Calc sub = new Calc() {
			
			@Override
			public double execute(double num1, double num2) {
				return num1 - num2;
			}
		};
		
		Calc div = new Calc() {
			
			@Override
			public double execute(double num1, double num2) {
				return num1 / num2;
			}
		};
		
		div.execute(7, 2);
		sub.execute(9, 5);
		add.execute(3, 4);
		
	}

}
