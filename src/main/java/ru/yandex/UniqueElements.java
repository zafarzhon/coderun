package ru.yandex;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zafarzhon
 * @link <a href="https://github.com/zafarzhon">github</a>
 */

public class UniqueElements {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {
            reader.readLine();
            String[] numbers = reader.readLine().split(" ");
            Map<String,Integer> numberAndCount = new HashMap<>();
            for(int i = 0;i<numbers.length;i++){
                String key = numbers[i];
                numberAndCount.put(key,numberAndCount.getOrDefault(key,0)+1);
            }
            long count = numberAndCount.values().stream().filter(c-> c ==1).count();
            writer.write(String.valueOf(count));
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
}
