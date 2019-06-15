package com.engine.oms.model;

import static com.engine.oms.util.Constant.TABLE_ORDER;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = TABLE_ORDER)
public class Order {
    @Column(name = "ID")
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "TOTAL_BILL")
    private Integer totalBill;
    
    @Column(name = "CUSTOMER_ID")
    private Integer customerId;
    
    @Column(name = "DELIVERY_TIME")
    @Temporal(value = TemporalType.DATE)
    private Date deliveryTime;
    
    @Column(name = "REMARKS")
    private String remarks;
    
    @Column(name = "CUSTOMER_RATING")
    private Integer customerRating;

    @Column(name = "ORDER_DATE")
    @Temporal(value = TemporalType.DATE)
    private Date orderDate;
}
