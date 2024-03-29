package com.tutorial.objects;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CreateNestedFolder {

    public static void main(String[] args) throws IOException {

        Path path = Path.of("hello/budhi/oct/22"); // set current path
        Files.createDirectories(path); // generate folder
    }

}
