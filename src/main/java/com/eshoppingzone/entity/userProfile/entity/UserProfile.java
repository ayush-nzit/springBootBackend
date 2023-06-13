// package com.eshoppingzone.entity.userProfile.entity;

// import java.util.List;

// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;
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
// @NoArgsConstructor
// @AllArgsConstructor


// @Table(name = "userProfile")
// public class UserProfile {


//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private Long profileId;
//     private String fullName;
//     private String image;
//     private String email;
//     private long mobileNumber;
//     private String about;
//     private String dateOfBirth;
//     private String gender;
//     private String role;
//     private String password;

    




//     @OneToMany(mappedBy = "userProfile" )
//     private List<Address> address;

    




// }




package com.eshoppingzone.entity.userProfile.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
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
@Table(name = "userProfile")
public class UserProfile {

    // @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    // private Long profileId;
    // private String fullName;
    // private String image;
    // private String email;
    // private long mobileNumber;
    // private String about;
    // private String dateOfBirth;
    // private String gender;
    // private String role;
    // private String password;

    // @OneToMany(mappedBy = "userProfile")
    // private List<Address> address;

    // public void setAddress(Address address2) {
    // }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Long profileId;

    private String fullName;

    private String image;

    private String email;
    private Long mobileNumber;

    private String about;

    private String dateOfBirth;

    private String gender;

    private String role;
    private String password;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "profile_id")
    private List<Address> addresses;

   
}
