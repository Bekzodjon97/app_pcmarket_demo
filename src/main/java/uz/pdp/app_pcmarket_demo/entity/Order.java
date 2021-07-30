package uz.pdp.app_pcmarket_demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    private Users users;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String comment;

    @Column(nullable = false)
    private String phoneNumber;

    @OneToOne
    private Basket basket;

    private boolean active;
}
