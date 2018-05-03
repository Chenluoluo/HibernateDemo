import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ns = scanner.nextLine();
        int n = Integer.parseInt(ns);
        scanner.close();
        System.out.println(n);
        ArrayList[] dp = new ArrayList[n+1];
        for(int i=0; i<dp.length; i++)
            dp[i] = new ArrayList<String>();
        dp[0].add("");
        dp[1].add("()");
        if(n == 1) 
            System.out.println(dp[1]);
        int count = 2;
        while(count < n+1) {
            ArrayList<String> lcount = dp[count];
            for(int i=0; i<count; i++) {
                ArrayList<String> l1 = dp[i];
                ArrayList<String> l2 = dp[count-i-1];
                for(int j=0; j<l1.size(); j++) {
                    for(int k=0; k<l2.size(); k++) {
                        StringBuffer sb = new StringBuffer();
                        sb.append(l1.get(j));
                        sb.append("(");
                        sb.append(l2.get(k));
                        sb.append(")");
                        lcount.add(sb.toString());
                    }
                }
            }
            dp[count++] = lcount;
        }
        for(int i = 0; i < dp[n].size(); i++) {
        		System.out.println(dp[n].get(i));
        }


    }
}