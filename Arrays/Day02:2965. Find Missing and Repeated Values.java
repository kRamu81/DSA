class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
       
        int actualSum = 0;
        int repeated = -1;

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int val = grid[i][j];
                actualSum += val;
                
                if (set.contains(val)) {
                    repeated = val;
                } else {
                    set.add(val);
                }
            }
        }

        // Sum of 1 to n*n
        int totalSum = (n * n )* (n * n + 1) / 2;
        int missing = totalSum - (actualSum - repeated);

        return new int[] {repeated, missing};
    }
}


/*
Step 1: Finding the Repeated Value
You loop through the matrix using nested loops (i and j) to access every element val = grid[i][j].
Use a HashSet to track seen values.
If val is already in the set, that means it's the repeated number.
If not, you add val to the set.
At the same time, you're also computing the actual sum of all numbers in the matrix
✅ So far, your logic is correct.

Step 2: Finding the Missing Value
The total sum of all numbers from 1 to n * n is:
    totalSum = (n * n * (n * n + 1)) / 2;

Let’s say actualSum is the sum of all numbers in the matrix, including the duplicate.
Then the missing value is calculated as:
missing = totalSum - (actualSum - repeated)


step 3:
Return Result
Finally, return the result as:
return new int[] {repeated, missing};
  */
