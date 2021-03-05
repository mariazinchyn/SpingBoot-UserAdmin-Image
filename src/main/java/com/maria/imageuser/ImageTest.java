package com.maria.imageuser;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class ImageTest {
    public static void main(String[] args) throws IOException {
        Cloudinary cloudinary = new Cloudinary(ObjectUtils.asMap(
                "cloud_name", "dz9c8hu1h",
                "api_key", "117331436243863",
                "api_secret", "3wxWxeOoU8Asx_UcODQFztzg9Jk"));

        File file = new File("D:\\Image1\\image1.jpg");
        Map uploadResult = cloudinary.uploader().upload(file, ObjectUtils.emptyMap());



    }
}
