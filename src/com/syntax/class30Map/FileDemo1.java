package com.syntax.class30Map;

import java.io.File;
import java.util.Scanner;

public class FileDemo1 {
    public static void main(String[] args) {

        String path ="/Users/zulfiyaa/eclipse-workspace/Batch12Project/src/com/syntax/class30/class30notes.txt";
        File file = new File (path);

                Scanner scan = new Scanner(path);
                while (scan.hasNext()){
                    System.out.println(scan.next());
                }

    }
}
