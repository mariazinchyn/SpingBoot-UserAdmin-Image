package com.maria.imageuser;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.Map;
@Service
public class ImageUploader {
   private Cloudinary cloudinary;

    public ImageUploader() {
        cloudinary = new Cloudinary(ObjectUtils.asMap(
                "cloud_name", "dz9c8hu1h",
                "api_key", "117331436243863",
                "api_secret", "3wxWxeOoU8Asx_UcODQFztzg9Jk"));
    }

public String uploadFiles(String path){
        File file = new File(path);
        Map uploadResult = null;
        try {
            uploadResult = cloudinary.uploader().upload(file, ObjectUtils.emptyMap());
        } catch (IOException e){
            //todo
        }




      //  File file = new File("D:\\Image1\\image1.jpg");


    return path;
}
