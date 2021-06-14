package com.xue.dubboapi.utils;

import java.util.ArrayList;
import java.util.List;

public class StringUtils {
    public Boolean isBlank(String str){
        if (str == null || str.equals("")){
            return true;
        } else {
            return false;
        }
    }
    public Boolean isNotBlank(String str){
        if (str == null || str.equals("")){
            return false;
        } else {
            return true;
        }
    }

    /**
     * 获得字符串的子字符串（有序），递归法
     * @param str
     * @return
     */
    public static List<String> getSubString(String str){
        List<String> list = new ArrayList<>();
        if (str == null){
            return null;
        }
        if (str.length()==1){
            list.add(str);
            return list;
        } else {
            List<String> subList = getSubString(str.substring(0, str.length() - 1));
            String last = str.substring(str.length() - 1,str.length());
            for (String string: subList){
                list.add(string);
                list.add(string+last);
            }
            list.add(last);
        }
        return list;
    }
}
