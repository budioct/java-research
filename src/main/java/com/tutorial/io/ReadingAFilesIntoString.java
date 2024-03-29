package com.tutorial.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadingAFilesIntoString {

    public static void main(String[] args) throws IOException {

        String result = Files.readString(Path.of("budhi.text")); // membaca isi file budhi.text
        System.out.println(result); // Hello I am Budhi

    }
}
