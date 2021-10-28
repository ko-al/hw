package com.kolaiev.hw.repo;

import com.kolaiev.hw.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class PersonDAOImpl implements PersonDAO{

    @Qualifier("dataSource")
    @Autowired
    private DataSource dataSource;


    @Override
    public List<Person> getAllPerson() {
        List<Person> people = new ArrayList<>();
        String sql = "SELECT * FROM PERSON";
        Connection connection;

        try {
            connection = dataSource.getConnection();
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery(sql);
            while(resultSet.next()) {
                Person person = new Person();

                person.setPersonId(resultSet.getInt("id"));
                person.setPersonName(resultSet.getString("person_name"));
                person.setAge(resultSet.getInt("age"));

                people.add(person);
            }
            resultSet.close();
            ps.close();
            return people;

        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return null;
        }
    }


}
