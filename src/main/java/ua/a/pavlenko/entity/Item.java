package ua.a.pavlenko.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
public class Item implements Serializable {
    public static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long itemId;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "categoryId")
    private Category categoryId;

    @Column
    private String name;

    @Column
    private float price;

    @Column
    private String imageURL1;

    @Column
    private String imageURL2;

    @Column
    private String imageURL3;

    @Column
    private String imageURL4;

    @Column
    private String imageURL5;

    @Version
    @Column
    private long version;


    public long getItemId() {
        return itemId;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }

    public Category getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Category categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getImageURL1() {
        return imageURL1;
    }

    public void setImageURL1(String imageURL1) {
        this.imageURL1 = imageURL1;
    }

    public String getImageURL2() {
        return imageURL2;
    }

    public void setImageURL2(String imageURL2) {
        this.imageURL2 = imageURL2;
    }

    public String getImageURL3() {
        return imageURL3;
    }

    public void setImageURL3(String imageURL3) {
        this.imageURL3 = imageURL3;
    }

    public String getImageURL4() {
        return imageURL4;
    }

    public void setImageURL4(String imageURL4) {
        this.imageURL4 = imageURL4;
    }

    public String getImageURL5() {
        return imageURL5;
    }

    public void setImageURL5(String imageURL5) {
        this.imageURL5 = imageURL5;
    }

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }

    public Item(){}

    public Item(Category categoryId, String name, float price){
        this.categoryId = categoryId;
        this.name = name;
        this.price = price;
    }

    public Item(Category categoryId, String name, float price, String imageURL1,
                String imageURL2, String imageURL3, String imageURL4, String imageURL5){
        //this(categoryId, name, price);
        this.categoryId = categoryId;
        this.name = name;
        this.price = price;
        this.imageURL1 = imageURL1;
        this.imageURL2 = imageURL2;
        this.imageURL3 = imageURL3;
        this.imageURL4 = imageURL4;
        this.imageURL5 = imageURL5;
    }

    @Override
    public String toString() {
        return "Item [itemId=" + itemId + ", category=" + categoryId
                + ", name=" + name + ", price=" + price + "]";
    }
}
