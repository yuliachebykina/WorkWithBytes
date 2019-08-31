package info.sjd;

import info.sjd.service.FileService;

public class ApplicationRunner {

    public static void main(String[] args){


            FileService.moveFileToNewDirectory("dog.jpg", "dog_new.jpg","files_new");
            FileService.moveFileToNewDirectory("cat.jpg", "cat_new.jpg","files_new");
        }
}

