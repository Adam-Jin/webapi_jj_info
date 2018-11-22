package cn.keyshen.jjinfo.service.impl;

import cn.keyshen.jjinfo.service.FileUploadService;
import cn.keyshen.jjinfo.utils.Constant;
import com.aliyun.oss.OSSClient;
import com.aliyun.oss.model.CannedAccessControlList;
import com.aliyun.oss.model.CreateBucketRequest;
import com.aliyun.oss.model.PutObjectRequest;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;


import java.io.IOException;
import java.io.InputStream;


/**
 * @ Author : Kayshen Xu
 * @ Date : Created in 1:31 PM 2018/11/21
 * @ Description :
 * @ Version :
 */
@Service
public class FileUploadServiceImpl implements FileUploadService {

    @Override
    public Boolean UploadOSS(MultipartFile file) {
        try {
            String fileName = file.getOriginalFilename();
            OSSClient ossClient = new OSSClient(Constant.ALIYUN_OSS_ENDPOINT, Constant.ACCESSKEYID, Constant.ACCESSKEYSECRET);
            if (!ossClient.doesBucketExist(Constant.BUCKETNAME)) {
                ossClient.createBucket(Constant.BUCKETNAME);
                CreateBucketRequest createBucketRequest = new CreateBucketRequest(Constant.BUCKETNAME);
                createBucketRequest.setCannedACL(CannedAccessControlList.PublicRead);
                ossClient.createBucket(createBucketRequest);
            }
            InputStream inputStream = file.getInputStream();
            ossClient.putObject(new PutObjectRequest(Constant.BUCKETNAME, fileName, inputStream));
            boolean exists = ossClient.doesObjectExist(Constant.BUCKETNAME, fileName);
            ossClient.shutdown();
            return exists;
        } catch (IOException e) {
            return false;
        }
    }
}
