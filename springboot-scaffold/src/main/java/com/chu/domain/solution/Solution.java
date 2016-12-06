package com.chu.domain.solution;

import com.chu.domain.shared.BaseEntity;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;

/**
 * Created by Li_Zhensong on 2016/8/19.
 */
@Getter
@Setter
@Entity
@Table(name = "solution")
public class Solution extends BaseEntity {
    @NotEmpty
    @Column(length = 250, nullable = false)
    private String title;
    @NotEmpty
    @Lob
    private String detail;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "solution_group_id")
    private SolutionGroup solutionGroup;

    @NotEmpty
    @Lob
    private String solutionBrief;
}
