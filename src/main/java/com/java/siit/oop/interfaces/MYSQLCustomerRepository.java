package com.java.siit.oop.interfaces;

import java.util.Collections;
import java.util.List;

public class MYSQLCustomerRepository implements CustomerRepository {

    @Override
    public List<Customer> findAllCustomersByName(String name) throws {
        return Collections.emptyList();
    }

    @Override
    public Customer findById(Long id) {
        return null;
    }
}
