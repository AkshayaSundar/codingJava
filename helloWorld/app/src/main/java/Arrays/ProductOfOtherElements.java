package Arrays;
/*
* Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i
 eg:
     Input = [1,2,3,4,5]
     Output = [120,60,40,30,24]
* */
public class ProductOfOtherElements {

    public static void main(String[] args) {
        int[] input={1,2,3,4,5};
        int[] output= new int[input.length];

        /*
        for(int i=0; i<input.length;i++)
        {
            output[i]=1;
            for(int j=0; j<input.length;j++) {
                if(i!=j) {
                    output[i] *= input[j];
                }
            }
            System.out.println(output[i]);
        }
        */

        /*
        int product=1;
        for(int i=0; (i<input.length && input[i] != 0);i++)
        {
            product *= input[i];
        }
        for(int i=0; i<input.length;i++)
        {
            if(input[i] == 0) {
                output[i] = 0;
            }
            else {
                output[i] = product;
                output[i] /= i;
                System.out.println(output[i]);
            }
        }

         */

        int[] left= new int[input.length];
        int[] right= new int[input.length];
        int i;
        left[0] = 1;
        for(i=1; i<input.length;i++)
        {
            left[i] = input[i - 1] * left[i - 1];
        }

        right[input.length - 1] = 1;
        for (i = input.length - 2; i >= 0; i--)
        {
            right[i] = input[i + 1] * right[i + 1];
        }

        for (i = 0; i < input.length; i++)
        {
            output[i] = left[i] * right[i];
            System.out.println(output[i]);
        }

    }
}
