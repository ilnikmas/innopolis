package ru.maslenchenko.ilya.lesson18;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Task1 {
    public static void main(String[] args) throws IOException {
        Charset w1251 = Charset.forName("Windows-1251");
        Charset utf8 = StandardCharsets.UTF_8;
        File fileInput = new File(args[0]);
        File fileOutput = new File(args[1]);
        try (FileInputStream inputStream= new FileInputStream(fileInput);
        FileOutputStream outStream = new FileOutputStream(fileOutput)) {

            byte[] buffer = new byte[inputStream.available()];
            int b;
            while ((b = inputStream.read()) != -1) {



                String string = new String(buffer, utf8);
            outStream.write(string.getBytes(w1251));
        }
        }
    }
}
