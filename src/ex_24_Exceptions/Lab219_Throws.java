package ex_24_Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab219_Throws {
    public static void main(String[] args) throws FileNotFoundException {

        FileReader f = new FileReader(("C://abc.txt"));
    }
}
