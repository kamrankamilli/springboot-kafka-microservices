package net.javaguides.basedomain.modal;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private String orderId;
    private String name;
    private String quantity;
    private double price;

}
