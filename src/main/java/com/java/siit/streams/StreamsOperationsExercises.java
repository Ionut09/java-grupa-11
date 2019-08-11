package com.java.siit.streams;

import java.util.Arrays;
import java.util.List;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class StreamsOperationsExercises {

    static Trader raoul = new Trader("Raoul", "Cambridge");
    static Trader mario = new Trader("Mario", "Milan");
    static Trader alan = new Trader("Alan", "Cambridge");
    static Trader brian = new Trader("Brian", "Cambridge");

    static List<Transaction> transactions = Arrays.asList(
            new Transaction(brian, 2011, 300),
            new Transaction(raoul, 2012, 1000),
            new Transaction(raoul, 2011, 400),
            new Transaction(mario, 2012, 710),
            new Transaction(mario, 2012, 700),
            new Transaction(alan, 2012, 950));

    /**
     * Find all transactions in the year 2011 and sort them by value (small to high).
     * What are all the unique cities where the traders work?
     * Find all traders from Cambridge and sort them by name.
     * Return a string of all traders’ names sorted alphabetically.
     * Are any traders based in Milan?
     * Print all transactions’ values from the traders living in Cambridge.
     * What’s the highest value of all the transactions?
     * Find the transaction with the smallest value.
     */
    private static List<Transaction> findAllTransactionsInYear(int year) {
        return transactions.stream()
                           .filter(transaction -> transaction.getYear() == year)
                           //.sorted((Transaction t1, Transaction t2) -> t1.getValue() - t2.getValue())
                           //.sorted(Comparator.comparing(transaction -> transaction.getValue()))
                           .sorted(comparing(Transaction::getValue))
                           .collect(toList());
    }
}
