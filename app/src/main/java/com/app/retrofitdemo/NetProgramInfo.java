/*
 * 文 件 名:  LocalRadioInfo.java
 * 版    权:  Pateo Co., Ltd. Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <本地收音机实体类>
 * 修 改 人:  pateo
 * 修改时间:  Apr 28, 2014
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.app.retrofitdemo;


import java.io.Serializable;

/**
 * <网络节目实体类>
 * 
 * @author  Tony
 * @version  [版本号, Dec 12, 2014]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class NetProgramInfo implements Serializable
{
    /**
     * 注释内容
     */
    private static final long serialVersionUID = 8289701238111271425L;

    private int catId;
    
    private String category;
    
    private int albumId;
    
    private String albumName;

    private int programId;
    
    private String programName;

    private String displayName = "";
    
    private int updateTime;
    
    private String thumbUrl = "";
    
    private String playUrl = "";
    
    private int isCollected = 0;
    
    private int latestTime;

    private int duration;

    private int composed_price_type; //1, 分集购买；2, 整张专辑购买
    private int free_track_count;
    private String free_track_ids;
    private String discounted_price;
    private String price;
    private boolean is_free;
    private boolean is_bought;

    private int update_count;

    private String sony_Id;

    /**

     * <默认构造函数>
     */
    public NetProgramInfo()
    {
        super();
    }

    /**
     * @return 返回 catId
     */
    public int getCatId()
    {
        return catId;
    }

    /**
     * @param 对catId进行赋值
     */
    public void setCatId(int catId)
    {
        this.catId = catId;
    }

    /**
     * @return 返回 category
     */
    public String getCategory()
    {
        return category;
    }

    /**
     * @param 对category进行赋值
     */
    public void setCategory(String category)
    {
        this.category = category;
    }

    /**
     * @return 返回 albumId
     */
    public int getAlbumId()
    {
        return albumId;
    }

    /**
     * @param 对albumId进行赋值
     */
    public void setAlbumId(int albumId)
    {
        this.albumId = albumId;
    }

    /**
     * @return 返回 albumName
     */
    public String getAlbumName()
    {
        return albumName;
    }

    /**
     * @param 对albumName进行赋值
     */
    public void setAlbumName(String albumName)
    {
        this.albumName = albumName;
    }

    /**
     * @return 返回 programId
     */
    public int getProgramId()
    {
        return programId;
    }

    /**
     * @param 对programId进行赋值
     */
    public void setProgramId(int programId)
    {
        this.programId = programId;
    }

    /**
     * @return 返回 programName
     */
    public String getProgramName()
    {
        return programName;
    }

    /**
     * @param 对programName进行赋值
     */
    public void setProgramName(String programName)
    {
        this.programName = programName;
    }

    /**
     * @return 返回 displayName
     */
    public String getDisplayName()
    {
        return displayName;
    }

    /**
     * @param 对displayName进行赋值
     */
    public void setDisplayName(String displayName)
    {
        this.displayName = displayName;
    }

    /**
     * @return 返回 updateTime
     */
    public int getUpdateTime()
    {
        return updateTime;
    }

    /**
     * @param 对updateTime进行赋值
     */
    public void setUpdateTime(int updateTime)
    {
        this.updateTime = updateTime;
    }

    /**
     * @return 返回 thumbUrl
     */
    public String getThumbUrl()
    {
        return thumbUrl;
    }

    /**
     * @param 对thumbUrl进行赋值
     */
    public void setThumbUrl(String thumbUrl)
    {
        this.thumbUrl = thumbUrl;
    }

    /**
     * @return 返回 playUrl
     */
    public String getPlayUrl()
    {
        return playUrl;
    }

    /**
     * @param 对playUrl进行赋值
     */
    public void setPlayUrl(String playUrl)
    {
        this.playUrl = playUrl;
    }
    
    public int getIsCollected()
    {
        return isCollected;
    }

    public void setIsCollected(int isCollected)
    {
        this.isCollected = isCollected;
    }
    
    public int getLatestTime()
    {
        return latestTime;
    }

    public void setLatestTime(int latestTime)
    {
        this.latestTime = latestTime;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getComposed_price_type() {
        return composed_price_type;
    }

    public void setComposed_price_type(int composed_price_type) {
        this.composed_price_type = composed_price_type;
    }

    public int getFree_track_count() {
        return free_track_count;
    }

    public void setFree_track_count(int free_track_count) {
        this.free_track_count = free_track_count;
    }

    public String getFree_track_ids() {
        return free_track_ids;
    }

    public void setFree_track_ids(String free_track_ids) {
        this.free_track_ids = free_track_ids;
    }

    public String getDiscounted_price() {
        return discounted_price;
    }

    public void setDiscounted_price(String discounted_price) {
        this.discounted_price = discounted_price;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public boolean getIs_free() {
        return is_free;
    }

    public void setIs_free(boolean is_free) {
        this.is_free = is_free;
    }

    public boolean getIs_bought() {
        return is_bought;
    }

    public void setIs_bought(boolean is_bought) {
        this.is_bought = is_bought;
    }

    public int getUpdate_count() {
        return update_count;
    }

    public void setUpdate_count(int update_count) {
        this.update_count = update_count;
    }

    public String getSony_Id() {
        return sony_Id;
    }

    public void setSony_Id(String sony_Id) {
        this.sony_Id = sony_Id;
    }
}
