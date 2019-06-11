package com.isinonet.lh.api;

import java.util.Map;

public class DealWith {

    public static String getContent(Map param){
        System.out.println(param);
        System.out.println(param.get("key1"));
        return param.get("key1")+"------";
    }
}
