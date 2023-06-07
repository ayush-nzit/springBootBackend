package com.eshoppingzone.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.eshoppingzone.entity.cart.entity.Cart;
import com.eshoppingzone.entity.order.Orders;
import com.eshoppingzone.entity.product.entity.Product;
import com.eshoppingzone.entity.userProfile.entity.Address;
import com.eshoppingzone.entity.userProfile.entity.UserProfile;
import com.eshoppingzone.service.cart.service.CartService;
import com.eshoppingzone.service.order.OrderService;
import com.eshoppingzone.service.product.service.ProductService;
import com.eshoppingzone.service.userProfile.service.ProfileService;

@CrossOrigin(origins = "http://localhost:3000")

@RestController
public class MyController {

    // @Autowired
    // private ProfileService profileService;

    @Autowired
    private ProductService productService;

    @Autowired
    private CartService cartService;

    //////////////////////////////////// PROFILE ROUTS////////////

    @Autowired
    private ProfileService profileService;

    // private final ProfileService profileService;

    // @Autowired
    // public ProfileController(ProfileService profileService) {
    // this.profileService = profileService;
    // }

    @PostMapping("/profiles")
    public ResponseEntity<UserProfile> createProfile(@RequestBody UserProfile userProfile) {
        UserProfile createdProfile = profileService.addNewCustomerProfile(userProfile);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdProfile);
    }

    @GetMapping("/profiles")
    public ResponseEntity<List<UserProfile>> getAllProfiles() {
        List<UserProfile> profiles = profileService.getAllProfile();
        return ResponseEntity.ok(profiles);
    }

    @GetMapping("/profiles/{profileId}")
    public ResponseEntity<UserProfile> getProfileById(@PathVariable("profileId") int profileId) {
        Optional<UserProfile> profile = profileService.getByProfileId(profileId);
        return profile.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    // @PostMapping("/profile")
    // public ResponseEntity<UserProfile> addProfile(@RequestBody UserProfile
    // userProfile) {
    // UserProfile createdProfile =
    // profileService.addNewCustomerProfile(userProfile);
    // return ResponseEntity.status(HttpStatus.CREATED).body(createdProfile);
    // }

    @PutMapping("/profiles/{profileId}")
    public ResponseEntity<Void> updateProfile(@PathVariable("profileId") int profileId,
            @RequestBody UserProfile userProfile) {
        Optional<UserProfile> existingProfile = profileService.getByProfileId(profileId);
        if (existingProfile.isPresent()) {
            userProfile.setProfileId((long) profileId);
            profileService.updateProfile(userProfile);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/profiles/{profileId}")
    public ResponseEntity<Void> deleteProfile(@PathVariable("profileId") int profileId) {
        Optional<UserProfile> profile = profileService.getByProfileId(profileId);
        if (profile.isPresent()) {
            profileService.deleteProfile(profileId);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/profiles/{profileId}/merchant")
    public ResponseEntity<Void> addMerchantProfile(@PathVariable("profileId") int profileId,
            @RequestBody UserProfile userProfile) {
        Optional<UserProfile> existingProfile = profileService.getByProfileId(profileId);
        if (existingProfile.isPresent()) {
            userProfile.setProfileId((long) profileId);
            profileService.addNewMerchantProfile(userProfile);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/profiles/{profileId}/delivery")
    public ResponseEntity<Void> addDeliveryProfile(@PathVariable("profileId") int profileId,
            @RequestBody UserProfile userProfile) {
        Optional<UserProfile> existingProfile = profileService.getByProfileId(profileId);
        if (existingProfile.isPresent()) {
            userProfile.setProfileId((long) profileId);
            profileService.addDeliveryProfile(userProfile);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    //////////////////////////////////////////////////////////////////

    @PostMapping("/signup")
    public UserProfile creatingProfile(@RequestBody UserProfile user) {

        return profileService.addNewCustomerProfile(user);
    }

    /////// to get user profile

    @GetMapping("/user/{userId}")
    public Optional<UserProfile> getUser(@PathVariable Integer userId) {
        return profileService.getByProfileId(userId);
    }

    // @PutMapping("/user/{id}")
    // public void updateProfile(@PathVariable("id") Long id, @RequestBody UserProfile userProfile) {
    //     Optional<UserProfile> existingProfile = profileService.getByProfileId(id.intValue());
    //     if (existingProfile.isPresent()) {
    //         UserProfile updatedProfile = existingProfile.get();
    //         updatedProfile.setFullName(userProfile.getFullName());
    //         updatedProfile.setMobileNumber(userProfile.getMobileNumber());

    //         // Update other fields as needed

    //         profileService.updateProfile(updatedProfile);
    //     }
    //     // Handle the case when the profile with the given ID doesn't exist
    // }
    @PutMapping("/user/{id}")
    public void updateProfile(@PathVariable("id") Long id, @RequestBody UserProfile userProfile) {
        Optional<UserProfile> existingProfile = profileService.getByProfileId(id.intValue());
        if (existingProfile.isPresent()) {
            UserProfile updatedProfile = existingProfile.get();
            updatedProfile.setFullName(userProfile.getFullName());
            updatedProfile.setMobileNumber(userProfile.getMobileNumber());
            updatedProfile.setEmail(userProfile.getEmail());
            updatedProfile.setAbout(userProfile.getAbout());
            updatedProfile.setDateOfBirth(userProfile.getDateOfBirth());
            updatedProfile.setGender(userProfile.getGender());
            updatedProfile.setRole(userProfile.getRole());
            updatedProfile.setPassword(userProfile.getPassword());

            // Update other fields as needed

            profileService.updateProfile(updatedProfile);
        }
        // Handle the case when the profile with the given ID doesn't exist
    }

    // @PostMapping("/login")
    // public UserProfile loginProfile(@RequestBody String userName) {

    //     return profileService.getByUserName(userName);
    // }

 @PostMapping("/userlogin")
 public ResponseEntity<UserProfile> createUser(@RequestBody UserProfile userDTO) {
     UserProfile user = profileService.getByUserName(userDTO);
     return ResponseEntity.ok(user);
 }

    @GetMapping("all")

    
    public List<UserProfile> getAll() {
        return profileService.getAllProfile();
    }

    //////////////////////// PRODUCT ROUTS/////////////////////

    @PostMapping("/products")
    public Product addProduct(@RequestBody Product product) {
        return productService.addProudect(product);
    }

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/products/{productId}")
    public Optional<Product> getProductById(@PathVariable Long productId) {
        return productService.getProductById(productId);
    }

    @PutMapping("/products/{productId}")
    public void updateProduct(@PathVariable Long productId, @RequestBody Product product) {
        Optional<Product> existingProduct = productService.getProductById(productId);
        if (existingProduct.isPresent()) {
            Product updatedProduct = existingProduct.get();
            updatedProduct.setProductName(product.getProductName());
            updatedProduct.setProductType(product.getProductType());
            // updatedProduct.setCatagory(product.getCetagory());
            updatedProduct.setCategory(product.getCategory());
            // updatedProduct.setCategory(product.getCategory());
            updatedProduct.setReview(product.getReview());
            updatedProduct.setRating(product.getRating());
            updatedProduct.setImage(product.getImage());
            updatedProduct.setPrice(product.getPrice());
            updatedProduct.setDescription(product.getDescription());
            updatedProduct.setSpecification(product.getSpecification());

            productService.updateProducts(updatedProduct);
        }
    }

    @DeleteMapping("/products/{productId}")
    public void deleteProduct(@PathVariable Long productId) {
        productService.deleteProductById(productId);
    }

    ////////////////////// CartService///////////////


    @GetMapping("/cart/{productId}")
    public ResponseEntity<Cart> getCartById(@PathVariable("productId") Long productId) {
        Optional<Cart> cart = cartService.getcartByid(productId.intValue());
        if (cart.isPresent()) {
            return ResponseEntity.ok(cart.get());
        } else {
            return ResponseEntity.ok(null);
        }
    }

    @PostMapping("/cart")
    public Cart addToCart(@RequestBody Cart product) {
        return cartService.addCart(product);
    }

    @GetMapping("/cart")
    public List<Cart> getAllCarts() {
        return cartService.getallcarts();
    }

    @PutMapping("/cart/{productId}")
    public ResponseEntity<Cart> updateCart(@PathVariable("productId") Long productId, @RequestBody Cart cart) {
        Optional<Cart> existingCart = cartService.getcartByid(productId.intValue());
        if (existingCart.isPresent()) {
            Cart updatedCart = existingCart.get();
            updatedCart.setProductName(cart.getProductName());
            updatedCart.setQuantity(cart.getQuantity());
            updatedCart.setPrice(cart.getPrice());
            // Update other fields as needed

            Cart savedCart = cartService.updateCart(updatedCart);
            return ResponseEntity.ok(savedCart);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Delete cart by cartId or productId
    @DeleteMapping("/cart/{productId}")
    public ResponseEntity<String> deleteCart(@PathVariable int productId) {
        cartService.deleteCart(productId);
        return new ResponseEntity<>("Cart deleted successfully", HttpStatus.OK);
    }

    @DeleteMapping("/cart/clear")
    public ResponseEntity<String> clearCart() {
        cartService.clearCart();
        return ResponseEntity.ok("Cart cleared successfully.");
    }

    @Autowired
    private OrderService orderService;

    @GetMapping("/order")
    public ResponseEntity<List<Orders>> getAllOrders() {
        List<Orders> orders = orderService.getAllOrders();
        return ResponseEntity.ok(orders);
    }

    @PostMapping("/order")
    public ResponseEntity<String> placeOrder(@RequestBody Orders cart) {
        orderService.placeOrder(cart);
        return ResponseEntity.status(HttpStatus.CREATED).body("Order placed successfully.");
    }

    @GetMapping("/order/customerId/{customerId}")
    public List<Orders> getOrdersByCustomerId(@PathVariable Long customerId) {
        return orderService.findByCustomerId(customerId);
    }

    // @PostMapping("/order")
    // public Cart placeOrder(@RequestBody Cart cart) {

    // return orderService.placeOrder(cart);
    // }

    // @PostMapping("/changeStatus/{orderId}")
    // public ResponseEntity<String> changeStatus(@PathVariable int orderId,
    // @RequestBody String orderStatus) {
    // String result = orderService.changeStatus(orderStatus, orderId);
    // return ResponseEntity.ok(result);
    // }

    @PostMapping("/changeStatus/{orderId}")
    public ResponseEntity<String> changeStatus(@PathVariable int orderId,
            @RequestBody Map<String, String> requestBody) {
        String orderStatus = requestBody.get("orderStatus");
        String result = orderService.changeStatus(orderStatus, orderId);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/order/{orderId}")
    public ResponseEntity<Orders> getOrderById(@PathVariable int orderId) {
        Optional<Orders> optionalOrder = orderService.getOrderById(orderId);
        if (optionalOrder.isPresent()) {
            Orders order = optionalOrder.get();
            return ResponseEntity.ok(order);
        }
        return ResponseEntity.notFound().build();
    }

}
