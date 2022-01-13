package com.company;

public class Ad {

    private String title;
    private String price;
    private User seller;

    public Ad(String title, String price, User user) {
        this.title = title;
        this.price = price;

    }

    public Ad(java.lang.String s, java.lang.String s1, User user) {
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
    public java.lang.String toString() {
        return "Ad{" +
                "title='" + title + '\'' +
                ", price='" + price + '\'' +
                ", seller=" + seller +
                '}';
    }
}
