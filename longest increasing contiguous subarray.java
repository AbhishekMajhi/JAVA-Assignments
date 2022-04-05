from java.io.* import *
public class GFG {
 
// Function to find the maximum length of longest
// increasing contiguous subarray after removing
// exactly one element from array
static int maxLenSubarr(int arr[], int n)
{
    // Creating front[] and back[] arrays
    int front[] = new int[n];
    int back[] = new int[n];
    for (int i = 0; i < n; i++) {
        front[i] = 1;
        back[i] = 1;
    }
 
    // Calculating the front[]
    for (int i = 1; i < n; i++) {
        if (arr[i] > arr[i - 1]) {
 
            // Update front[i]
            front[i] = front[i - 1] + 1;
        }
    }
 
    // Calculating the back[]
    for (int i = n - 2; i >= 0; i--) {
        if (arr[i] < arr[i + 1]) {
 
            // update back[i]
            back[i] = back[i + 1] + 1;
        }
    }
 
    // Store the length of longest increasing
    // contiguous subarray
    int ans = 1;
 
    // Check whether first element is
    // contributing in subarray or not
    boolean check_first = true;
 
    // Keep track of longest subarray when
    // first element is removed
    int ans_first = 1;
 
    for (int i = 1; i < n; i++) {
 
        // front[i] == 1 means contribution of
        // first element in max
        // length subarray has ended
        if (front[i] == 1) {
            check_first = true;
        }
 
        ans_first = Math.max(ans_first, front[i]);
    }
 
    // First element contributes in the subarray
    if (check_first == false) {
        ans_first -= 1;
    }
 
    // Check whether last element is
    // contributing in subarray or not
    boolean check_last = true;
 
    // Keep track of longest subarray when
    // last element is removed
    int ans_last = 1;
 
    for (int i = n - 2; i >= 0; i--) {
 
        // back[i] == 1 means contribution of
        // last element in max
        // length subarray has ended
        if (back[i] == 1) {
            check_last = true;
        }
        ans_last = Math.max(ans_last, back[i]);
    }
 
    // Last element contributes in the subarray
    if (check_last == false) {
        ans_last -= 1;
    }
 
    // Update ans
    ans = Math.max(ans_first, ans_last);
 
    // Calculating max length when
    // (i+1)th element is deleted
    for (int i = 0; i < n - 2; i++) {
        if (arr[i] < arr[i + 2]) {
            ans = Math.max(ans,
                      front[i] + back[i + 2]);
        }
    }
 
    return ans;
}
 
    // Driver code
    public static void main (String[] args) {
         
        int arr[] = { 2, 1, 3, 1 };
        int n = arr.length;
        System.out.println(maxLenSubarr(arr, n));
    }
}
 