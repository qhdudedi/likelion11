package likelion.crudEx.domain;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Entity
@Table(name="products")
@Getter @Setter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "product_name")
    private String productName;

    @Column(name="price")
    private int price;
}
