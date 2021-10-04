package com.solid.book;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.ListIterator;

public class Book implements Interface {
    private String title;
    private List<String> pages;
    private ListIterator<String> iterator;
    private String currentPage;

    @override
    public Book(String title, List<String> pages) {
        this.title = title;
        this.pages = pages;
        iterator = pages.listIterator();
        if (iterator.hasNext()) {
            currentPage = iterator.next();
        } else {
            currentPage = null;
        }
    }

    @override
    public String getTitle() {
        return title;
    }

    @override
    public String getCurrentPage() {
        return currentPage;
    }

    @override
    public boolean turnToNextPage() {
        if (iterator.hasNext()) {
            currentPage = iterator.next();
            return true;
        } else {
            return false;
        }
    }
}
