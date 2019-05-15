package com.engine.oms.model;

import static com.engine.oms.util.Constant.TABLE_ORDER;

import com.engine.oms.util.Constant;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
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
    @SequenceGenerator(name = Constant.TABLE_ORDER + "_SEQ", sequenceName = Constant.TABLE_ORDER + "_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = Constant.TABLE_ORDER + "_SEQ")
    private Long id;

    @Column(name = "TOTAL_BILL")
    private Integer totalBill;
    
    @Column(name = "CUSTOMER_ID")
    private Integer customerId;
    
    @Column(name = "ORDER_DATE")
    @Temporal(value = TemporalType.DATE)
    private Date orderDate;
    
}
