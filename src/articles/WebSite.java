package articles;

public class WebSite implements Subscriber {
    private final String url;

    public WebSite(final String url) {
        this.url = url;
    }

    public void send(Article article) {
        System.out.println(article.getArticle + " опубликована на страничке: " + url);
    }
}
