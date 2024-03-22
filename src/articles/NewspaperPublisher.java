package articles;

import java.util.ArrayList;
import java.util.List;

public class NewspaperPublisher {
    private final List<Article> articles;

    List<Subscriber> subscribers = new ArrayList<>();

    public NewspaperPublisher(final List<Article> articles) {
        this.articles = articles;
    }

    public void subscribe(final Subscriber subscriber) {
        if (!subscribers.contains(subscriber)) {
            subscribers.add(subscriber);
        }
    }

    public void unsubscribe(final Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void startWork() {
        for (Subscriber subscriber : subscribers) {
            for (Article article : articles) {
                subscriber.send(article);
            }
        }

        for (Article article : articles) {
            for (Subscriber subscriber : subscribers) {
                subscriber.send(article);
            }
        }
    }

    public void publishNewArticle(final Article article) {
        articles.add(article);
        for (Subscriber subscriber : subscribers) {
            subscriber.send(article);
        }
    }
    // Создайте метод publishNewArticle(). Метод принимает на вход объект класса Article.
    // Метод должен добавлять новую статью в список статей articles, а затем рассылать её всем подписчикам из списка.
}
