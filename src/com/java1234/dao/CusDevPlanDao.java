package com.java1234.dao;

import java.util.List;
import java.util.Map;

import com.java1234.entity.CusDevPlan;

/**
 * �ͻ������ƻ�Dao�ӿ�
 *
 * @author Administrator
 */
public interface CusDevPlanDao {


    /**
     * ��ѯ�ͻ������ƻ�����
     */
    List<CusDevPlan> find(Map<String, Object> map);


    /**
     * ��ȡ�ܼ�¼��
     */
    Long getTotal(Map<String, Object> map);

    /**
     * �޸Ŀͻ������ƻ�
     */
    int update(CusDevPlan cusDevPlan);

    /**
     * ��ӿͻ������ƻ�
     */
    int add(CusDevPlan cusDevPlan);

    /**
     * ɾ���ͻ������ƻ�
     */
    int delete(Integer id);

}
