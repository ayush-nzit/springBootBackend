// package com.eshoppingzone.entity.order;

// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;
// import jakarta.persistence.ManyToOne;
// import jakarta.persistence.Table;
// import lombok.AllArgsConstructor;
// import lombok.Builder;
// import lombok.Getter;
// import lombok.NoArgsConstructor;
// import lombok.Setter;
// import lombok.ToString;

// @Entity
// @Getter
// @Setter
// @ToString
// @Builder
// @AllArgsConstructor
// @NoArgsConstructor
// @Table(name = "order_product")
// public class OrderProducts {
//     @Id
//     private Long productId;
//     private String productName;
//     private String image;
//     private double price;

//     @ManyToOne
//     private Orders order;
// }





package com.eshoppingzone.entity.order;

import java.util.Optional;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
// @Table(name = "address")
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "order_product")
public class OrderProducts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long productId;
    private String productName;
    private String image;
    private double price;
    private double quantity;

}
