package com.mmall.controller.portal;

import com.mmall.common.Const;
import com.mmall.common.ServerResponse;
import com.mmall.pojo.User;
import com.mmall.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping ("/user/")///user/是公共的每个接口都存在所以写在类上面
public class UserController {
    /**
     * 用户登录
     * @param username
     * @param passsword
     * @param session
     * @return
     */
    @Autowired
    private IUserService iUserService;
    //通用的数据返回对象还没有定义,所以使用Object
    @RequestMapping(value="login.do",method= RequestMethod.POST)
    @ResponseBody //将返回值自动序列化成json
    public ServerResponse<User> login(String username, String passsword, HttpSession session){
        //service-->mybatis-->dao
        ServerResponse<User> response = iUserService.login(username,passsword);
        if (response.isSuccess()){
            session.setAttribute(Const.CURRENT_USER,response.getData());
        }
        return response;
    }
}
