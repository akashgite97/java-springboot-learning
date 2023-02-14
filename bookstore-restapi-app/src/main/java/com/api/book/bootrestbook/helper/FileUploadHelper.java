package com.api.book.bootrestbook.helper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileUploadHelper {
    
   //Staticfileupload
   // public final String UPLOAD_DIR="H:\\DEC2022\\bookREST\\bootrestbook\\src\\main\\resources\\static\\images";
    public final String UPLOAD_DIR= new ClassPathResource("static/images/").getFile().getAbsolutePath();

    public FileUploadHelper() throws IOException{
    }

    public boolean uploadFile(MultipartFile multiParFile){
        System.out.println("inside uploadFile");
        boolean isFile = false;

        try {

            //read file 
            // InputStream is = multiParFile.getInputStream();
            // byte data[] = new byte[is.available()];
            // is.read(data);

            // //write file t UPLOAD_DIR path
            // FileOutputStream fos = new FileOutputStream(UPLOAD_DIR +File.separator+multiParFile.getOriginalFilename());
            // fos.write(data);
            // fos.flush();
            // fos.close();
            

            Files.copy(multiParFile.getInputStream(), Paths.get(UPLOAD_DIR+File.separator+multiParFile.getOriginalFilename()), StandardCopyOption.REPLACE_EXISTING);
            isFile=true;
            System.out.println(isFile);

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }


        return isFile;
    }
}
