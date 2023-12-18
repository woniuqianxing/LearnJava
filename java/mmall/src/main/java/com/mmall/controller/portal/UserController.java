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
import javax.xml.ws.spi.http.HttpExchange;

@Controller
@RequestMapping ("/user/")///user/是公共的每个接口都存在所以写在类上面
public class UserController {

    @Autowired
    private IUserService iUserService;
    //通用的数据返回对象还没有定义,所以使用Object
    /**
     * 用户登录
     * @param username
     * @param passsword
     * @param session
     * @return
     */
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

    @RequestMapping(value = "logout.do",method = RequestMethod.GET)
    @ResponseBody
    public ServerResponse<String> logout(HttpSession session){
        session.removeAttribute(Const.CURRENT_USER);
        return ServerResponse.createBySucess();
    }

    @RequestMapping(value="register.do",method = RequestMethod.GET)
    @ResponseBody
    public ServerResponse<String> register(User user){
        return iUserService.register(user);
    }
    @RequestMapping(value="check_valid.do",method = RequestMethod.GET)
    @ResponseBody
    public ServerResponse<String> checkValid(String str,String type){
        return iUserService.checkValid(str,type);
    }

    @RequestMapping(value="get_user_info.do",method = RequestMethod.GET)
    @ResponseBody
    public ServerResponse<User> getUserInfo(HttpSession session){
        User user=(User) session.getAttribute(Const.CURRENT_USER);
        if (user !=null){
            return ServerResponse.createBySucess(user);
        }
        return ServerResponse.createByErrorMessage("用户未登录,无法获取当前用户的信息");
    }
    @RequestMapping(value="forget_get_question.do",method = RequestMethod.GET)
    @ResponseBody
    public ServerResponse<String> forgetGetQuestion(String username){
        return iUserService.selectQuestion(username);
    }

    @RequestMapping(value="forget_check_answer.do",method = RequestMethod.GET)
    @ResponseBody
    public ServerResponse<String> forgetCheckAnswer(String username,String question,String answer){
        return iUserService.checkAnswer(username,question,answer);
    }
    @RequestMapping(value="forget_reset_password.do",method = RequestMethod.GET)
    @ResponseBody
    public ServerResponse<String> forgetRestPassword(String username,String passwordNew,String forgetTokrn){
        return iUserService.forgetRestPassword(username,passwordNew,forgetTokrn);
    }
    @RequestMapping(value="reset_password.do",method = RequestMethod.GET)
    @ResponseBody
    public ServerResponse<String> resetPassword(HttpSession session,String passwordOld,String passwordNew){
        User user=(User) session.getAttribute(Const.CURRENT_USER);
        if (user==null){
            return ServerResponse.createByErrorMessage("用户未登录");
        }
        return iUserService.resetPassword(passwordOld,passwordNew,user);

    }
    @RequestMapping(value="update_information.do",method = RequestMethod.GET)
    @ResponseBody
    public ServerResponse<User> update_information(HttpSession session,User user){
        User currentUser=(User) session.getAttribute(Const.CURRENT_USER);
        if (currentUser == null){
            return ServerResponse.createByErrorMessage("用户未登录");
        }
        user.setId(currentUser.getId());
        user.setUsername(currentUser.getUsername());
        ServerResponse<User> response=iUserService.updateInformation(user);
        if (response.isSuccess()){
            session.setAttribute(Const.CURRENT_USER,response.getData());
        }
        return response;
    }
}
