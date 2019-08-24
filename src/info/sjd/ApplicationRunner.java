package info.sjd;

import info.sjd.service.FileService;

public class ApplicationRunner {


        public static void main(String[] args) {


            // reading bytes from file1
            FileService.ReadingFromFile("file1.txt");

            //writing bytes to file2
            FileService.WritingToFile("file2.txt");

        }
    }

