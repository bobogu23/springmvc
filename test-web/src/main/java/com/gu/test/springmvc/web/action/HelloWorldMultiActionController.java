//package com.gu.test.springmvc.web.action;
//
//import com.gu.test.UserModel;
//import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.servlet.mvc.multiaction.MultiActionController;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
///**
// * 多请求处理action
// *
// * @author gushunbin
// * @date 15-4-20
// */
//public class HelloWorldMultiActionController extends MultiActionController {
//    //    逻辑视图名
//    private String createView;
//
//    private String updateView;
//
//    private String deleteView;
//
//    private String listView;
//
//    private String redirectToListView;
//
//
//    public String create(HttpServletRequest request, HttpServletResponse response, UserModel user) {
//        if ("GET".equals(request.getMethod())) {
//            return getCreateView();
//        }
//        return getRedirectToListView();
//    }
//
//    public ModelAndView update(HttpServletRequest request, HttpServletResponse response, UserModel user) {
//        return new ModelAndView(getRedirectToListView());
//    }
//
//    public ModelAndView delete(HttpServletRequest request, HttpServletResponse response, UserModel user) {
//        ModelAndView mv = new ModelAndView();
//        mv.addObject("userList", new Object[]{"张三", "李四", "王五"});
//        mv.setViewName(getListView());
//        return mv;
//    }
//
//    @Override
//    protected String getCommandName(Object command) {
//        return "command";
//    }
//
//    public ModelAndView list(HttpServletRequest request, HttpServletResponse response) {
//        return new ModelAndView(getRedirectToListView());
//    }
//
//
//    public String getRedirectToListView() {
//        return redirectToListView;
//    }
//
//    public void setRedirectToListView(String redirectToListView) {
//        this.redirectToListView = redirectToListView;
//    }
//
//    public String getDeleteView() {
//        return deleteView;
//    }
//
//    public void setDeleteView(String deleteView) {
//        this.deleteView = deleteView;
//    }
//
//    public String getListView() {
//        return listView;
//    }
//
//    public void setListView(String listView) {
//        this.listView = listView;
//    }
//
//    public String getUpdateView() {
//        return updateView;
//    }
//
//    public void setUpdateView(String updateView) {
//        this.updateView = updateView;
//    }
//
//    public String getCreateView() {
//        return createView;
//    }
//
//    public void setCreateView(String createView) {
//        this.createView = createView;
//    }
//}
