package com.chu.domain.group;

import org.springframework.data.jpa.repository.JpaRepository;


/**
 * Created by Li_Zhensong on 2016/8/12.
 */
public interface GroupRepository extends JpaRepository<Group, Long> {

    Group findByGroupName(String groupName);
}