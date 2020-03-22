package lab;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class 求SHA256Demo {
    public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        //MD5
        //SHA-256  (拿值求哈希)，现在sha256比较成熟
        MessageDigest messageDigest=MessageDigest.getInstance("SHA-256");
        String s="你好世界";
        byte[] bytes=s.getBytes("UTF-8");
        messageDigest.update(bytes);//传进去要摘要的字节
        byte[] result=messageDigest.digest();//输出已加密的字节
        System.out.println(result.length);
        for(byte b:result){
            System.out.printf("%02x",b);
        }
        System.out.println();
    }
    //beca6335b20ff57ccc47403ef4d9e0b8fccb4442b3151c2e7d50050673d43172
}
