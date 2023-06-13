

// package com.eshoppingzone.config;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
// import org.springframework.security.core.context.SecurityContextHolder;
// import org.springframework.security.core.userdetails.UserDetails;
// import org.springframework.stereotype.Component;
// import org.springframework.web.filter.OncePerRequestFilter;

// import com.eshoppingzone.service.userProfile.service.ProfileService;

// import javax.servlet.FilterChain;
// import javax.servlet.ServletException;
// import javax.servlet.http.HttpServletRequest;
// import javax.servlet.http.HttpServletResponse;
// import java.io.IOException;

// @Component
// public class JwtTokenFilter extends OncePerRequestFilter {

//     private final JwtTokenUtil jwtTokenUtil;
//     private final ProfileService userDetailsService;

//     @Autowired
//     public JwtTokenFilter(JwtTokenUtil jwtTokenUtil, UserDetailsServiceImpl userDetailsService) {
//         this.jwtTokenUtil = jwtTokenUtil;
//         this.userDetailsService = userDetailsService;
//     }

//     @Override
//     protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
//             throws ServletException, IOException {
//         String jwtToken = extractJwtToken(request);

//         if (jwtToken != null && jwtTokenUtil.validateToken(jwtToken)) {
//             String username = jwtTokenUtil.getUsernameFromToken(jwtToken);
//             UserDetails userDetails = userDetailsService.loadUserByUsername(username);
//             UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(userDetails,
//                     null, userDetails.getAuthorities());
//             SecurityContextHolder.getContext().setAuthentication(authentication);
//         }

//         filterChain.doFilter(request, response);
//     }

//     private String extractJwtToken(HttpServletRequest request) {
//         // Extract the JWT token from the request header or query parameters
//         // Example: Authorization: Bearer <jwt_token>
//         String bearerToken = request.getHeader("Authorization");
//         if (bearerToken != null && bearerToken.startsWith("Bearer ")) {
//             return bearerToken.substring(7);
//         }
//         return null;
//     }
// }
