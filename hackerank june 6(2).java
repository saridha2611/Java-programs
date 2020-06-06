import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
class Result {
    public static void print(char a[], int n, int ind){ 
    for (int i = ind; i < n + ind; i++) 
    System.out.print(a[(i % n)] + " "); 
    } 
    public static void main(String argc[]){ 
    char[] a = new char[]{ 'A', 'B', 'C','D', 'E', 'F'... }; 
        int n = 26; 
        print(a, n); 
    } 
} 
