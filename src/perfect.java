
// Java implementation of above approach
import java.util.*;
import java.lang.*;
import java.io.*;
 
class GFG
{
     
// Function to find the
// next perfect square
static int nextPerfectSquare(int N)
{
    int nextN = (int)Math.floor(Math.sqrt(N)) + 1;
 
    return nextN * nextN;
}
 
// Driver Code
public static void main(String args[])
{
    int n = 35;
 
    System.out.println (nextPerfectSquare(n));
}
}