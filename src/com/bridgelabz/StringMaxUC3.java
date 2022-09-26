/**
 * 
 */
package com.bridgelabz;

/**
 * @author mshub
 *
 */
public class StringMaxUC3 {

	public static String testMaximum(String x,String y,String z) {
		String max=x;
		if(y.compareTo(max)>0) {
			max=y;
		if (z.compareTo(max)>0) {
			max=z;
		}}
		return max;
		}
		
		public static void main(String[] args) {
			StringMaxUC3 maximumvalue=new StringMaxUC3();
			System.out.println(maximumvalue.testMaximum("Apple","Peach" ,"Banana"));

		}

	}

