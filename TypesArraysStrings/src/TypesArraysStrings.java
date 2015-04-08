import java.util.ArrayList;
import java.util.Arrays;

public class TypesArraysStrings {

	//Problem 1
	static boolean isOdd(int n){
		return n % 2 == 1;
	}
	
	//Problem 2
	static boolean isPrime(int n){
		boolean flag = true;
		for(int i = 2; i < Math.sqrt(n); i++){
			if(n % i == 0)
				flag = false;
		}
		return flag;
	}
	
	//Problem 3
	static int min(int... array){
		int result = array[0];
		for(int i = 1; i < array.length; i++){
			if(result > array[i]){
				result = array[i];
			}
		}
		return result;
	}
	
	//Problem 4
	static int kthMin(int k, int[] array){
		Arrays.sort(array);
		return array[k - 1];
	}
	
	//Problem 5
	static int getAverage(int[] array){
		int result = 0;
		for(int i = 0; i < array.length; i++){
			result += array[i];
		}
		return result / 2;
	}
	
	//Problem 6
	static long doubleFac(int n){
		return Facturiel(Facturiel(n));
	}
	
	//For problem 6 and 7
	static int Facturiel(int num){
		int result = num;
		for (int i = num - 1; i > 1; i--) {
			result *= i;
		}
		return result;
	}
	
	//Problem 7
	static long kthFac(int k, int n){
		int result = n;
		for(int i = 0; i < k; i++){
			result = Facturiel(result);
		}
		return result;
	}
	
	//Problem 8
	
	//Problem 9
	static long getLargestPalindrome(long N){
		for(long i = N; i > 0; i++){
			if(isPalindrome(i)){
				return i;
			}
		}
		return 0;
	}
	
	//Problem 10
	//static int[] histogram(short[][] image){	
	//}
	
	//TODO: need O(log(b))
	//Problem 11
	static long pow(int a, int b){
		long result = 1;
		for(int i = 0; i < b; i++){
			result *= a;
		}
		return result;
	}
	
	//Problem 12
	/*
	 * TODO: use hash table	
	static int[] counterForArray(int... array){
		int[] counter = new int[getMaxElemInArray(array)];
		
		for(int i = 0; i < counter.length; i++){
			counter[i] = 0;
		}
		
		for(int i = 0; i < array.length; i++){
			counter[array[i]]++;
		}
		
		return counter;
	}
	
	static int getOddOccurrence(int... array){
		int[] counter = counterForArray(array);
		
		for(int i = 0; i < counter.length; i++){
			if(counter[i] % 2 != 0){
				return counter[i];
			}
		}
		
		return 0;
	}*/
	
	//Problem 13
	static long maximalScalarSum(int[] a, int[] b){
		long result = 0;
		Arrays.sort(a);
		Arrays.sort(b);
		for(int i = 0; i < a.length; i++){
			result += (a[i]*b[i]);
		}
		return result;
	}
	
	//Problem 14
	static int maxSpan(int[] numbers){	
		if(numbers.length == 1){
			return 1;
		}
		return numbers.length - 2;
	}
	
	//For problem 15
	static int isHaveChanceToBeBalnced(int[] numbers){
		int result = 0;
		for(int i = 0; i < numbers.length; i++){
			result += numbers[i];
		}
		return result;
	}
	
	//Problem 15
	static boolean canBalance(int[] numbers){
		if (isHaveChanceToBeBalnced(numbers)  % 2 == 0) {
			int leftSum = 0;
			int rightSum = 0;
			int idx = 0;
			while(leftSum <= isHaveChanceToBeBalnced(numbers) / 2){
				leftSum += numbers[idx];
				idx++;
			}
			while(idx != numbers.length){
				rightSum += numbers[idx];
				idx++;
			}
			return leftSum == rightSum;
		}
		return false;
	}
	
	//Problem 16
	
	//Problem 17
	static String reverseMe(String argument){
		StringBuffer result = new StringBuffer(argument);
		return result.reverse().toString();
	}
	
	//Problem 18
	static String reverseEveryChar(String arg){
		String result = "";
		String word = "";
		for (int i = 0; i < arg.length(); i++) {
			if (arg.charAt(i) == ' ') {
				if (result == "") {
					result += reverseMe(word);
				}
				else {
					result = result + ' ' + reverseMe(word);
				}
				word = "";
			}
			else {
				word += arg.charAt(i);
			}
		}
		result = result + ' ' + reverseMe(word);
		return result;
	}
	
	//Problem 19
	static boolean isPalindrome(String argument){
		String new_arg = argument;
		String result = "";
		int idx = new_arg.length() - 1;
		while (idx >= 0)
		{
		     char dig = new_arg.charAt(idx);
		     result += dig;
		     idx--;
		}
		return result.equals(argument);
	}
	
	//Problem 20
	static boolean isPalindrome(long argument){
		long num = argument;
		long rev = 0;
		while (num > 0)
		{
		     long dig = num % 10;
		     rev = rev * 10 + dig;
		     num = num / 10;
		}
		return rev == argument;
	}

	//Problem 21
	static String copyEveryChar(String input, int k){
		String result = "";
		for (int i = 0; i < input.length(); i++) {
			for (int j = 0; j < k; j++) {
				result += input.charAt(i);
			}
		}
		return result;
	}
	
	//Problem 22
	static int getPalindromeLength(String input){
		String right = "";
		String left = "";
		int result = 0;
		int idxOfStar = 0;

		for (int i = 0; i < input.length(); i++) {
			if(input.charAt(i) != '*'){
				left += input.charAt(i);
				idxOfStar++;
			} else {
				break;
			}
		}
		
		for (int i = idxOfStar + 1; i < input.length(); i++) {
			right += input.charAt(i);
		}
		
		left = reverseMe(left);
		
		for (int i = 0; i < right.length(); i++) {
			if(right.charAt(i) == left.charAt(i)){
				result++;
			}
			else{
				return result;
			}
		}
		return result;
		
	}
	
	//Problem 23
	static int countOcurrences(String needle, String haystack) {
		return haystack.split(needle, -1).length - 1;
	}
	
	//Problem 24
	
	//Problem 25
	static int sumOfNumbers(String input) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		int idx = 0;
		
		int temp = 0;
		while(idx < input.length()){
			if(input.charAt(idx) >= '0' && input.charAt(idx) <= '9'){
				temp = (temp * 10) + Integer.valueOf(input.charAt(idx)) - '0';
				if(idx == input.length() - 1){
					result.add(temp);
				}
				idx++;
			} else {
				idx++;
				result.add(temp);
				temp = 0;
			}
		}
		
		int sum = 0;
		for(int i = 0; i < result.size(); i++){
		    sum += result.get(i);
		}
		return sum;
	}

	//Problem 26
	static boolean anagram(String A, String B){
		ArrayList<Character> resultA = new ArrayList<Character>();
		ArrayList<Character> resultB = new ArrayList<Character>();
		
		A = A.toLowerCase();
		B = B.toLowerCase();
		
		for(int i = 0; i < A.length(); i++){
		    resultA.add(A.charAt(i));
		}
		
		for(int i = 0; i < B.length(); i++){
		    resultB.add(B.charAt(i));
		}
		
		ArrayList<Character> forCompA = new ArrayList<Character>(resultA);
		ArrayList<Character> forCompB = new ArrayList<Character>(resultB);
		
		forCompA.removeAll( resultB );
		forCompB.removeAll( resultA );
		
		return forCompA.equals(forCompB);
	}

	//Problem 27
	static boolean hasAnagramOf(String A, String B){
		ArrayList<Character> resultA = new ArrayList<Character>();
		ArrayList<Character> resultB = new ArrayList<Character>();
		
		A = A.toLowerCase();
		B = B.toLowerCase();
		
		for(int i = 0; i < A.length(); i++){
		    resultA.add(A.charAt(i));
		}
		
		for(int i = 0; i < B.length(); i++){
		    resultB.add(B.charAt(i));
		}
		
		ArrayList<Character> forCompA = new ArrayList<Character>(resultA);
		ArrayList<Character> forCompB = new ArrayList<Character>(resultB);
		
		forCompA.removeAll( resultB );
		forCompB.removeAll( resultA );
		
		return forCompA.isEmpty();
	}
	
	//Problem 28
	
	public static void main(String[] args) {
		
	}
	
}
