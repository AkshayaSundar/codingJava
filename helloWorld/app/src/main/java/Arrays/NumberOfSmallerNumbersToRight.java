package Arrays;

/*
Given an array of integers, return a new array where each element in the new array is the number of smaller elements to the right of that element in the original input array
Eg:
Input:  [3,4,9,6,1]
Output: [1,1,2,1,0]
*/

public class NumberOfSmallerNumbersToRight {
    public static void main(String[] args) {
        int[] input={3,4,9,6,1};
        int[] output= new int[input.length];

        for(int i=0; i<input.length;i++)
        {
            output[i]=0;
            for(int j=i+1; j<input.length;j++) {
                if(input[j]<input[i]) {
                    output[i] += 1;
                }
            }
            System.out.println(output[i]);
        }
    }

}
