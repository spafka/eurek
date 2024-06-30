package io.github.spafka;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class Order {
    private Long id;
    private String orderId;

    private Date gmt;
}
