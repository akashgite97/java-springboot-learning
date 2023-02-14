package com.api.book.bootrestbook.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.api.book.bootrestbook.helper.FileUploadHelper;

import jakarta.servlet.Servlet;

@RestController
public class FileUploadController {

    @Autowired
    FileUploadHelper fileUploadHelper;
    
    @PostMapping("/upload/file")
    public ResponseEntity<String> fileupload(@RequestParam("file") MultipartFile file){
        // System.out.println(file.getOriginalFilename());
        // System.out.println(file.getSize());
        // System.out.println(file.getName());

        try {
            if(file.isEmpty()){
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("request must contain file");
            }
    
            if(!file.getContentType().equals("image/jpeg")){
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Only JPEg content type are allowed");
            }

            boolean isFile = fileUploadHelper.uploadFile(file);
            System.out.println(isFile);
            if(isFile){
               // return ResponseEntity.ok("File uploded successfully");
               //ServletUriComponentsBuilder.fromCurrentContextPath()  --> localhost path
               return ResponseEntity.ok(ServletUriComponentsBuilder.fromCurrentContextPath().path("/images/").path(file.getOriginalFilename()).toUriString());
            }

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Something went wrong! Try again");
    }
}
