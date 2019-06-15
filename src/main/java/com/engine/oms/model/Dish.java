package com.engine.oms.model;

import static com.engine.oms.util.Constant.TABLE_DISH;

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
@Table(name = TABLE_DISH)
public class Dish {
    @Column(name = "ID")
    @Id
    @GeneratedValue
    private Long id;
  
    @Column(name = "TITLE")
    private String title;
    
    @Column(name = "CATEGORY_ID")
    private Integer categoryId;
    
    @Column(name = "UNIT_PRICE")
    private Integer unitPrice;
    
    @Column(name = "QUANTITY_PER_UNIT")
    private String quantityPerUnit;
    
    @Column(name = "UNIT_ID")
    private Integer unitId;
    
    @Column(name = "DESCRIPTION")
    private String description;
    
    @Column(name = "active", length = 1)
    private String active;
}
