package org.dodo.web.controller;


import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.coyote.Response;
import org.dodo.web.common.dto.Weather;
import org.springframework.web.bind.annotation.*;


@Slf4j
@RestController
@RequestMapping("weather")
public class WeatherController {

    @GetMapping("/getWeather")
    public String getWeather(@RequestParam String id){
        log.info("获取当天天气数据 id:{}",id);
        if(StringUtils.isBlank(id)){
            return "数据不能为空";
        }

    return "index.html";
    }
}
