package cn.keyshen.jjinfo.service;

import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 * @ Author : Kayshen Xu
 * @ Date : Created in 1:29 PM 2018/11/21
 * @ Description :
 * @ Version :
 */
public interface FileUploadService {
  Boolean  UploadOSS(MultipartFile file);
}
