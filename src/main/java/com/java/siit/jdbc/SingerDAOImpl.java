package com.java.siit.jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import static java.time.Month.JANUARY;

public class SingerDAOImpl implements SingerDAO {

    public static void main(String[] args) {
        SingerDAOImpl singerDAO = new SingerDAOImpl();
        singerDAO.findAll()
                 .stream()
                 .filter(s -> s.getFirstName().equals("John")) //evitati filtrarea in memorie ci faceti asta in DB
                 .forEach(System.out::println);
        System.out.println("select with params");

        singerDAO.findAllByFirstName("John")
                 .stream()
                 .forEach(System.out::println);

        singerDAO.create(Singer.builder()
                               .firstName("Danutz")
                               .lastName("Kolhaas")
                               .birthDate(LocalDate.of(1992, 10, 12))
                               .build());
        System.out.println(" after insert --------------------");
        singerDAO.delete(1);
        singerDAO.findAll()
                 .stream()
                 .forEach(System.out::println);
    }

    @Override
    public List<Singer> findAll() {
        List<Singer> singers = new ArrayList<>();
        try (Connection connection = getConnection()) {
            String sql = "SELECT * FROM singer";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            /*
                ID	int(11) AI PK
                FIRST_NAME	varchar(60)
                LAST_NAME	varchar(40)
                BIRTH_DATE	date
             */
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Singer singer = new Singer();
                singer.setId(resultSet.getInt("ID"));//numele coloanei sau aliasul definit in query
                singer.setFirstName(resultSet.getString("FIRST_NAME"));
                singer.setLastName(resultSet.getString("LAST_NAME"));
                singer.setBirthDate(resultSet.getDate("BIRTH_DATE").toLocalDate());
                singers.add(singer);
            }
            preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return singers;
    }

    @Override
    public List<Singer> findAllByFirstName(String firstName) {
        List<Singer> singers = new ArrayList<>();
        try (Connection connection = getConnection()) {
            String sql = "SELECT * FROM singer WHERE FIRST_NAME = ?";
            String sqlInjectabil = "SELECT * FROM singer WHERE FIRST_NAME = " + firstName;
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            Statement statement = connection.createStatement();
            statement.executeQuery(sqlInjectabil);
            /*
                ID	int(11) AI PK
                FIRST_NAME	varchar(60)
                LAST_NAME	varchar(40)
                BIRTH_DATE	date
             */
            preparedStatement.setString(1, firstName);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Singer singer = new Singer();
                singer.setId(resultSet.getInt("ID"));//numele coloanei sau aliasul definit in query
                singer.setFirstName(resultSet.getString("FIRST_NAME"));
                singer.setLastName(resultSet.getString("LAST_NAME"));
                singer.setBirthDate(resultSet.getDate("BIRTH_DATE").toLocalDate());
                singers.add(singer);
            }
            preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return singers;
    }

    @Override
    public void create(Singer singer) {
        LocalDate date = LocalDate.of(2011, JANUARY, 1);
        LocalDate dates = LocalDate.now();

        GregorianCalendar gc = new GregorianCalendar();
        gc.setLenient(false);
        gc.set(GregorianCalendar.YEAR, 2003);
        gc.set(GregorianCalendar.MONTH, 11);
        gc.set(GregorianCalendar.DATE, 1);
        java.util.Date gcTime = gc.getTime();

        try (Connection connection = getConnection()) {
            //java.sql.SQLIntegrityConstraintViolationException: Duplicate entry 'Danutz-Kolhaas' for key 'UQ_SINGER_1'
            //e aruncata in cazul incalcarii oricarei constrangeri
            String sql = "INSERT INTO singer (FIRST_NAME, LAST_NAME, BIRTH_DATE) VALUES (?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, singer.getFirstName());
            preparedStatement.setString(2, singer.getLastName());
            preparedStatement.setDate(3, Date.valueOf(singer.getBirthDate()));
            int numberOfModifedRows = preparedStatement.executeUpdate();//se fol pt insert, update, delete
            if (numberOfModifedRows == 1) {
                System.out.println("mihai e fericit, Danutz a fost inserat cu succes");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(long id) {
        try (Connection connection = getConnection()) {
            //java.sql.SQLIntegrityConstraintViolationException: Duplicate entry 'Danutz-Kolhaas' for key 'UQ_SINGER_1'
            //e aruncata in cazul incalcarii oricarei constrangeri
            String sql = "DELETE FROM singer where id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, (int) id);

            int numberOfModifedRows = preparedStatement.executeUpdate();//se fol pt insert, update, delete
            if (numberOfModifedRows == 1) {
                System.out.println("mihai e trist, John a fost sters cu succes");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private Connection getConnection() {
        try {
            return DriverManager.getConnection(
                    //db2, postgres, oracle
                    //"jdbc:mysql://ip:port/databaseName?useSSL=true&serverTimezone=EET",
                    "jdbc:mysql://localhost:3306/musicdb?useSSL=true&serverTimezone=EET",
                    "ionut",
                    "password");
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void update(long id, Singer singer) {

    }

}
