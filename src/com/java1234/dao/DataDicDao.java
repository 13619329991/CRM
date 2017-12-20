package com.java1234.dao;

import java.util.List;
import java.util.Map;

import com.java1234.entity.DataDic;

/**
 * �����ֵ�Dao�ӿ�
 *
 * @author Administrator
 */
public interface DataDicDao {


    /**
     * ��ѯ�����ֵ伯��
     */
    List<DataDic> find(Map<String, Object> map);

    /**
     * ��ѯ���е������ֵ����Ƽ���
     */
    List<DataDic> findAll();

    /**
     * ��ȡ�ܼ�¼��
     */
    Long getTotal(Map<String, Object> map);

    /**
     * �޸������ֵ�
     */
    int update(DataDic dataDic);

    /**
     * ��������ֵ�
     */
    int add(DataDic dataDic);

    /**
     * ɾ�������ֵ�
     */
    int delete(Integer id);

}
