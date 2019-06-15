package com.engine.oms.model;

import static com.engine.oms.util.Constant.TABLE_CUSTOMER;

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
@Table(name = TABLE_CUSTOMER)
public class Customer {
    @Column(name = "ID")
    @Id
    @GeneratedValue
    private Long id;
  
    @Column(name = "NAME")
    private String name;
    
    @Column(name = "PH_NUMBER")
    private String phNumber;
    
    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "TOTAL_SALE")
    private Integer totalSale;
    
    @Column(name = "CREATION_DATE")
    @Temporal(value = TemporalType.DATE)
    private Date creationDate;
    
}
