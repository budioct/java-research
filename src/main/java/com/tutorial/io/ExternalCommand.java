package com.tutorial.io;

import java.io.IOException;

public class ExternalCommand {

    public static void main(String[] args) throws InterruptedException, IOException {

        // How To Execute an External Command with Java

        Runtime runtime = Runtime.getRuntime(); // fetch runtime
        Process exec = runtime.exec("touch budhi.text"); // ask external runtime to process invoke create file.txt
        exec.waitFor(); // wait process complite

    }

}
