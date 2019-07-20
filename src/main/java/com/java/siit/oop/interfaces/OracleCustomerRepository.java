package com.java.siit.oop.interfaces;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

public class OracleCustomerRepository implements CustomerRepository {

    @Override
    public List<Customer> findAllCustomersByName(String name) throws RuntimeException {
        Predicate<String> predicate;

        LinkedList<Customer> customers = new LinkedList<>();
        return customers;
        //covariant adica subtip de-al lui List
    }

    @Override
    public Customer findById(Long id) {
        return null;
    }
}
