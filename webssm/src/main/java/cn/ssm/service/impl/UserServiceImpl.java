package cn.ssm.service.impl;

import cn.ssm.dao.UserMapper;
import cn.ssm.pojo.User;
import cn.ssm.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service("userService")
public class UserServiceImpl implements IUserService {

    @Resource
    private UserMapper userDao;
    @Override
    public User getUserById(User user) {
        return this.userDao.getUserById(user);
    }
}
