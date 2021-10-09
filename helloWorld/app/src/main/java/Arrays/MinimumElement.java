package Arrays;

/*A sorted array A[ ] with distinct elements is rotated at some unknown point,
the task is to find the minimum element in it.
Example
Input
N = 5
arr[] = {4 ,5 ,1 ,2 ,3}
Output
1
Explanation: 1 is the minimum element in
the array.*/

public class MinimumElement {
    public static void main(String[] args) {
       int[] input={4 ,5 ,1 ,2 ,3};
       int min=input[0];

        for(int i=0; i<input.length;i++)
        {
            if(input[i] < min)
            {
                min = input[i];
            }
        }
        System.out.println(min);
    }
}
