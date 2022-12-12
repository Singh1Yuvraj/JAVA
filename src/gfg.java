import java.util.*;
public class gfg {



        static void printMinDiffPairs(int arr[], int n)

        {

            if (n <= 1)
                return;
            Arrays.sort(arr);


            // Compare differences of adjacent

            // pairs to find the minimum difference.

            int minDiff = arr[1] - arr[0];

            for (int i = 2; i < n; i++)

                minDiff = Math.min(minDiff, arr[i] - arr[i - 1]);


            // Traverse array again and print all pairs

            // with difference as minDiff.
            System.out.println(minDiff);


        }
        public static void main (String[] args)

        {

            int arr[] = {5, 3, 2, 4, 1};

            int n = arr.length;

            printMinDiffPairs(arr, n);

        }
    }
