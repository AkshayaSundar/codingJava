package Arrays;

/*Given an array of positive integers. Find the length of the longest
sub-sequence such that elements in the subsequence are consecutive
integers, the consecutive numbers can be in any order.
Example 1:
Input:
N = 7
a[] = {2,6,1,9,4,5,3}
Output:
6
Explanation:
The consecutive numbers here are 1, 2, 3, 4, 5, 6. These 6 numbers form the longest consecutive subsquence.*/

public class LongestConsecutiveSubsequence {
    public static void main(String[] args) {
        int[] input={82,6,84,7,83,86,85,90};
        int[] count= new int[input.length];
        int i,j,temp,output;

        for(i=0; i<input.length;i++)
        {
            for(j=0; j<(input.length-1);j++) {
                if(input[j]>input[j+1]) {
                    temp = input[j];
                    input[j] = input[j+1];
                    input[j+1] = temp;
                }
            }
        }
        for(i=0; i<input.length;i++)
        {
            temp=input[i];
            count[i]=1;
            for(j=i+1; j<input.length;j++) {
                temp += 1;
                if(input[j] == temp) {
                    count[i] += 1;
                }
                else {
                    break;
                }
            }
        }

        output=count[0];
        for(i=0; i<count.length;i++)
        {
            if(count[i] > output)
            {
                output = count[i];
            }
        }
        System.out.println(output);
    }
}
