package com.engine.oms.model;

import static com.engine.oms.util.Constant.TABLE_UNIT;

import com.engine.oms.util.Constant;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
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
@Table(name = TABLE_UNIT)
public class Unit {
    @Column(name = "ID")
    @Id
    @SequenceGenerator(name = Constant.TABLE_UNIT + "_SEQ", sequenceName = Constant.TABLE_UNIT + "_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = Constant.TABLE_UNIT + "_SEQ")
    private Long id;
  
    @Column(name = "TITLE")
    private String title;
}
