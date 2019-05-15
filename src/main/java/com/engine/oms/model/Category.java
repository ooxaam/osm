package com.engine.oms.model;

import static com.engine.oms.util.Constant.TABLE_CATEGORY;

import com.engine.oms.util.Constant;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = TABLE_CATEGORY)
public class Category {
    @Column(name = "id")
    @Id
    @SequenceGenerator(name = Constant.TABLE_CATEGORY + "_SEQ", sequenceName = Constant.TABLE_CATEGORY + "_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = Constant.TABLE_CATEGORY + "_SEQ")
    private Long id;
  
    @Column(name = "title")
    private String title;
    
    @Column(name = "active", length = 1)
    private String active;
}
