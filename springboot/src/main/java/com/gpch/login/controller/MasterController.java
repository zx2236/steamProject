package com.gpch.login.controller;

import java.util.ArrayList;
import java.util.List;

import com.gpch.login.model.Master;
import com.gpch.login.service.MasterService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MasterController {
    @Autowired
    private MasterService masterService;

    @RequestMapping(value={"/admin/master"}, method = RequestMethod.GET)
    public ModelAndView master(){
        ModelAndView modelAndView = new ModelAndView();
        List<Master> masterList = new ArrayList<Master>();
        for(Master master : masterService.findAll()){
            masterList.add(master);
        }
        modelAndView.addObject("masterList", masterList);
        modelAndView.setViewName("master");
        return modelAndView;
    }

}