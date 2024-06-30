package io.github.spafka.controller;

import com.google.common.collect.Lists;
import io.github.spafka.Order;
import io.github.spafka.ProjectApi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/order")
public class ProjectController implements ProjectApi {

    @GetMapping("/lists")
    @Override
    public List<Order> list() {

        return Lists.newArrayList(new Order(1L, "2024030124", new Date()));
    }
}
