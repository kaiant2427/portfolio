import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


class Result 
{

    /*
     * Complete the 'ChangeMaker' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. FLOAT price
     *  2. FLOAT_ARRAY payment
     */

    public static List<Integer> ChangeMaker(float price, List<Float> payment) 
    {
        double pay=0.00;
        double pr=price;
        final double p=0.01;
        final double n=0.05;
        final double d=0.10;
        final double q=0.25;
        int p_total=0;
        int n_total=0;
        int d_total=0;
        int q_total=0;
        List<Integer> r = new ArrayList<Integer>();
        for(int i=0;i<payment.size();i++)
        {
            pay+=payment.get(i);
        }
        if(pr>pay)
        {
            while(pay>0.00)
            {
                if(p<pay)
                {
                    if(n<pay)
                    {
                        if(d<pay)
                        {
                            if(q<pay)
                            {
                                q_total++;
                                pay-=q;
                            }
                            else
                            {
                                d_total++;
                                pay-=d;
                            }
                        }    
                        else
                        {
                            n_total++;
                            pay-=n;
                        }   
                    }
                    else
                    {
                        p_total++;
                        pay-=p;
                    }
                }
            }
        }
        if(pr<pay)
        {
            while(pay>0.00)
            {
                if(p<pay)
                {
                    if(n<pay)
                    {
                        if(d<pay)
                        {
                            if(q<pay)
                            {
                                q_total++;
                                pay-=q;
                            }
                            else
                            {
                                d_total++;
                                pay-=d;
                            }
                        }    
                        else
                        {
                            n_total++;
                            pay-=n;
                        }   
                    }
                    else
                    {
                        p_total++;
                        pay-=p;
                    }
                }
            } 
        }
        r.add(p_total);
        r.add(n_total);
        r.add(d_total);
        r.add(q_total);
        return r;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        float price = Float.parseFloat(bufferedReader.readLine().trim());

        int paymentCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Float> payment = new ArrayList<>();

        for (int i = 0; i < paymentCount; i++) {
            float paymentItem = Float.parseFloat(bufferedReader.readLine().trim());
            payment.add(paymentItem);
        }

        List<Integer> result = Result.ChangeMaker(price, payment);

        for (int i = 0; i < result.size(); i++) {
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
