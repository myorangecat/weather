package org.dodo.web;

import cn.hutool.http.HttpUtil;
import com.alibaba.fastjson2.JSONObject;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.net.http.HttpClient;
import java.util.stream.Stream;


@Slf4j
@SpringBootTest
class WebApplicationTests {

    @Autowired
    private ThreadPoolTaskExecutor threadPoolTaskExecutor;

    @Test
    void contextLoads() {

//        while (true) {
//            threadPoolTaskExecutor.execute(() -> {
//                String result = HttpUtil.post("https://www.google.com.hk/", "");
//                log.info("请求结果：{}",result);
//                JSONObject jsonObject = JSONObject.parseObject(result);
//                log.info("JSON 结果：{}", jsonObject);
//
//            });
//
//
//        }




    }

}
