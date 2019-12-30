package stream;/**
 * Created by Zhouyi.Fan on 2019/12/30.
 *
 * @version 版本号:1.01
 */

import stream.myenum.Article;
import stream.myenum.ArticleType;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * DESCRIPTION: learn grouping by handle and for me think and review
 **/
public class GroupByTest {
    public static void main(String[] args) {
        Article a1=new Article("a","fan",ArticleType.GUIDE,1);
        Article a2=new Article("a1","fan1",ArticleType.REVIEW,2);
        Article a3=new Article("a2","fan2",ArticleType.NEWS,3);
        Article a4=new Article("a3","fan2",ArticleType.GUIDE,4);
        List<Article> articles = Arrays.asList(a1,a2,a3,a4);
        Map<String, List<Article>> byAuthor = articles.stream()
                .collect(Collectors.groupingBy(Article::getAuthor));

       // byAuthor.forEach((k,v)-> System.out.println(v.get(0).getAuthor()));
        for (Map.Entry<String,List<Article>> entry:byAuthor.entrySet()
             ) {
            entry.getValue().forEach(v-> System.out.println(v.getAuthor()));
        }



    }
}
