package com.java1234.dao;

import java.util.List;
import java.util.Map;

import com.java1234.entity.Contact;

/**
 * ������¼Dao�ӿ�
 *
 * @author Administrator
 */
public interface ContactDao {


    /**
     * ��ѯ������¼����
     */
    List<Contact> find(Map<String, Object> map);


    /**
     * ��ȡ�ܼ�¼��
     */
    Long getTotal(Map<String, Object> map);

    /**
     * �޸Ľ�����¼
     */
    int update(Contact contact);

    /**
     * ��ӽ�����¼
     */
    int add(Contact contact);

    /**
     * ɾ��������¼
     */
    int delete(Integer id);

}
