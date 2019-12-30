package stream.myenum;/**
 * Created by Zhouyi.Fan on 2019/12/30.
 *
 * @version 版本号:1.01
 */

/**
 * DESCRIPTION:
 **/
public class Article {
    String title;
    String author;
    ArticleType type;
    int likes;

    public Article(String title, String author, ArticleType type, int likes) {
        this.title = title;
        this.author = author;
        this.type = type;
        this.likes = likes;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public ArticleType getType() {
        return type;
    }

    public void setType(ArticleType type) {
        this.type = type;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }
}
