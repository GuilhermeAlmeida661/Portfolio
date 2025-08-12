package com.fidelis.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.nio.charset.StandardCharsets;
import java.math.BigInteger;

public class CriptografiaUtil {

    public static String hashSenha(String senha){
        try{
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hash = md.digest(senha.getBytes(StandardCharsets.UTF_8));
            BigInteger number = new BigInteger(1, hash);
            return String.format("%064x", number); 
        }
        catch(NoSuchAlgorithmException e){
            throw new RuntimeException("Erro ao Criptografar a senha", e);
        }
    }
}
