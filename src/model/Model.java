package model;

import enums.Category;

import java.time.LocalDate;

public class Model {
    private int id;
    private String name;
    private int CPU;
    private int price;
    private LocalDate localDate;
    private Category category;
    private int article;

    public Model(int id, String name, int CPU, int price, LocalDate localDate, Category category, int article) {
        this.id = id;
        this.name = name;
        this.CPU = CPU;
        this.price = price;
        this.localDate = localDate;
        this.category = category;
        this.article = article;
    }
    public Model(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCPU() {
        return CPU;
    }

    public void setCPU(int CPU) {
        this.CPU = CPU;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public int getArticle() {
        return article;
    }

    public void setArticle(int article) {
        this.article = article;
    }

    @Override
    public String toString() {
        return "Model{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", CPU=" + CPU +
                ", price=" + price +
                ", localDate=" + localDate +
                ", category=" + category +
                ", article=" + article +
                '}';
    }
}