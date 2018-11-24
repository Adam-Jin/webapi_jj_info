package cn.keyshen.jjinfo.controllers;

import cn.keyshen.jjinfo.dao.AlbumMapper;
import cn.keyshen.jjinfo.domain.Album;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ Author : Kayshen Xu
 * @ Date : Created in 11:59 AM 2018/11/24
 * @ Description :
 * @ Version :
 */
@RestController
@RequestMapping("music")
public class MusicController {

    @Autowired
    AlbumMapper albumMapper;

    @RequestMapping(value = "addAlbum",method = RequestMethod.POST)
    public String addAlbum(Album album) {
        //调用dao层
        Boolean isSuccess = albumMapper.addAlbum(album);
        return isSuccess?"OK":"NO";
    }

}
