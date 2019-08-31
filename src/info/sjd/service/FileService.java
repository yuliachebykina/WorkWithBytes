package info.sjd.service;

import java.io.*;
import java.nio.file.Files;


public class FileService {
    private static final String MAIN_DIR = System.getProperty("user.dir");
    private static final String FILE_SEP = System.getProperty("file.separator");
    private static final String FILE_DIR = MAIN_DIR + FILE_SEP + "files";
    private static final String FILE_DIR_NEW = MAIN_DIR + FILE_SEP + "files_new";


    private static void checkDir() {
        File file = new File(FILE_DIR);
        if (!file.exists()) {
            file.mkdir();
        }
    }


    public static byte[] getBytesFromFile(String fileName){
        File file = new File(FILE_DIR + FILE_SEP + fileName);
        byte[] bytes = new byte[0];
        try {
            bytes = Files.readAllBytes(file.toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bytes;
    }

    public  static void writeBytesToFile(byte[] bytes, String fileName){
        checkDir();
        try (FileOutputStream fileOutputStream = new FileOutputStream(FILE_DIR_NEW + FILE_SEP + fileName)) {
            fileOutputStream.write(bytes);
            fileOutputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void copyFile(String fromFile, String toFile){
        byte[] bytes = getBytesFromFile(fromFile);
        writeBytesToFile(bytes, toFile);
    }

    public static void moveFileToNewDirectory(String fromFile, String toFile, String new_directory){
        byte[] bytes = getBytesFromFile(fromFile);

        File file = new File(FILE_DIR + FILE_SEP + fromFile);
        //file.delete();

    }
}






