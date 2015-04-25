package com.gu.test;

import java.io.Serializable;

/**
 * @author gushunbin
 * @date 15-4-20
 */
public class UserModel implements Serializable {
    private static final long serialVersionUID = -3504088465560409708L;
    private String            userName;
    private String            realName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    @Override
    public String toString() {
        return "UserModel [userName=" + userName + ", realName=" + realName + "]";
    }

}
