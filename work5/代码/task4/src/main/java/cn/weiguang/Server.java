package cn.weiguang;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONWriter;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class Server {
    private static final int PORT = 8000;
    // 模拟快递柜数据：key = 快递单号_手机号，value = 取件码
    private static final Map<String, String> expressMap = new HashMap<>();

    public static void main(String[] args) throws IOException {
        // 初始化一些测试数据
        initializeExpressData();
        // 创建HTTP服务器，监听指定端口
        HttpServer server = HttpServer.create(new InetSocketAddress(PORT), 0);
        // 设置路由和处理程序
        server.createContext("/query", new QueryHandler());
        // 启动服务器
        server.start();
        System.out.println("Server started on port " + PORT);
    }

    private static void initializeExpressData() {
        expressMap.put("SF123456789_13005433678", "1234");
        expressMap.put("JD987654321_19805433168", "5678");
        expressMap.put("YT456789123_13905479698", "9012");
        expressMap.put("ZT789123456_18505433664", "3456");
    }

    static class QueryHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            // 非POST请求返回405 Method Not Allowed
            if (!"POST".equals(exchange.getRequestMethod())) {
                exchange.sendResponseHeaders(405, -1);
                exchange.close();
                return;
            }

            try {
                // 读取请求体（请求体是字节流，按UTF-8转成字符串）
                String body = new String(exchange.getRequestBody().readAllBytes(), StandardCharsets.UTF_8);
                // 解析JSON请求，取出单号和手机号
                QueryRequest request = JSON.parseObject(body, QueryRequest.class);
                String trackingNumber = request.getTrackingNumber();
                String phone = request.getPhone();
                if (trackingNumber == null || trackingNumber.isBlank()) {
                    throw new IllegalArgumentException("单号不能为空");
                }
                if (phone == null || phone.isBlank()) {
                    throw new IllegalArgumentException("手机号不能为空");
                }

                String key = (trackingNumber + "_" + phone);
                String pickCode = expressMap.get(key);


                QueryResponse response = new QueryResponse();
                if (pickCode != null) {
                    response.setPick_code(pickCode);
                    response.setMsg("success");
                } else {
                    response.setPick_code(null);
                    response.setMsg("单号或手机号不匹配");
                }

                String json = JSON.toJSONString(response,JSONWriter.Feature.WriteNulls);
                byte[] responseBytes = json.getBytes(StandardCharsets.UTF_8);

                exchange.getResponseHeaders().set("Content-Type","application/json;charset=UTF-8");
                exchange.sendResponseHeaders(200, responseBytes.length);
                try (OutputStream out = exchange.getResponseBody()) {
                    out.write(responseBytes);
                    // TODO 4: 根据查询结果构造QueryResponse
                    // TODO 5: 把响应对象序列化成JSON并发送响应（状态码200）
                }
                }  catch (Exception e) {
                QueryResponse errorResponse = new QueryResponse();
                errorResponse.setPick_code(null);
                errorResponse.setMsg("请求格式错误");

                String json1 = JSON.toJSONString(errorResponse, JSONWriter.Feature.WriteNulls);
                System.out.println(json1);

                byte[] errorBytes = json1.getBytes(StandardCharsets.UTF_8);
                exchange.getResponseHeaders().set("Content-Type","application/json;charset=UTF-8");
                exchange.sendResponseHeaders(400, errorBytes.length);

                try(OutputStream Eout = exchange.getResponseBody()) {
                    Eout.write(errorBytes);
                }

                // 处理异常，返回400状态码(Bad Request)
                // TODO 6: 返回状态码400和错误JSON {"pick_code":null,"msg":"请求格式错误"}
            }
        }
    }
}