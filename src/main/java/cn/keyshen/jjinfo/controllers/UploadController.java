package cn.keyshen.jjinfo.controllers;

import cn.keyshen.jjinfo.service.FileUploadService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @ Author : Kayshen Xu
 * @ Date : Created in 1:20 PM 2018/11/21
 * @ Description :
 * @ Version :
 */

@RestController
@RequestMapping("file")
public class UploadController {
    @Resource
    private FileUploadService mFileUploadService;
    @RequestMapping(value = "upload", method = RequestMethod.POST)
    public String upload(@RequestParam("file") MultipartFile[] files){
          List<String> uploadFailName=new ArrayList<>();
         for(MultipartFile file : files){
           Boolean res=mFileUploadService.UploadOSS(file);
           if(!res){
               uploadFailName.add(file.getName());
           }
         }
         if(uploadFailName.isEmpty()){
             return "OK";
         }
        return "NO";
    }


}
