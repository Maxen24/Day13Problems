/**
 * 
 */
package com.bridgelabz;

/**
 * @author mshub
 *
 */
public class FloatMaxUC2 {

	public static Float testMaximum(Float x,Float y,Float z) {
		Float max=x;
		if(y.compareTo(max)>0) {
			max=y;
		if (z.compareTo(max)>0) {
			max=z;
		}}
		return max;
		}
		
		public static void main(String[] args) {
			FloatMaxUC2 maximumvalue=new FloatMaxUC2();
			System.out.println(maximumvalue.testMaximum(4.4f, 5.5f, 6.6f));

		}

	}

