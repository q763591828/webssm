package cn.ssm.dao;

import cn.ssm.pojo.User;
import com.alibaba.fastjson.JSON;
import cn.ssm.service.IUserService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)		//表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class TestUserMapper {
    private static Logger logger = Logger.getLogger(TestUserMapper.class);
    //	private ApplicationContext ac = null;
    @Resource
    private IUserService userService=null;

    @Test
    public void test1() {
        User test_user = new User();
        test_user.setId(1);
        User user = userService.getUserById(test_user);
        // System.out.println(user.getUserName());
        // logger.info("值："+user.getUserName());
        logger.info(JSON.toJSONString(user));
    }

}
