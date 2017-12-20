package com.java1234.util;

/**
 * �ַ���������
 */
public class StringUtil {

	/**
	 * �ж��Ƿ��ǿ�
	 */
	public static boolean isEmpty(String str){
		return str==null||"".equals(str.trim());
	}
	
	/**
	 * �ж��Ƿ��ǿ�
	 */
	public static boolean isNotEmpty(String str){
		return (str!=null)&&!"".equals(str.trim());
	}
	
	/**
	 * ��ʽ��ģ����ѯ
	 */
	public static String formatLike(String str){
		if(isNotEmpty(str)){
			return "%"+str+"%";
		}else{
			return null;
		}
	}
}
