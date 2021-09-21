package com.bridgelabz.LineComparision;

import java.util.Scanner;

public class LineComparision {
	//constraint to store initial x coordinate of a line
	private double xi;
	//constraint to store final x coordinate of a line
	private double xf;
	//constraint to store initial y coordinate of a line
	private double yi;
	//constraint to store final y coordinate of a line
	private double yf;
	//constraint to hold the length of line
	private double lengthOfLine;

	//constructor to initialize the constraints
	public LineComparision() {
		xi=0;
		xf=0;
		yi=0;
		yf=0;
	}


	//getter method to get the value of xi
	public double getXi() {
		return xi;
	}
	//setter method to set the value of xi
	public void setXi() {
		//taking value from user and assigning it to xi
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value for xi");
		xi=sc.nextDouble();
	}
	//getter method to get the value of xf
	public double getXf() {
		return xf;
	}
	//setter method to set the value for xf
	public void setXf() {
		//taking value from user and assigning it to xf
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value for xf");
		xf=sc.nextDouble();

	}
	//getter method to get the value of yi
	public double getYi() {
		return yi;
	}
	//setter method to set the value of yi
	public void setYi() {
		//taking value from user and assigning it to yi
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value for yi");
		yi=sc.nextDouble();

	}
	//getter method to get the value of yf
	public double getYf() {
		return yf;
	}
	//setter method to set the value for yf
	public void setYf() {
		//taking value from user and assigning it to yf
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value for yf");
		yf=sc.nextDouble();


	}

	//method to calculate the length of the line
	public void lengthOfLine() {
		//logic to calculate the length of line
		lengthOfLine = (double)(Math.sqrt(Math.pow((xf-xi),2)+ Math.pow((yf-yi),2)));

	}
	//method to print the length of line
	public void display() {
		System.out.println("length of line is : "+lengthOfLine);
	}

	//method to print equality of two lines on the basis of end points
	public void equals(LineComparision lc2) {

		LineComparision l2=lc2;
		if(this.xi == l2.xi && this.yi == l2.yi) {
			if(this.xf==l2.xf && this.yf==l2.yf) {
				System.out.println("lines are equal");
			}
			else {
				if(this.lengthOfLine==l2.lengthOfLine)
					System.out.println("lines are equal");
			}
		}
		else {
			if(this.lengthOfLine==l2.lengthOfLine)
				System.out.println("lines are equal");
			else
				System.out.println("lines are not equal");
		}

	}


}
