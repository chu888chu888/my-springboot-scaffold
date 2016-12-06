package com.chu.domain.news;


import com.chu.domain.shared.BaseEntity;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;


/**
 * Created by ksdhc on 2016/7/28.
 */
@Getter
@Setter
@Entity
@Table(name = "news")
public class News extends BaseEntity {

    @Length(min = 1, max = 50)
    @Column(length = 250, nullable = false)
    private String title;
//    @Column(length = 250, nullable = false)
//    private String image;
    @Column(length = 250, nullable = false)
    private String thumb;
    @Column(nullable = false)
    private boolean popular;
    @Lob
    private String digest;
    @Lob
    private String detail;

}
