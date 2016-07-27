package com.dare.attachment.web.controller;

/**
 * Created by Dare on 2016/7/26.
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class UploadController {

    @RequestMapping("/upload")
    public String handleFileUpload(){
        System.out.println("---");
        return "fileUpload";
    }
}
