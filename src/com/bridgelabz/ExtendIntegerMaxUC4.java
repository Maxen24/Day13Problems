/**
 * 
 */
package com.bridgelabz;

/**
 * @author mshub
 *
 */
public class ExtendIntegerMaxUC4 {

	public static Integer testMaximum(Integer x,Integer y,Integer z, Integer a) {
		Integer max=x;
		if(y.compareTo(max)>0) {
			max=y;
		if (z.compareTo(max)>0) {
			max=z;
		}
		if (a.compareTo(max)>0) {
			max=a;
		}}
		return max;
		}
		
		public static void main(String[] args) {
			ExtendIntegerMaxUC4 maximumvalue=new ExtendIntegerMaxUC4();
			System.out.println(maximumvalue.testMaximum(45, 50, 60,100));

		}

	}
