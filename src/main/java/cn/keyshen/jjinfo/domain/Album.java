package cn.keyshen.jjinfo.domain;

/**
 * @ Author : Kayshen Xu
 * @ Date : Created in 11:38 AM 2018/11/24
 * @ Description :
 * @ Version :
 */
public class Album {
    private Integer id;
    private String albumName;
    private String coverPath;
    private String publishTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public String getCoverPath() {
        return coverPath;
    }

    public void setCoverPath(String coverPath) {
        this.coverPath = coverPath;
    }

    public String getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime;
    }

    @Override
    public String toString() {
        return "Album{" +
                "id=" + id +
                ", albumName='" + albumName + '\'' +
                ", coverPath='" + coverPath + '\'' +
                ", publishTime='" + publishTime + '\'' +
                '}';
    }
}
