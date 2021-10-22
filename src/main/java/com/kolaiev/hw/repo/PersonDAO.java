package com.kolaiev.hw.repo;

import com.kolaiev.hw.model.Person;
import org.springframework.stereotype.Component;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {
    private static final String URL = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
    private static final String USERNAME = "studentHW";
    private static final String PASSWORD = "1234";

    private static Connection connection;

    static {
        try{
            Class.forName("oracle.jdbc.OracleDriver");
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    public List<Person> all(){
        List<Person> people = new ArrayList<>();
         try{
            Statement statement = connection.createStatement();
            String SQL = "SELECT * FROM Person";
            ResultSet resultSet = statement.executeQuery(SQL);

            while(resultSet.next()){
                Person person = new Person();

                person.setPerson_id(resultSet.getInt("person_id"));
                person.setPerson_name(resultSet.getString("person_name"));
                person.setAge(resultSet.getInt("age"));

                people.add(person);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return people;
    }
}
