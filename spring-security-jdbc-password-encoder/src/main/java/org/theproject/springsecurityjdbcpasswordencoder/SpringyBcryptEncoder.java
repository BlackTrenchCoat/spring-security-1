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

        String h1 = bCryptPasswordEncoder.encode(p2);
        String h2 = bCryptPasswordEncoder.encode(p2);

        if (bCryptPasswordEncoder.matches(p2, h1)) {
            System.out.println(String.format("%s matches %s", p2, h1));
        } else {
            System.out.println(String.format("%s doesn't match %s", p2, h1));
        }

        if (bCryptPasswordEncoder.matches(p2, h2)) {
            System.out.println(String.format("%s matches %s", p2, h2));
        } else {
            System.out.println(String.format("%s doesn't match %s", p2, h2));
        }
    }
}
