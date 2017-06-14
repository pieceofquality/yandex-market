package ru.yandex.market.selenium.model;

public class ProductData {
    private final String to;
    private final String subject;
    private final String body;

    public ProductData(String to, String subject, String body) {
        this.to = to;
        this.subject = subject;
        this.body = body;
    }

    public String getTo() {
        return to;
    }

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }
}
