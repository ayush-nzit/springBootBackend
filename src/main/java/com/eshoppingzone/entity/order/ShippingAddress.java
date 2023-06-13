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
// @Table(name = "order_address")
// public class ShippingAddress {
//     @Id
//     private Integer addressId;
//     private String fullName;
//     private String mobileNumber;
//     private Integer flatNumber;
//     private String city;
//     private Integer pincode;
//     private String state;

// }


package com.eshoppingzone.entity.order;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "order_address")
public class ShippingAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)



    private Long addressId;
    private String fullName;
    private String phoneNumber;
    private String addressLine;
    private String locality;
    private String city;
    private String state;
    private Integer pincode;





}
