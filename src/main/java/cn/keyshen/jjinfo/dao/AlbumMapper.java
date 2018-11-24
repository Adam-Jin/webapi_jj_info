package cn.keyshen.jjinfo.dao;

import cn.keyshen.jjinfo.domain.Album;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @ Author : Kayshen Xu
 * @ Date : Created in 11:42 AM 2018/11/24
 * @ Description :
 * @ Version :
 */
@Mapper
@Repository
public interface AlbumMapper {
     boolean addAlbum(Album album);
}