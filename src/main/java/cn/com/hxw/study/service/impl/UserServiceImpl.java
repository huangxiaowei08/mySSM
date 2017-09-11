package cn.com.hxw.study.service.impl;

import cn.com.hxw.study.dao.UserMapper;
import cn.com.hxw.study.entity.User;
import cn.com.hxw.study.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by huangxiaowei on 17/9/11.
 */
@Service("userService")
public class UserServiceImpl implements IUserService{

    @Resource
    private UserMapper userDao;

    public User getUserById(int userId) {
        // TODO Auto-generated method stub
        return this.userDao.selectByPrimaryKey(userId);
    }

}
