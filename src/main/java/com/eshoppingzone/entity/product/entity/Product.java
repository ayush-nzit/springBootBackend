// // package com.eshoppingzone.entity.product.entity;

// // import java.util.List;
// // import java.util.Map;

// // import jakarta.persistence.ElementCollection;
// // import jakarta.persistence.Entity;
// // import jakarta.persistence.GeneratedValue;
// // import jakarta.persistence.GenerationType;
// // import jakarta.persistence.Id;
// // import jakarta.persistence.MapKeyColumn;
// // import lombok.AllArgsConstructor;
// // import lombok.Builder;
// // import lombok.Getter;
// // import lombok.NoArgsConstructor;
// // import lombok.Setter;
// // import lombok.ToString;

// // @Entity
// // @Getter
// // @Setter
// // @ToString
// // @Builder
// // @NoArgsConstructor
// // @AllArgsConstructor
// // public class Product {
   

// //     @Id
// //     private Long productId;
// //     private String productType;
// //     private String productName;
// //     private String catagory;
// //     @ElementCollection
// //     @MapKeyColumn(name = "my_key_column")
// //     private Map<Integer, String> review;

// //     @ElementCollection
// //     @MapKeyColumn(name = "my_key_column")
// //     private Map<Integer, String> rating;
// //     private List<String> image;
// //     private double price;
// //     private String description;
// //     @ElementCollection
// //     @MapKeyColumn(name = "my_key_column")
// //     private Map<String, String> specification;
// // }



// package com.eshoppingzone.entity.product.entity;

// import java.util.List;
// import java.util.Map;

// import jakarta.persistence.ElementCollection;
// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;
// import jakarta.persistence.MapKeyColumn;

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
// public class Product {
   
//     @Id
//     private Long productId;
//     private String productType;
//     private String productName;
//     private String category;

//     @ElementCollection
//     @MapKeyColumn(name = "my_key_column")
//     private Map<Integer, String> review;

//     @ElementCollection
//     @MapKeyColumn(name = "my_key_column")
//     private Map<Integer, String> rating;

//     private List<String> image;
//     private double price;
//     private String description;

//     @ElementCollection
//     @MapKeyColumn(name = "my_key_column")
//     private Map<String, String> specification;
// }



package com.eshoppingzone.entity.product.entity;

import java.util.List;
import java.util.Map;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MapKeyColumn;

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
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Long productId;
    private String productType;
    private String productName;
    private String category;

    @ElementCollection
    @MapKeyColumn(name = "my_key_column")
    private Map<Integer, String> review;

    private String rating;

    private List<String> image;
    private double price;
    private Long stockQuantity;
    private String description;
    @ElementCollection
    @MapKeyColumn(name = "my_key_column")
    private Map<String, String> specification;
}

