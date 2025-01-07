package com.jitu.SpringSecurity.service;

import io.jsonwebtoken.Jwt;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Service;

import java.lang.classfile.Signature;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Service
public class JwtService {


    public String generateToken(String username) {

        Map<String, Object> claims = new HashMap<>();
        claims.put("username", username);  // You can add custom claims if necessary

        return Jwts.builder()
                .setClaims(claims)  // Use the claims map here
                .setSubject(username)
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + 2000 * 60 * 3))  // 3 minutes expiration
                .signWith(getKey(), SignatureAlgorithm.HS256)  // Signing with the secret key
                .compact();
    }

}
