package com.chu.service;

import com.chu.domain.model.UserLog;
import com.chu.domain.repository.IUserLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * Created by P70 on 2016/12/5.
 */

@Service
public class UserLogService {
    @Autowired
    private IUserLog iUserLog;

    /**
     * 用户注册
     *
     * @return
     */
    @Transactional
    public boolean saveUserLog(String name, String ip) {

        // 2.添加注册日志
        UserLog userLog = new UserLog();
        userLog.setUserName(name);
        userLog.setUserIp(ip);
        userLog.setCreateTime(new Date());
        iUserLog.save(userLog);
        return true;
    }
}
