package com.veesing.common.utils;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;

public class FileUtil {

    public static String getOriginalFileName(String filePath) {
        File file = new File(filePath);
        if (file.exists() && !file.isDirectory()) {
            return file.getName();
        }
        return null;
    }

    public static void uploadFile(byte[] file, String filePath, String fileName) throws IOException {
        File targetFile = new File(filePath);
        if (!targetFile.exists()) {
            targetFile.mkdirs();
        }
        FileOutputStream out = new FileOutputStream(filePath + fileName);
        out.write(file);
        out.flush();
        out.close();
    }

    public static boolean deleteFile(String filePath) {
        File file = new File(filePath);
        if (file.exists() && file.isFile()) {
            return file.delete();
        } else {
            return false;
        }
    }


    public static String renameToUUID(String fileName) {
        return UUID.randomUUID() + "." + fileName.substring(fileName.lastIndexOf(".") + 1);
    }

    public static boolean renameFile(String oldUrl, String newName) {
        try {
            oldUrl = oldUrl.replace("\\", "/");
            File oldFile = new File(oldUrl);
            if (!oldFile.exists()) {
                throw new IOException("文件重命名失败，文件（" + oldFile + "）不存在");
            }
            String oldName;
            String parent = oldFile.getParent();
            String newUrl = parent + "/" + newName;
            File newFile = new File(newUrl);
            oldFile.renameTo(newFile);

            newName = newFile.getName();
            oldName = oldFile.getName();
            return !newName.equals(oldName);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean deletedir(File dirFile) {
        if (!dirFile.exists()) {
            return false;
        }

        if (dirFile.isFile()) {
            return dirFile.delete();
        } else {
            for (File file : dirFile.listFiles()) {
                deletedir(file);
            }
        }

        return dirFile.delete();
    }


    public static boolean delAllFile(String path) {
        boolean flag = false;
        File file = new File(path);
        if (!file.exists()) {
            return flag;
        }
        if (!file.isDirectory()) {
            return flag;
        }
        String[] tempList = file.list();
        File temp;
        for (String s : tempList) {
            if (path.endsWith(File.separator)) {
                temp = new File(path + s);
            } else {
                temp = new File(path + File.separator + s);
            }
            if (temp.isFile()) {
                temp.delete();
            }
            if (temp.isDirectory()) {
                delAllFile(path + "/" + s);
                delFolder(path + "/" + s);
                flag = true;
            }
        }
        return flag;
    }


    public static void delFolder(String folderPath) {
        try {
            delAllFile(folderPath);
            java.io.File myFilePath = new File(folderPath);
            myFilePath.delete();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



}
