package org.theproject.springsecurityjdbcpasswordencoder;

// See https://spring.io/blog/2017/11/01/spring-security-5-0-0-rc1-released#password-storage-updated

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class SpringyBcryptEncoder {
    public static void main(String[] args) {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        String p1 = "rain";
        String p2 = "whisper";

        System.out.println(String.format("bcrypt hash of %s is %s",
                p1, bCryptPasswordEncoder.encode(p1)));
        System.out.println(String.format("bcrypt hash of %s is %s",
                p2, bCryptPasswordEncoder.encode(p2)));
    }
}
