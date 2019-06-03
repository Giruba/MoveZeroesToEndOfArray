import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		System.out.println("Move Zeroes to end of Array");
		System.out.println("---------------------------");
		
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the number of elements in the array");
			int arraySize = scanner.nextInt();
			int[] arrayGiven = new int[arraySize];
			for(int index = 0; index < arraySize; index++) {
				System.out.println("Enter the element");
				arrayGiven[index] = scanner.nextInt();
			}
			System.out.println("------- Printing the input array -------");
			PrintArray(arrayGiven);
			System.out.println();
			MoveZeroesToEnd(arrayGiven);
		}catch(Exception exception) {
			System.out.println("Thrown exception is "+exception.getMessage());
		}
	}
	
	public static void MoveZeroesToEnd(int[] array) {
		int zeroesCount = 0;
		for(int index = 0; index < array.length; index++) {
			if(array[index] == 0) {
				zeroesCount++;
			}
		}
		int actualIndex = 0;
		for(int index = 0; index < array.length; index++) {
			if(array[index] !=0) {
				array[actualIndex++] = array[index];
			}
		}
		
		for(int index = 0; index < zeroesCount; index++) {
			array[actualIndex++] = 0;
		}
		System.out.println("------- Printing the array after moving zeroes to the end-------");
		PrintArray(array);
	}
	
	public static void PrintArray(int[] array) {
		for(int index = 0; index < array.length; index++) {
			System.out.print(array[index]+" ");
		}
	}
}
