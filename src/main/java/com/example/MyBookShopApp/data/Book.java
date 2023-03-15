package com.example.MyBookShopApp.data;

import javax.xml.crypto.Data;

public class Book {

    private Integer id;
    private Data pup_date;
    private Integer is_bestseller;
    private String slug;
    private String title;
    private String image;
    private String description;
    private Integer price;
    private Integer discount;

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", pup_date=" + pup_date +
                ", is_bestseller=" + is_bestseller +
                ", slug='" + slug + '\'' +
                ", title='" + title + '\'' +
                ", image='" + image + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Data getPup_date() {
        return pup_date;
    }

    public void setPup_date(Data pup_date) {
        this.pup_date = pup_date;
    }

    public Integer getIs_bestseller() {
        return is_bestseller;
    }

    public void setIs_bestseller(Integer is_bestseller) {
        this.is_bestseller = is_bestseller;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }
}
