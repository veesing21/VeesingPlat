package com.veesing.common.utils;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Base64;


public class Base64Util {


    public static String decode2String(String src,String charset) throws UnsupportedEncodingException {
        return new String(Base64.getMimeDecoder().decode(src), charset);
    }


    public static void decode2File(String destPath, String base64, String fileName) throws Exception {
        String content = base64.replace(";", "");
        File dir = new File(destPath);
        if (!dir.exists() && !dir.isDirectory()) {
            dir.mkdirs();
        }
        byte[] bytes = Base64.getMimeDecoder().decode(content);
        File file = new File(destPath + "/" + fileName);
        FileOutputStream fos = new FileOutputStream(file);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        bos.write(bytes);
        bos.close();
        fos.close();
    }

}
