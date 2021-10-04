package com.solid.lsp;

public class Square {
    private int side;

    Square(int side) {
        this.side = side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public void getArea() {
        return side * side;
    }
}
