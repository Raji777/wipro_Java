/*Write a program to initialize an integer array and find the maximum and minimum value of an array*/
 import java.util.Arrays;;
 class Q2{
	 public static void main(String[] args) {
		 int[] arr = new int[] {2,4,5,1,9,7};
		 Arrays.sort(arr);
		 int max = arr[arr.length-1];
		 int min = arr[0];
		 System.out.println("Maximum value of the array is: "+ max+ " and minimum value of the array is: "+ min);
	 }
 }