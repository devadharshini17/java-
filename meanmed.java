import java.util.Scanner;
public class MeanMedianMode {
    // Method for calculating mean
    static double calculateMean(int a[], int n)
    {
        int sum = 0;
        for (int i = 0; i < n; i++)
            sum += a[i];
        return (double)sum / (double)n;
    }
 
    // Method for calculating median
    static double calculateMedian(int a[], int n)
    {
        // First we sort the array
        Arrays.sort(a);
 
        // check for even case
        if (n % 2 != 0)
            return (double)a[n / 2];
 
        return (double)(a[(n - 1) / 2] + a[n / 2]) / 2.0;
    }
 
    // Method for calculating mode
    static int calculateMode(int a[], int n)
    {
        // Insert all elements in hash
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int max_count = 1, res = a[0];
       