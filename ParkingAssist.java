import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {


    // Complete the carParking function below.
    static List<Integer> carParking(int n, List<List<Integer>> available) 
    {
        int r=0;
        int s=0;
        boolean full=false;
        for(int i=0;i<available.size();i++)
        {
            for(int j=0;j<available.get(i).size();j++)
            {
                if(available(i).get(j)=1)
                {
                    full=true;
                }
                if(i=0 && j=0 && full=false)
                {
                   System.out.println("Row: "+i+" Space: 1");
                }
            }
        }
        System.out.println("Row: "+r+" Space: "+s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int availableRows = Integer.parseInt(bufferedReader.readLine().trim());
        int availableColumns = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> available = new ArrayList<>();

        for (int i = 0; i < availableRows; i++) {
            String[] availableRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> availableRowItems = new ArrayList<>();

            for (int j = 0; j < availableColumns; j++) {
                int availableItem = Integer.parseInt(availableRowTempItems[j]);
                availableRowItems.add(availableItem);
            }

            available.add(availableRowItems);
        }

        List<Integer> res = carParking(n, available);

        for (int i = 0; i < res.size(); i++) {
            bufferedWriter.write(String.valueOf(res.get(i)));

            if (i != res.size() - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
