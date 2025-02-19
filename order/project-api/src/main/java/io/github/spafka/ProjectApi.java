package io.github.spafka;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public interface ProjectApi {
    @GetMapping("/lists")
    public abstract List<Order> list();
}
