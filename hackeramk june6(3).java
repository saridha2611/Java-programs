import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
class KeyComparator implements Comparator<Key> {
    public int compare(Key k1, Key k2) 
      { 
             if (k1.freq < k2.freq) 
                 return 1; 
             else if (k1.freq > k2.freq) 
                 return -1; 
             return 0; 
      } 
} 
class Key { 
      int freq; 
      char ch; 
      Key(int val, char c)  
      { 
          freq = val;  
          ch = c; 
      } 
} 
class GFG { 
      static int MAX_CHAR = 26;  
      static void rearrangeString(String str) 
      {
          int n = str.length();
          int[] count = new int[MAX_CHAR];
          for (int i = 0; i < n; i++)
          count[str.charAt(i) - 'a']++;
          for (char c = 'a'; c <= 'z'; c++) {
              int val = c - 'a';
              if (count[val] > 0)
              pq.add(new Key(count[val], c)); 
              }
              str = "" ;
              Key prev = new Key(-1, '#');
              if (n != str.length()) 
                  System.out.println(" Not valid String "); 
              else
                  System.out.println(str); 
      } 
      public static void main(String args[]) 
      { 
             String str = "baccc" ; 
             rearrangeString(str); 
      } 
} 