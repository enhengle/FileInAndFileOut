package com.example.FileInAndFileOut.dao.controller;

import com.example.FileInAndFileOut.dao.respository.dbtext.TextoneRespository;
import com.example.FileInAndFileOut.dao.service.TextoneService;
import com.example.FileInAndFileOut.response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lingwang
 * @date 2021/3/17 9:59
 */
@RestController
public class TextoneController {

    @Autowired
    private TextoneService service;

    @RequestMapping(path = "findtextone",method = RequestMethod.POST)
    public Response findAll(){
        return Response.ok(service.findtextone());
    }
}
