package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        StringPublisher publisher = new StringPublisher();

        StringSubscriber alphabetSubscriber = new AlphabetSubscriber();
        StringSubscriber numberSubscriber = new NumberSubscriber();
        StringSubscriber symbolSubscriber = new SymbolSubscriber();

        publisher.subscribe(alphabetSubscriber);
        publisher.subscribe(numberSubscriber);
        publisher.subscribe(symbolSubscriber);

        String stringList[] = { "MERN Stack", "31-10-2564", "2021", "COVID-19", "META", "ლ(´ڡ`ლ)", "You have been pwned!", "Design Patterns", "9876543210"};
        for (String s : stringList) {
            System.out.println("String: \"" + s + "\"");
            publisher.publish(s);
        }

//        System.out.println();

    }
}
