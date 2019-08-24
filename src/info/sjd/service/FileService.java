package info.sjd.service;

import java.io.*;

public class FileService {
    private static final String MAIN_DIR = System.getProperty("user.dir");
    private static final String FILE_SEP = System.getProperty("file.separator");
    private static final String FILE_DIR = MAIN_DIR + FILE_SEP + "files";


    //create file
    private static void checkDir() {
        File file = new File(FILE_DIR);

        if (!file.exists()) {
            file.mkdir();
        }
    }

    //reading bytes from file1

    public byte[] ReadingFromFile(String fileName) {
        try (FileReader reader = new FileReader(FILE_DIR + FILE_SEP + fileName);
             BufferedReader br = new BufferedReader(reader)) {

            // read line by line
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e)


        //writing bytes to file2

        public byte[] WritingToFile(String newfileName) {
            checkDir();

            try (FileWriter fileWriter = new FileWriter(FILE_DIR + FILE_SEP + newfileName)) {
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}