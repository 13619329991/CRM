package com.java1234.dao;

import java.util.List;
import java.util.Map;

import com.java1234.entity.LinkMan;

/**
 * ��ϵ��Dao�ӿ�
 *
 * @author Administrator
 */
public interface LinkManDao {


    /**
     * ��ѯ��ϵ�˼���
     */
    List<LinkMan> find(Map<String, Object> map);


    /**
     * ��ȡ�ܼ�¼��
     */
    Long getTotal(Map<String, Object> map);

    /**
     * �޸���ϵ��
     */
    int update(LinkMan linkMan);

    /**
     * �����ϵ��
     */
    int add(LinkMan linkMan);

    /**
     * ɾ����ϵ��
     */
    int delete(Integer id);

}
