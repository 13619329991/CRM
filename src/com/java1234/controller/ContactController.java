package com.java1234.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.java1234.entity.Contact;
import com.java1234.service.ContactService;
import com.java1234.util.ResponseUtil;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;

/**
 * 交往记录Controller层
 *
 * @author Administrator
 */
@Controller
@RequestMapping("/contact")
public class ContactController {

    @Resource
    private ContactService contactService;

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));   //true:允许输入空值，false:不能为空值
    }

    /**
     * 分页条件查询交往记录
     */
    @RequestMapping("/list")
    public String list(@RequestParam(value = "cusId", required = false) String cusId, HttpServletResponse response) throws Exception {
        Map<String, Object> map = new HashMap<>();
        map.put("cusId", cusId);
        List<Contact> contactList = contactService.find(map);
        JSONObject result = new JSONObject();
        JsonConfig jsonConfig = new JsonConfig();
        jsonConfig.setExcludes(new String[]{"customer"});
        jsonConfig.registerJsonValueProcessor(java.util.Date.class, new DateJsonValueProcessor("yyyy-MM-dd"));
        JSONArray jsonArray = JSONArray.fromObject(contactList, jsonConfig);
        result.put("rows", jsonArray);
        ResponseUtil.write(response, result);
        return null;
    }

    /**
     * 添加或者修改交往记录
     */
    @RequestMapping("/save")
    public String save(Contact contact, HttpServletResponse response) throws Exception {
        int resultTotal;
        if (contact.getId() == null) {
            resultTotal = contactService.add(contact);
        } else {
            resultTotal = contactService.update(contact);
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
     * 删除交往记录
     */
    @RequestMapping("/delete")
    public String delete(@RequestParam(value = "id") String id, HttpServletResponse response) throws Exception {
        contactService.delete(Integer.parseInt(id));
        JSONObject result = new JSONObject();
        result.put("success", true);
        ResponseUtil.write(response, result);
        return null;
    }


}
