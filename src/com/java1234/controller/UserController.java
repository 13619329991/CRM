package com.java1234.controller;

import com.java1234.entity.PageBean;
import com.java1234.entity.User;
import com.java1234.service.UserService;
import com.java1234.util.ResponseUtil;
import com.java1234.util.StringUtil;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * �û�Controller��
 *
 * @author Administrator
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    /**
     * �û���¼
     */
    @RequestMapping("/login")
    public String login(User user, HttpServletRequest request) throws Exception {
        User resultUser = userService.login(user);
        if (resultUser == null) {
            request.setAttribute("user", user);
            request.setAttribute("errorMsg", "�û������������");
            return "login";
        } else {
            HttpSession session = request.getSession();
            session.setAttribute("currentUser", resultUser);
            return "redirect:/main.jsp";
        }
    }

    /**
     * ��ҳ������ѯ�û�
     */
    @RequestMapping("/list")
    public String list(@RequestParam(value = "page", required = false) String page,
                       @RequestParam(value = "rows", required = false) String rows,
                       User s_user,
                       HttpServletResponse response) throws Exception {
        PageBean pageBean = new PageBean(Integer.parseInt(page), Integer.parseInt(rows));
        Map<String, Object> map = new HashMap<>();
        map.put("userName", StringUtil.formatLike(s_user.getUserName()));
        map.put("start", pageBean.getStart());
        map.put("size", pageBean.getPageSize());
        List<User> userList = userService.find(map);
        Long total = userService.getTotal(map);
        JSONObject result = new JSONObject();
        JSONArray jsonArray = JSONArray.fromObject(userList);
        result.put("rows", jsonArray);
        result.put("total", total);
        ResponseUtil.write(response, result);
        return null;
    }

    /**
     * ��ȡ�ͻ�������Ϣ �����������õ�
     */
    @RequestMapping("/customerManagerComboList")
    public String customerManagerComboList(HttpServletResponse response) throws Exception {
        Map<String, Object> map = new HashMap<>();
        map.put("roleName", "�ͻ�����");
        List<User> userList = userService.find(map);
        JSONArray row = JSONArray.fromObject(userList);
        ResponseUtil.write(response, row);
        return null;
    }

    /**
     * ��ӻ����޸��û�
     */
    @RequestMapping("/save")
    public String save(User user, HttpServletResponse response) throws Exception {
        int resultTotal; // �����ļ�¼����
        if (user.getId() == null) {
            resultTotal = userService.add(user);
        } else {
            resultTotal = userService.update(user);
        }
        JSONObject result = new JSONObject();
        if (resultTotal > 0) {
            result.put("success", true);
        } else {
            result.put("success", false);
        }
        ResponseUtil.write(response, result);
        return null;
    }

    /**
     * ɾ���û�
     */
    @RequestMapping("/delete")
    public String delete(@RequestParam(value = "ids") String ids, HttpServletResponse response) throws Exception {
        String[] idsStr = ids.split(",");
        for (String id : idsStr) {
            userService.delete(Integer.parseInt(id));
        }
        JSONObject result = new JSONObject();
        result.put("success", true);
        ResponseUtil.write(response, result);
        return null;
    }

    /**
     * �޸��û�����
     */
    @RequestMapping("/modifyPassword")
    public String modifyPassword(Integer id, String newPassword, HttpServletResponse response) throws Exception {
        User user = new User();
        user.setId(id);
        user.setPassword(newPassword);
        int resultTotal = userService.update(user);
        JSONObject result = new JSONObject();
        if (resultTotal > 0) {
            result.put("success", true);
        } else {
            result.put("success", false);
        }
        ResponseUtil.write(response, result);
        return null;
    }

    /**
     * �û�ע��
     */
    @RequestMapping("/logout")
    public String logout(HttpSession session) throws Exception {
        session.invalidate();
        return "redirect:/login.jsp";
    }
}
