package com.java.siit.jdbc;

import java.util.List;

public interface SingerDAO {
    void create(Singer singer);

    void delete(long id);

    List<Singer> findAll();

    List<Singer> findAllByFirstName(String firstName);

    void update(long id, Singer singer);
}