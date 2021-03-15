package com.example.FileInAndFileOut.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author lingwang
 * @date 2021/3/15 15:26
 */
@RestController
public class AccessController {

    @Resource
    private RestTemplate restTemplate;

    @RequestMapping(path = "access",method = RequestMethod.POST)
    @ResponseBody
    public String index(){
//        ResponseEntity<String> responseEntity = restTemplate.getForEntity("http://47.92.75.11:1233/match/searchAll?size=10&current=1",String.class);
        MultiValueMap<String,String> map = new LinkedMultiValueMap<>();
        map.add("size","10");
        map.add("current","1");
        String responseEntity = restTemplate.postForObject("http://47.92.75.11:1233/match/searchAll",map,String.class);
        return responseEntity;
    }

    @RequestMapping(path = "access2",method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<String> index2(){
//        ResponseEntity<String> responseEntity = restTemplate.getForEntity("http://47.92.75.11:1233/match/searchAll?size=10&current=1",String.class);
        MultiValueMap<String,String> map = new LinkedMultiValueMap<>();
        map.add("size","10");
        map.add("current","1");
        ResponseEntity<String> result = restTemplate.postForEntity("http://47.92.75.11:1233/match/searchAll",map,String.class);
        return result;
    }


}
