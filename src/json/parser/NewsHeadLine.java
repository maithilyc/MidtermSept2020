package json.parser;


import com.google.gson.JsonObject;
import java.util.Date;


public class NewsHeadLine {
    private String source, author, title, description, url, urlToImage, publishedAt;

    public NewsHeadline(JsonObject jsonObject) {
        this.title = jsonObject.get("title").toString();
        this.source = jsonObject.getAsJsonObject("source").get("name").toString();
        this.author = jsonObject.get("author").toString();
        this.description = jsonObject.get("description").toString();
        this.url = jsonObject.get("url").toString();
        this.urlToImage = jsonObject.get("urlToImage").toString();
        this.publishedAt = jsonObject.get("publishedAt").toString();
    }

    public String getTitle() {
        return title;
    }
    public String getPublishedAt() {
        return publishedAt;
    }
    public String getAuthor() {
        return author;
    }
    public String getDescription() {
        return description;
    }
    public String getSource() {
        return source;
    }
    public String getUrl() {
        return url;
    }
    public String getUrlToImage() {
        return urlToImage;
    }

    public void setUrlToImage(String urlToImage) {
        this.urlToImage = urlToImage;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }
    public void setSource(String source) {
        this.source = source;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setUrl(String url) {
        this.url = url;
    }
}
}
