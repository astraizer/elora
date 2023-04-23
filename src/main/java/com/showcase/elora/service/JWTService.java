package com.showcase.elora.service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public interface JWTService {
     <T> T extractClaim(String token, Function<Claims, T> claimResolver);

    String extractUsername(String jwtToken);

     String generateToken(UserDetails userDetails);

    boolean isTokenValid(String token, UserDetails userDetails);



     String generateToken(Map<String, Object> extraClaim, UserDetails userDetails);
}
