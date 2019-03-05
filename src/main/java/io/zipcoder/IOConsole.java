package io.zipcoder;

import jdk.internal.util.xml.impl.Input;

import java.io.PrintStream;
import java.util.Scanner;
import java.io.InputStream;
import java.io.OutputStream;

public class IOConsole {
    private final Scanner scanner;
    private final PrintStream out;

    public IOConsole(){
        this(System.in, System.out);
    }

    public IOConsole(InputStream inputStream, OutputStream outputStream){
        this (new Scanner(inputStream), new PrintStream(outputStream));
    }

    public IOConsole(Scanner scanner, PrintStream printStream){
        this.scanner = scanner;
        this.out = printStream;
    }

    public void print(String val, Object... args){
        out.format(val, args);
    }

    public void println(String val, Object... args){
        print(val + "\n", args);
    }

    public String getStringInput(String prompt, Object... args){
        println(prompt, args);
        String stringInput = scanner.nextLine();
        return stringInput;
    }

    public Integer getIntegerInput(String prompt, Object... args){
        Integer integerInput = Integer.parseInt(getStringInput(prompt, args));
        return integerInput;
    }

    public Double getDoubleInput(String prompt, Object... args){
        Double doubleInput = Double.parseDouble(getStringInput(prompt, args));
        return doubleInput;
    }

    public Float getFloatInput(String prompt, Object... args){
        Float floatInput = Float.parseFloat(getStringInput(prompt, args));
        return floatInput;
    }

    public Long getLongInput(String prompt, Object... args){
        Long longInput = Long.parseLong(getStringInput(prompt, args));
        return longInput;
    }
}
