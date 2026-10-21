package cn.weiguang;

import com.alibaba.fastjson2.JSON;

public class Main5task4 {
    public static void main(String[] args) {
        QueryRequest request = new QueryRequest();
        request.setTrackingNumber("SF1123456789");
        request.setPhone("13005433678");
        String json = JSON.toJSONString(request);
        System.out.println(json);

        QueryRequest r1 = JSON.parseObject(json, QueryRequest.class);
        System.out.println(r1.getPhone());
        System.out.println(r1.getTrackingNumber());
    }
}
