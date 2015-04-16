package com.gu.test.springmvc.web.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 * <p>AbstractController测试</p>
 * @author bobogu
 * @version $Id: HelloWorldAbstractController.java, v 0.1 2015年4月12日 下午2:38:13 bobogu23 Exp $
 */
public class HelloWorldAbstractController extends AbstractController{

    /* (non-Javadoc)
     * @see org.springframework.web.servlet.mvc.AbstractController#handleRequestInternal(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request,
                                                 HttpServletResponse response) throws Exception {
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("message","AbstractController test");
        modelAndView.setViewName("hello");
        return modelAndView;
    }

}
