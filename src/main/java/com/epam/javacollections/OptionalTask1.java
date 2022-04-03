package com.epam.javacollections;

import java.io.*;
import java.util.ArrayList;

public class OptionalTask1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Admin\\IdeaProjects\\Java-training-tver\\src\\main\\java\\com\\epam\\javacollections\\strings.txt"));
        ArrayList<String> list = new ArrayList<>();
        String s;
        while((s = br.readLine())!=null) {
            list.add(s);
        }
        br.close();
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Admin\\IdeaProjects\\Java-training-tver\\src\\main\\java\\com\\epam\\javacollections\\result.txt"));
        for (int i = 0; i < list.size(); i++) {
            bw.write(list.get(list.size()- i - 1) + "\n");
        }
        bw.close();
    }
}
