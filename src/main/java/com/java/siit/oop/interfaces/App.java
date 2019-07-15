package com.java.siit.oop.interfaces;

import java.util.List;

public class App {

    //private CustomerRepository customerRepo = new MYSQLCustomerRepository();
    private CustomerRepository customerRepo = new OracleCustomerRepository();


    public static void main(String[] args) {
        App app = new App();

        List<Customer> customers = app.customerRepo.findAllCustomersByName("Johny");

        CustomerRepository.countCustomers();
    }

    public void listCustomersService(){
        List<Customer> customers = customerRepo.findAllCustomersByName("Johny");
        customers.forEach(System.out::println);
    }
}
