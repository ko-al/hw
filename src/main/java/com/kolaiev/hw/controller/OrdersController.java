package com.kolaiev.hw.controller;

import com.kolaiev.hw.repo.OrdersDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OrdersController {

    @Autowired
    private OrdersDAO ordersDAO;


    @GetMapping("/orders")
    public String all(Model model){
        model.addAttribute("orderList", ordersDAO.getAllOrders());
        return "orders";
    }
}
