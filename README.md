# ReadInts

## Overview
ReadInts is a Java program designed to read integers from a file and print them to the console. It checks if the file is empty before attempting to read from it.

## Usage
To use the ReadInts program, follow these steps:
1. Compile the ReadInts.java file: `javac ReadInts.java`
2. Run the compiled program: `java ReadInts`

## Features
- Reads integers from a file and prints them to the console.
- Checks if the file is empty before attempting to read from it.
- Provides feedback on the status of the file reading process.

## How it works
1. The program takes one argument: the filename of the file to read integers from.
2. It checks if the specified file is not empty.
3. If the file is not empty, it creates a FileInputStream and a DataInputStream.
4. It then reads integers from the file using the DataInputStream and prints them to the console.
5. Finally, it closes the streams.

## Example
```java
ReadInts ri = new ReadInts("mydata.dat");
```

## Requirements
- Java Development Kit (JDK) installed
- Command-line interface for compiling and running Java programs

