package com.springboot.blog.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import io.jsonwebtoken.security.SignatureException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import java.security.Key;
import java.util.Date;

@Component
public class JwtTokenProvider {

    @Value("${app.jwt-secret}")
    private String jwtSecret;

    @Value("${app-jwt-expiration-milliseconds}")
    private long jwtExpirationDate;

    // generate token
    public String generateToken(Authentication authentication){

        String username = authentication.getName();

        Date currentDate = new Date();
        Date expireDate = new Date(currentDate.getTime() + jwtExpirationDate);

        String token = Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new Date())
                .setExpiration(expireDate)
                .signWith(key())
                .compact();

        return token;
    }
    private Key key(){
        return Keys.hmacShaKeyFor(
                Decoders.BASE64.decode(jwtSecret));
    }

    // get username from token
    public String getUsername(String token){
        Claims claims = Jwts.parserBuilder()
                .build()
                .parseClaimsJws(token)
                .getBody();

        String username = claims.getSubject();

        return username;
    }

    // validate Jwt Token
    public boolean validateToken(String token){
        try {
            Jwts.parserBuilder()
                    .build()
                    .parse(token);
            return true;
        } catch (ExpiredJwtException e) {
            throw new RuntimeException(e);
        } catch (MalformedJwtException e) {
            throw new RuntimeException(e);
        } catch (SignatureException e) {
            throw new RuntimeException(e);
        } catch (IllegalArgumentException e) {
            throw new RuntimeException(e);
        }

    }


}
