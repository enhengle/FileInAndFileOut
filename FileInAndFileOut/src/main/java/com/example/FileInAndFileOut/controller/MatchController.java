package com.example.FileInAndFileOut.controller;

import com.example.FileInAndFileOut.response.Response;
import com.example.FileInAndFileOut.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lingwang
 * @date 2021/3/15 15:26
 */
@RestController
public class MatchController {

   @Autowired
    private MatchService service;

   @RequestMapping(path = "findList",method = RequestMethod.POST)
    public Response findList(){
       return Response.ok(service.findList());
   }

}