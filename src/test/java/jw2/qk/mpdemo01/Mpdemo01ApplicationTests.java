package jw2.qk.mpdemo01;

import jw2.qk.mpdemo01.entity.User;
import jw2.qk.mpdemo01.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.xml.bind.SchemaOutputResolver;
import java.util.List;

@SpringBootTest
class Mpdemo01ApplicationTests {


    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {
    }



    //查询User所有数据
    @Test
    public void testQueryAll(){
        List<User> users = userMapper.selectList(null);
        for (User user : users) {
            System.out.println(user);
        }
    }

    //添加用户
    @Test
    public void testAdd(){
        User user = new User();
        user.setName("aaa");
        user.setEmail("aaa@jw2.com");
        user.setAge(22);

        int insert = userMapper.insert(user);
        System.out.println(insert);
    }

    //修改用户
    @Test
    public void testUpdate(){
        User user = new User();
        user.setId(1246276967976792066L);
        user.setName("bb");
        user.setEmail("bb@jw2.com");
        user.setAge(130);
        userMapper.updateById(user);
    }

    //MP自动填充
    @Test
    public void testMpFiled(){
        User user = new User();
        user.setName("ccc");
        user.setEmail("ccc@jw2.com");
        user.setAge(24);

        int insert = userMapper.insert(user);
        System.out.println(insert);
    }
}
