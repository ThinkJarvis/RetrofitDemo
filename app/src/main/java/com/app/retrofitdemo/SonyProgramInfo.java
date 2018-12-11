package com.app.retrofitdemo;

import java.util.List;

public class SonyProgramInfo {

    /**
     * _id : 5b8f2e9b9788ba8d67db3d6b
     * serialNo : 0
     * name : 古巴之旅
     * subtitle : 1.以善念出发，世界会带来回想，睁大眼睛，用心生活
     * image : https://storage.blob.core.chinacloudapi.cn/asset-1a4222fa-5acf-4f42-875f-0b73cb5f2a26/mmexport1540347001013.jpg?sv=2015-07-08&sr=c&si=a05ad6da-8cab-4ad7-a114-30cf2fa7e303&sig=XM9FrnQDixhs%2F0IbCyRL9AyGeiJlGAlUQt4proi0s58%3D&st=2018-10-24T02%3A59%3A10Z&se=2118-10-24T02%3A59%3A10Z
     * likes : 6
     * plays : 583
     * description : 生命多多少少有低潮，这些卡关可能来自工作、感情，或人际关系。有时候我们难免过度专注在自己的失去，而遗忘了只要心存善念，以善出发看待世界，整个宇宙都会联合起来帮助我们，带来回响。许茹芸将以自身在古巴的旅行经验告诉我们，以善念面对挫折，将来带多么幸运的结果。
     * mediaUrl : [{"protocol":"HLS","url":"http://account-cnno.streaming.media.chinacloudapi.cn/193c7657-fad5-45b5-b163-81a3ee34c047/GALA - 追梦赤子心.ism/manifest(format=m3u8-aapl)","encrypted":true}]
     * lyric : {"type":"lrc","content":"测试歌词"}
     * singer : 许茹芸
     */

    private String _id;
    private int serialNo;
    private String name;
    private String subtitle;
    private String image;
    private int likes;
    private int plays;
    private String description;
    private LyricBean lyric;
    private String singer;
    private List<MediaUrlBean> mediaUrl;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public int getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(int serialNo) {
        this.serialNo = serialNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getPlays() {
        return plays;
    }

    public void setPlays(int plays) {
        this.plays = plays;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LyricBean getLyric() {
        return lyric;
    }

    public void setLyric(LyricBean lyric) {
        this.lyric = lyric;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public List<MediaUrlBean> getMediaUrl() {
        return mediaUrl;
    }

    public void setMediaUrl(List<MediaUrlBean> mediaUrl) {
        this.mediaUrl = mediaUrl;
    }

    public static class LyricBean {
        /**
         * type : lrc
         * content : 测试歌词
         */

        private String type;
        private String content;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }
    }

    public static class MediaUrlBean {
        /**
         * protocol : HLS
         * url : http://account-cnno.streaming.media.chinacloudapi.cn/193c7657-fad5-45b5-b163-81a3ee34c047/GALA - 追梦赤子心.ism/manifest(format=m3u8-aapl)
         * encrypted : true
         */

        private String protocol;
        private String url;
        private boolean encrypted;

        public String getProtocol() {
            return protocol;
        }

        public void setProtocol(String protocol) {
            this.protocol = protocol;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public boolean isEncrypted() {
            return encrypted;
        }

        public void setEncrypted(boolean encrypted) {
            this.encrypted = encrypted;
        }
    }
}
