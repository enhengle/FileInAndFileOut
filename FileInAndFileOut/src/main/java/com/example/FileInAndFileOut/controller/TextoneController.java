package com.example.FileInAndFileOut.controller;

import com.example.FileInAndFileOut.response.Response;
import com.example.FileInAndFileOut.service.Impl.TextoneServiceImpl;
import com.example.FileInAndFileOut.service.TextoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author lingwang
 * @date 2021/3/18 14:17
 */
@RestController
public class TextoneController {

    @Autowired
    private TextoneService service;

    @RequestMapping(path = "findAl",method = RequestMethod.POST)
    public Response findAl(){
        return Response.ok(service.findAl());
    }

    @RequestMapping(path = "getSessionId",method = RequestMethod.POST)
    public Response getSessionId(HttpServletRequest request){
        return Response.ok(request.getSession());
    }

}
