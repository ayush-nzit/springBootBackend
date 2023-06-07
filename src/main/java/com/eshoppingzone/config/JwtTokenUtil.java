// package com.eshoppingzone.config;

// import io.jsonwebtoken.Claims;
// import io.jsonwebtoken.Jwts;
// import io.jsonwebtoken.SignatureAlgorithm;
// import org.springframework.beans.factory.annotation.Value;
// import org.springframework.security.core.userdetails.UserDetails;
// import org.springframework.stereotype.Component;

// import java.util.Date;
// import java.util.HashMap;
// import java.util.Map;
// import java.util.function.Function;

// @Component
// public class JwtTokenUtil {

//     @Value("${jwt.secret}")
//     private String secret;

//     @Value("${jwt.expiration}")
//     private int expiration;

//     // Generate JWT token
//     public String generateToken(UserDetails userDetails) {
//         Map<String, Object> claims = new HashMap<>();
//         return createToken(claims, userDetails.getUsername());
//     }

//     // Create token
//     private String createToken(Map<String, Object> claims, String subject) {
//         Date now = new Date();
//         Date expiryDate = new Date(now.getTime() + expiration * 1000);

//         return Jwts.builder()
//                 .setClaims(claims)
//                 .setSubject(subject)
//                 .setIssuedAt(now)
//                 .setExpiration(expiryDate)
//                 .signWith(SignatureAlgorithm.HS512, secret)
//                 .compact();
//     }

//     // Extract username from token
//     public String getUsernameFromToken(String token) {
//         return getClaimFromToken(token, Claims::getSubject);
//     }

//     // Extract expiration date from token
//     public Date getExpirationDateFromToken(String token) {
//         return getClaimFromToken(token, Claims::getExpiration);
//     }

//     // Extract claim from token
//     public <T> T getClaimFromToken(String token, Function<Claims, T> claimsResolver) {
//         Claims claims = getAllClaimsFromToken(token);
//         return claimsResolver.apply(claims);
//     }

//     // Parse token and get all claims
//     private Claims getAllClaimsFromToken(String token) {
//         return Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody();
//     }

//     // Validate if the token is expired
//     private Boolean isTokenExpired(String token) {
//         Date expiration = getExpirationDateFromToken(token);
//         return expiration.before(new Date());
//     }

//     // Validate if the token is still valid
//     public Boolean validateToken(String token, UserDetails userDetails) {
//         String username = getUsernameFromToken(token);
//         return username.equals(userDetails.getUsername()) && !isTokenExpired(token);
//     }
// }
