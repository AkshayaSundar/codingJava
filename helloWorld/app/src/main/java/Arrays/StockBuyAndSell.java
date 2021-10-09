package Arrays;

/*The cost of stock on each day is given in an array A[] of size N. Find all the
days on which you buy and sell the stock so that in between those days your
profit is maximum.
Note: There may be multiple possible solutions. Return any one of them. Any
correct solution will result in an output of 1, whereas wrong solutions will result
in an output of 0.
Example 1:
Input:
N = 7
A[] = {100,180,260,310,40,535,695}
Output:
1
Explanation:
One possible solution is (0 3) (4 6)
We can buy stock on day 0,
and sell it on 3rd day, which will
give us maximum profit. Now, we buy
stock on day 4 and sell it on day 6.*/

public class StockBuyAndSell {
    public static void main(String[] args) {
        int[] input={100,180,700,310,40,535,695};
        int i,j,day,max;

        for(i=0; i<(input.length-1);i++)
        {
            day=i;
            max=input[i];
            for(j=i; j<input.length;j++) {
                if(input[j]>max) {
                    max=input[j];
                    day=j;
                }
            }
                System.out.println("("+(i+1)+" "+(day+1)+")");
        }
    }

}
