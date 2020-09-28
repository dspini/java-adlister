package com.codeup.adlister.util;

import org.mindrot.jbcrypt.BCrypt;

public class Password {
    private static final int ROUNDS = 12;

    public static String hash(String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt(ROUNDS));
    }

    public static boolean check(String password, String hash) {
        return BCrypt.checkpw(password, hash);
    }
}

//    String password = "password123";
//    String hash = BCrypt.hashpw(password, Bcrypt.gensalt());
//        boolean passwordsMatch = BCrypt.checkpw("mypassword", hash);
//        System.out.println(passwordsMatch); // false
//        passwordsMatch = BCrypt.checkpw("password123", hash);
//        System.out.println(passwordsMatch); // true