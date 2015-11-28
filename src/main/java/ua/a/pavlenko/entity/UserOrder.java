package ua.a.pavlenko.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

@Entity
@Table
public class UserOrder implements Serializable{
    public static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userOrderId;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "userId")
    private User userId;

    @Temporal(TemporalType.TIMESTAMP)
    @Column
    private Calendar date;

    @OneToMany(mappedBy = "userOrderId")
    private List<OrderedItem> orderedItemList;

    public long getUserOrderId() {
        return userOrderId;
    }

    public void setUserOrderId(long userOrderId) {
        this.userOrderId = userOrderId;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public List<OrderedItem> getOrderedItemList() {
        return orderedItemList;
    }

    public void setOrderedItemList(List<OrderedItem> orderedItemList) {
        this.orderedItemList = orderedItemList;
    }

    public UserOrder(){}

    public UserOrder(User userId, Calendar date){
        this.userId  = userId;
        this.date = date;
    }

    @Override
    public String toString() {
        return "UserOrder [userOrderId=" + userOrderId + ", userId=" + userId
                + ", orderedItemList=" + orderedItemList + ", date=" + date + "]";
    }
}
