package com.java1234.service;

import java.util.List;
import java.util.Map;

import com.java1234.entity.LinkMan;

/**
 * ��ϵ��Service�ӿ�
 *
 * @author Administrator
 */
public interface LinkManService {


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
