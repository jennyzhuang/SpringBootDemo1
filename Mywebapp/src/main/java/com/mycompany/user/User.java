package com.mycompany.user;

import javax.persistence.*;

@SuppressWarnings("ALL")
@Entity
@Table(name = "books")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 45, nullable = false, name = "BookName")
    private String BookName;

    @Column(length = 45, nullable = false, name = "BookPrice")
    private Integer BookPrice;

    @Column(length = 45, nullable = false, name = "BookPages")
    private Integer BookPages;

    @Column(length = 45, nullable = false, name = "BookDescriptions")
    private String BookDescriptions;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String BookName) {
        this.BookName = BookName;
    }

    public Integer getBookPrice() {
        return BookPrice;
    }

    public void setBookPrice(Integer BookPrice) {
        this.BookPrice = BookPrice;
    }

    public Integer getBookPages() {
        return BookPages;
    }

    public void setBookPages(Integer BookPages) {
        this.BookPages = BookPages;
    }

    public String getBookDescriptions() {
        return BookDescriptions;
    }

    public void setBookDescriptions(String BookDescriptions) {
        this.BookDescriptions = BookDescriptions;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + getId() + ", BookName='" + getBookName() + '\'' +
                ", BookPrice='" + getBookPrice() + '\'' + ", BookPages='" + getBookPages() + '\'' +
                ", BookDescriptions='" + getBookDescriptions() + '\'' + '}';
    }
}
