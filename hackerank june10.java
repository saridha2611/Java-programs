import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
class Result {
    public static void main(String[] args) throws IOException 
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        int lengthsCount = Integer.parseInt(bufferedReader.readLine().trim());
        List<Integer> lengths = new ArrayList<>();
        for (int i = 0; i < lengthsCount; i++) 
        {
            int lengthsItem = Integer.parseInt(bufferedReader.readLine().trim());
            lengths.add(lengthsItem);
        }
        List<Integer> result = Result.cutBamboo(lengths);
        for (int i = 0; i < result.size(); i++)
        {
            bufferedWriter.write(String.valueOf(result.get(i)));
            if (i != result.size() - 1) {
                bufferedWriter.write("\n");
            }
        }
        bufferedWriter.newLine();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
