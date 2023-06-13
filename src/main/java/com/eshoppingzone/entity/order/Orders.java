// package com.eshoppingzone.entity.order;

// import java.time.LocalDate;
// import java.util.List;

// import jakarta.persistence.CascadeType;
// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;
// import jakarta.persistence.JoinColumn;
// import jakarta.persistence.OneToMany;
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
// @Table(name = "order_table")
// public class Orders {
//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private int orderId;
//     private LocalDate orderDate;
//     private Integer customerId;
//     private double amountPaid;
//     private String modeOfPayment;
//     private String orderStatus;
//     private int quantity;

//     @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
//     // @JoinColumn(name = "order_id")
//     private List<OrderProducts> orderProducts;

//     // @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
//     // // @JoinColumn(name = "order_id")
//     // private List<ShippingAddress> orderAddresses;
// }





package com.eshoppingzone.entity.order;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "order_table")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderId;

    @Column(updatable = false)
    private LocalDateTime orderDate;

    private Integer customerId;
    private double amountPaid;
    private String modeOfPayment;
    private String orderStatus;
    private int quantity;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "order_id")
    private List<OrderProducts> orderProducts;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "order_id")
    private List<ShippingAddress> shippingAddress;

    @PrePersist
    protected void onCreate() {
        orderDate = LocalDateTime.now();
    }
}