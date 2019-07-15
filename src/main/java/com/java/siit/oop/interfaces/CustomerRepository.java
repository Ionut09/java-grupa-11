package com.java.siit.oop.interfaces;


import java.util.List;

public interface CustomerRepository {

    //public si abstracte
    List<Customer> findAllCustomersByName(String name);

    Customer findById(Long id);

    public static long countCustomers() {
        return 123L;
    }
}