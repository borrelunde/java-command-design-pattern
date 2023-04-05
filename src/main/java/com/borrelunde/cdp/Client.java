package com.borrelunde.cdp;

/**
 * A client is an object that controls the command execution process by
 * specifying what commands to execute and at what stages of the process to
 * execute them.
 */
public class Client {

    public static void main(String[] args) {
        final TextFileOperationExecutor executor = new TextFileOperationExecutor();

        // Object-oriented approach.
        executor.executeOperation(new OpenTextFileOperation(new TextFile("file_one.txt")));
        executor.executeOperation(new SaveTextFileOperation(new TextFile("file_two.txt")));

        // Using Lambda Expressions
        executor.executeOperation(() -> "Opening file file_one.txt");
        executor.executeOperation(() -> "Saving file file_two.txt");

        // Using Method References
        final  TextFile textFile = new TextFile("file_one.txt");
        executor.executeOperation(textFile::open);
        executor.executeOperation(textFile::save);
    }
}
