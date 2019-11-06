package com.class10;

public class ExampleDouble {

	public static void main(String[] args) {
		// create an array to store 5 double  values, print all in 1 line
		double[] num=new double[5];
		double[] d= {1.2,1.3,1.4,1.5,1.6};
		//System.out.println(x);
		num[0]=1.2;
		num[1]=1.3;	
		num[2]=1.4;
		num[3]=1.5;
		num[4]=1.6;
		int size1=num.length;
		for(int i=0; i<=size1; i++) {
			System.out.print(num[i]+" ");
		}
	}

}
