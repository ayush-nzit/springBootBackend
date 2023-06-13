// package com.eshoppingzone.entity.userProfile.entity;


// import jakarta.persistence.Entity;
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
// @Table(name="address")
// @Getter
// @Setter
// @ToString
// @Builder
// @NoArgsConstructor
// @AllArgsConstructor
// public class Address {
    

//     @Id
//     private int houseNumber;
//     private String streetName;
//     private String colonyName;
//     private String state;
//     private String city;
//     private int pincode;



//     @ManyToOne
//     private UserProfile userProfile;
// }



package com.eshoppingzone.entity.userProfile.entity;

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
@Table(name = "address")
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Address {

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
