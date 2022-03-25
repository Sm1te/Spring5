package com.robin.Service;

import com.robin.Li.UserLi;
import com.robin.Li.UserLiImpl;
import com.robin.Li.UserLiMysqlImpl;

public class UserServiceImpl implements UserService{
//    private UserLi userli = new UserLiMysqlImpl();
    private UserLi userli;
    //利用set进行动态实现值的注入！
    public void setUserLi(UserLi userli){
        this.userli = userli;
    }

    @Override
    public void getUser() {
        userli.getUser();
    }
}
