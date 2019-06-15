package com.engine.oms.model;

import static com.engine.oms.util.Constant.TABLE_ORDER_DETAIL;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
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
@Table(name = TABLE_ORDER_DETAIL)
public class OrderDetail {
    @Column(name = "ID")
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "ORDER_ID")
    private Integer orderId;
    
    @Column(name = "DISH_ID")
    private Integer dishId;
    
    @Column(name = "QUANTITY")
    private Integer quantity;
    
    @Column(name = "SUB_TOTAL")
    private Integer subTotal;
    
}
