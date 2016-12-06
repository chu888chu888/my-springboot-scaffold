package com.chu.domain.solution;

import com.chu.domain.shared.BaseEntity;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Li_Zhensong on 2016/8/19.
 */
@Getter
@Setter
@Entity
@Table(name = "solution_group")
public class SolutionGroup extends BaseEntity {

    @NotEmpty
    private String name;
    @OneToMany(fetch = FetchType.LAZY,cascade = {CascadeType.REMOVE}, mappedBy = "solutionGroup")
    private Set<Solution> solutions;


}
