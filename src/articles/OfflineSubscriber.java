package articles;

public class OfflineSubscriber implements Subscriber {
    private final String address;

    public OfflineSubscriber(final String address) {
        this.address = address;
    }

    public void send(Article article) {
        System.out.println(article.getArticle + " была доставлена по адресу: " + address);
    }
}
