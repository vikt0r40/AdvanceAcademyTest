package com.company;

public class Ad {

    private String title;
    private String price;
    private User seller;

    public Ad(String title, String price, User seller) {
        this.title = title;
        this.price = price;
        this.seller = seller;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public User getSeller() {
        return seller;
    }

    public void setSeller(User seller) {
        this.seller = seller;
    }

    @Override
    public String toString() {
        return "Ad{" +
                "title='" + title + '\'' +
                ", price='" + price + '\'' +
                ", seller=" + seller +
                '}';
    }
}
