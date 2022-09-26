/**
 * 
 */
package com.bridgelabz;

/**
 * @author mshub
 *
 */
public class IntegerGenericMaxUC1 {

	/**
	 * @param args
	 */
	
public static Integer testMaximum(Integer x,Integer y,Integer z) {
	Integer max=x;
	if(y.compareTo(max)>0) {
		max=y;
	if (z.compareTo(max)>0) {
		max=z;
	}}
	return max;
	}
	
	public static void main(String[] args) {
		IntegerGenericMaxUC1 maximumvalue=new IntegerGenericMaxUC1();
		System.out.println(maximumvalue.testMaximum(45, 50, 60));

	}

}
