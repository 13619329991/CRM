package com.java1234.dao;

import java.util.List;
import java.util.Map;

import com.java1234.entity.CustomerReprieve;

/**
 * �ͻ���ʧ�ݻ���ʩDao�ӿ�
 *
 * @author Administrator
 */
public interface CustomerReprieveDao {


    /**
     * ��ѯ�ͻ���ʧ�ݻ���ʩ����
     */
    List<CustomerReprieve> find(Map<String, Object> map);


    /**
     * ��ȡ�ܼ�¼��
     */
    Long getTotal(Map<String, Object> map);

    /**
     * �޸Ŀͻ���ʧ�ݻ���ʩ
     */
    int update(CustomerReprieve customerReprieve);

    /**
     * ��ӿͻ���ʧ�ݻ���ʩ
     */
    int add(CustomerReprieve customerReprieve);

    /**
     * ɾ���ͻ���ʧ�ݻ���ʩ
     */
    int delete(Integer id);

}
