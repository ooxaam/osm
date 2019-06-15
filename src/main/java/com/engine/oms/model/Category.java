package com.engine.oms.model;

import static com.engine.oms.util.Constant.TABLE_CATEGORY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = TABLE_CATEGORY)
public class Category {
    @Column(name = "ID")
    @Id
    @GeneratedValue
    private Long id;
  
    @Column(name = "TITLE")
    private String title;
    
    @Column(name = "ACTIVE", length = 1)
    private String active;
}
