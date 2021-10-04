package com.solid.book;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class ScreenPrinter implements Interface {
    public void printToScreen() {
        Book book = super;
        do {
            System.out.println(book.getCurrentPage());
        } while (book.turnToNextPage());
    }
}
