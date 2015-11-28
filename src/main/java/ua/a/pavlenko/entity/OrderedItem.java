package ua.a.pavlenko.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
public class OrderedItem implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long orderedItemId;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "itemId")
    private Item itemId;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "userOrderId")
    private UserOrder userOrderId;

    @Column
    private int amount;

    @Column
    private float price;

    public static final long serialVersionUID = 1L;


    public long getOrderedItemId() {
        return orderedItemId;
    }

    public void setOrderedItemId(long orderedItemId) {
        this.orderedItemId = orderedItemId;
    }

    public Item getItemId() {
        return itemId;
    }

    public void setItemId(Item itemId) {
        this.itemId = itemId;
    }


    public UserOrder getUserOrderId() {
        return userOrderId;
    }

    public void setUserOrderId(UserOrder userOrderId) {
        this.userOrderId = userOrderId;
    }


    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }


    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public OrderedItem(){}

    public OrderedItem(Item item, UserOrder userOrder, int amount, float price){
        this.itemId = item;
        this.userOrderId = userOrder;
        this.amount = amount;
        this.price = price;
    }

    @Override
    public String toString() {
        return "OrderLine [orderedItemId=" + orderedItemId + ", itemId=" + itemId
                + ", userOrderId=" + userOrderId + ", amount=" + amount + ", price="
                + price + "]";
    }
}
