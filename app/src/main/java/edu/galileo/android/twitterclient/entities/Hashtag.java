package edu.galileo.android.twitterclient.entities;

import java.util.List;

/**
 * Created by ykro.
 */
public class Hashtag {
    private String id;
    private String author;
    private String imageURL;
    private String tweetText;
    private int favoriteCount;
    private List<String> hashtags;

    private final static String BASE_TWEET_URL = "https://twitter.com/";

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTweetText() {
        return tweetText;
    }

    public void setTweetText(String tweetText) {
        this.tweetText = tweetText;
    }

    public int getFavoriteCount() {
        return favoriteCount;
    }

    public void setFavoriteCount(int favoriteCount) {
        this.favoriteCount = favoriteCount;
    }

    public List<String> getHashtags() {
        return hashtags;
    }

    public void setHashtags(List<String> hashtags) {
        this.hashtags = hashtags;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getTweetURL() {
        return BASE_TWEET_URL + this.author + "/status/" + this.id;
    }
}
