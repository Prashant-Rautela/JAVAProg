package CollectionFramework;

import java.util.*;
import java.util.Map.Entry;
public class ArrayPrograms {

	
	
	// sort the array
	
	public static void sortArray() {
		
		//smallest to largest
		
		int[] num = {2,1, 2,3,4,5};
		int temp=0;
		
		/*
		 * for (int i=0;i<num.length;i++) {
		 * 
		 * for (int j=i+1; j<num.length;j++) {
		 * 
		 * if (num[i]>num[j]) {
		 * 
		 * temp = num[i]; num[i] = num[j]; num[j] = temp;
		 * 
		 * }
		 * 
		 * }
		 * 
		 * }
		 */
		
		//largest to smallest
		
		for (int i = 0; i<num.length; i++) {
			for (int j = i+1; j < num.length;j++) {
				
				if (num[i] < num[j]) {
					
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
					
				}
				
			}
			
			
		}
		
		
		
		for (int i:num) {
			System.out.println(i);
		}
		
		
		int a = 20;
		int b = 30;
		int tempnum = 0;
		System.out.println("before swapping:value of a is " + a +"before swapping:value of b is" + b);
		
		tempnum = b;
		b = a;
		a = tempnum;
		
		System.out.println("after swapping:value of a is " + a +"after swapping:value of b is" + b);
		
		
	}
	
	
	//left rotate the array
	
	public static void leftRotateArray() {
		
		
		int[] num = {1,2,3,4,5};
		
		for (int i = 0 ;i<3;i++) {
			
			int firstele = num[i];
			for (int j=0; j<num.length-1;j++) {
				
				num[j] = num[j+1];
				
				
			}
			
			num[num.length-1] = firstele;
			
		}
		
		for (int i:num) {
			System.out.println(i);
		}
	}
	
	
	//find the frequency of elements in array.
	
	
	public static void findFreqOfElements() {
		
		
		int[] nums = {1,1,2,4,5,6,7};
		
		HashMap<Integer, Integer> nummap = new HashMap<>();
		//String[] fruits = {"Apple", "M"};
		for (int n : nums) {
			
			if (! nummap.containsKey(n)) {
				
				nummap.put(n, 1);
				
			}
			
			else {
				nummap.put(n, nummap.get(n)+1);
				
			}
			
		}
		
		for (Entry<Integer, Integer> entry : nummap.entrySet()) {
			
			System.out.println(entry.getKey() +" :"+ entry.getValue());
			
		}
		
	}
	
	//1234
	
	public static void reverseNum(int num) {
		
		int rem = 0;
		int reverse = 0;
		while (num > 0) {
			
			rem = num % 10;
			reverse = reverse*10 + rem;
			num = num/10;
			
		}
		
		System.out.println(reverse);
		
		
		
	}
	
	
	// to print duplicate elements in array
	
	public static void printDuplicate() {
		
		int[] numarray = {1,1,3,4,5,5,7,7};
		
		
		//reverse print array
		for (int i=numarray.length-1;i>=0;i--) {
			System.out.println(numarray[i]);
		}
		
		//odd even position elements
		for (int i = 0; i<=numarray.length-1;i++) {
			
			if (i%2 ==0 ) {
				
				System.out.println(numarray[i]+",");
			}
			
			
		}
		
		// print largest element in array
		
		int largestele = 0;
		for (int i=0;i<=numarray.length-1;i++) {
			if (numarray[i] > largestele) {
				largestele = numarray[i];
			}
			
			
			
		}
		
		System.out.println("Largest element is: " +largestele );
		
		
		
		/*
		 * HashSet<Integer> map = new HashSet<>();
		 * 
		 * for (int i:numarray) {
		 * 
		 * if (! map.add(i)) {
		 * 
		 * System.out.println(i);
		 * 
		 * 
		 * }
		 * 
		 * 
		 * }
		 */
			
	}
	
	//
	
	
	// shift all zeroes in array to end.
	
	public static void shiftingZero() {
		
		
		int[] arr = {3,4,5,0,4,7,8,0,9,4,5};
		int len = arr.length;  //11
		int[] zeroarra = new int[len];
		int count = 0;
		for (int i : arr) {
			if (i!=0) {
				zeroarra[count] = i;
				count+=1;
			}
		}
		
		for (int i : zeroarra) {
			System.out.println(i);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		shiftingZero();
		
		/*
		 * String s1 = "Sachin"; String s2 = "Tendulkar"; String s3 = 10+10 +
		 * s1.concat(10 + s2 + 12) + 10; System.out.println(s3);
		 */
	}

}
