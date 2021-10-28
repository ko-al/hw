package com.kolaiev.hw.repo;

import com.kolaiev.hw.model.Orders;
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
public class OrdersDAOImpl implements OrdersDAO{

    @Qualifier("dataSource")
    @Autowired
    private DataSource dataSource;

    @Override
    public List<Orders> getAllOrders() {
        List<Orders> orderList = new ArrayList<>();
        String sql = "SELECT * FROM ORDERS";
        Connection connection;

        try {
            connection = dataSource.getConnection();
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery(sql);
            while(resultSet.next()) {
                Orders orders = new Orders();

                orders.setOrderId(resultSet.getInt("order_id"));
                orders.setPersonId(resultSet.getInt("person_id"));
                orders.setStatus(resultSet.getString("status"));

                orderList.add(orders);
            }
            resultSet.close();
            ps.close();
            return orderList;

        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return null;
        }
    }


}