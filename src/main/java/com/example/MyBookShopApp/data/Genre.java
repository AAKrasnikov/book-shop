package com.example.MyBookShopApp.data;

public class Genre {
    private Integer id;
    private Integer parent_id;
    private String slug;
    private String name;

    @Override
    public String toString() {
        return "Genre{" +
                "id=" + id +
                ", parent_id=" + parent_id +
                ", slug='" + slug + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParent_id() {
        return parent_id;
    }

    public void setParent_id(Integer parent_id) {
        this.parent_id = parent_id;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
