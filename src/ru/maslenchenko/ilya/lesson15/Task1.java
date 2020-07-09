package ru.maslenchenko.ilya.lesson15;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class Task1 {
    private static final String[] operands = {"--copy", "--create", "--rename", "--delete"};

    public static void main(String[] args) {
        if (args.length != 0) {
            if (Arrays.asList(operands).contains(args[0])) {
                if (args.length > 1) {
                    switch (args[0]) {
                        case "--copy": {
                            if (args.length > 2) {
                                Path sourcePath = Paths.get(args[1]);
                                Path destPath = Paths.get(args[2]);
                                try {
                                    Files.copy(sourcePath, destPath);
                                    System.out.println("File is successfully copied");
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                            } else System.out.println("Missing destination path");
                            break;
                        }
                        case "--create": {
                            String filePath = args[1];
                            Path path = Paths.get(filePath);
                            try {
                                Files.createFile(path);
                                System.out.printf("File %s is created", path);
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                            break;
                        }
                        case "--rename": {
                            if (args.length > 2) {
                                File sourceFile = new File(args[1]);
                                File destFile = new File(args[2]);
                                if (sourceFile.renameTo(destFile)) {
                                    System.out.println("File renamed succesfully");
                                } else System.out.println("Error while renaming file");
                            } else System.out.println("Missing destination file name");
                            break;
                        }
                        case "--delete": {
                            Path path = Paths.get(args[1]);
                            try {
                                Files.deleteIfExists(path);
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                            break;
                        }
                    }
                } else System.out.println("Missing source filename");
            } else System.out.printf("Invalid option -- '%s'", args[0]);
        } else {
            System.out.println("Task1: missing operand");
            System.out.println("Usage: java Task1 --copy SOURCE_FILE DESTINATION_DIRECTORY");
            System.out.println("java Task1 --create FILENAME");
            System.out.println("java Task1 --rename SOURCE_FILE DESTINATION_FILE");
            System.out.println("java Task1 --delete FILENAME");
        }
    }
}
