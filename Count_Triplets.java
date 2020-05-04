// Shambhavi Awasthi
// Virtusa Hackerrank Practice
// Count Triplets
// Java Solution


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {

    // Complete the countTriplets function below.
    static long countTriplets(List<Long> arr, long r) {
HashMap<Long, Long> map1 = new HashMap();
    HashMap<Long, Long> map2 = new HashMap();
    long count = 0;
    for(int i = arr.size() - 1; i >= 0; i--) {
        long a = arr.get(i);
        if(map2.containsKey(a*r))
            count += map2.get(a*r);
            
        if(map1.containsKey(a*r)) {
            long c = map1.get(a*r);
            map2.put(a, map2.getOrDefault(a, 0L) + c);
        }

        

        map1.put(a, map1.getOrDefault(a, 0L) + 1);  
    }
    return count;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nr = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(nr[0]);

        long r = Long.parseLong(nr[1]);

        List<Long> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Long::parseLong)
            .collect(toList());

        long ans = countTriplets(arr, r);

        bufferedWriter.write(String.valueOf(ans));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
