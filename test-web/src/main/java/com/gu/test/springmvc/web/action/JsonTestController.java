package com.gu.test.springmvc.web.action;

import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gu.test.UserModel;

/**
 * <p>json请求测试</p>
 * @author  bobogu
 * @version $Id: JsonTestController.java, v 0.1 2015年4月23日 上午10:13:14 gushunbin Exp $
 */
@Scope("singleton")
@RestController
@RequestMapping(value = "test")
public class JsonTestController {

    @RequestMapping(value = "hello", method = RequestMethod.POST,consumes="application/json")
    public String receiveJson(UserModel model) {
        System.out.println(model);
        return "success";
    }
}
