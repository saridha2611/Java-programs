import java.io.*; 
public class GFG { 
      static int minBags(int M, int N, int X, int Y) 
	{ 
     		int maxAmount = 0; 
 		for (int p = 0; p <= N / X; p++) 
    { 
        int q = (N - p * X) / Y; 
  
        maxAmount = Math.max(maxAmount, p * X + q * Y); 
    } 
    int result = M / maxAmount; 
    result += (M % maxAmount == 0? 0: 1); 
  
    return result; 
} 
    static public void main (String[] args) 
    { 
        int M = 0, N = 1; 
        int X = 2, Y = 3; 
  
        System.out.println(minBags(M, N, X, Y)); 
    } 
} 