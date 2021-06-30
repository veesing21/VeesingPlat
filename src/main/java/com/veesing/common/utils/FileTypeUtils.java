package com.veesing.common.utils;


public class FileTypeUtils {

    public static final String[] IMAGE_FORMAT = {"jpg", "jpeg", "gif"};

    public static final String[] AUDIO_FORMAT = {"mp3"};

    public static final String[] VIDEO_FORMAT = {"mp4"};

    public static final String[] TXT_FORMAT = {"txt"};


    public static Type getType(String fileName) {
        if (fileName == null) {
            return Type.ERROR;

        }
        String fileType = getFileSuffix(fileName);
        for (String s : IMAGE_FORMAT) {
            if (s.equals(fileType)) {
                return Type.IMG;
            }
        }
        for (String s : AUDIO_FORMAT) {
            if (s.equals(fileType)) {
                return Type.AUDIO;
            }
        }
        for (String s : VIDEO_FORMAT) {
            if (s.equals(fileType)) {
                return Type.VIDEO;
            }
        }
        for (String s : TXT_FORMAT) {
            if (s.equals(fileType)) {
                return Type.TXT;
            }
        }
        return Type.ERROR;
    }

    public static String getFileSuffix(String fileName) {
        return fileName.substring(fileName.lastIndexOf(".") + 1).toLowerCase();
    }

    public static int fileType(String fileName) {
        if (fileName == null) {
            return 500;

        } else {
            String fileType = fileName.substring(fileName.lastIndexOf(".") + 1).toLowerCase();
            String[] img = {"bmp", "jpg", "jpeg", "png", "tiff", "gif", "pcx", "tga", "exif", "fpx", "svg", "psd",
                    "cdr", "pcd", "dxf", "ufo", "eps", "ai", "raw", "wmf"};
            for (String s : img) {
                if (s.equals(fileType)) {
                    return 0;
                }
            }

            String[] document = {"txt", "doc", "docx", "xls", "htm", "html", "jsp", "rtf", "wpd", "pdf", "ppt"};
            for (String s : document) {
                if (s.equals(fileType)) {
                    return 1;
                }
            }
            String[] video = {"mp4", "avi", "mov", "wmv", "asf", "navi", "3gp", "mkv", "f4v", "rmvb", "webm"};
            for (String s : video) {
                if (s.equals(fileType)) {
                    return 2;
                }
            }
            String[] music = {"mp3", "wma", "wav", "mod", "ra", "cd", "md", "asf", "aac", "vqf", "ape", "mid", "ogg",
                    "m4a", "vqf"};
            for (String s : music) {
                if (s.equals(fileType)) {
                    return 3;
                }
            }

        }
        // 4
        return 99;
    }

    public enum Type {
        IMG,
        TXT,
        VIDEO,
        AUDIO,
        ERROR
    }

}
