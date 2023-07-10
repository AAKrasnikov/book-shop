package com.example.MyBookShopApp.data;

import java.util.List;

public class Genre {
    private Integer id;
    private Integer parent_id;
    private List<Genre> child_id;
    private String slug;
    private String name;
    private int count;

    @Override
    public String toString() {
        return "Genre{" +
                "id=" + id +
                ", parent_id=" + parent_id +
                ", child_id=" + child_id +
                ", slug='" + slug + '\'' +
                ", name='" + name + '\'' +
                ", count=" + count +
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

    public List<Genre> getChild_id() {
        return child_id;
    }

    public void setChild_id(List<Genre> child_id) {
        this.child_id = child_id;
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

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
