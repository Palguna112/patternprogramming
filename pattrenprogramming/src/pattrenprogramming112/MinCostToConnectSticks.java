package pattrenprogramming112;


	import java.util.Arrays;

	public class MinCostToConnectSticks {
	    public static int minCost(int[] sticks) {
	        // Sort the sticks
	        Arrays.sort(sticks);

	        int totalCost = 0;
	        // Keep merging until there's only one stick left
	        while (sticks.length > 1) {
	            // Merge the two smallest sticks
	            int sum = sticks[0] + sticks[1];
	            totalCost += sum;
	            // Remove the two smallest sticks and add the merged stick
	            sticks = Arrays.copyOfRange(sticks, 2, sticks.length);
	            sticks = insert(sticks, sum);
	        }
	        return totalCost;
	    }

	    // Helper method to insert a value into a sorted array
	    private static int[] insert(int[] array, int value) {
	        int[] newArray = new int[array.length + 1];
	        int i = 0;
	        while (i < array.length && array[i] < value) {
	            newArray[i] = array[i];
	            i++;
	        }
	        newArray[i] = value;
	        System.arraycopy(array, i, newArray, i + 1, array.length - i);
	        return newArray;
	    }

	    public static void main(String[] args) {
	        int[] sticks = {5, 3, 7};
	        System.out.println(minCost(sticks)); // Output: 19
	    }
	

	}


