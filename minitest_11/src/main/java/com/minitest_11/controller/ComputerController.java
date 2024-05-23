package com.minitest_11.controller;

import com.minitest_11.model.Computer;
import com.minitest_11.model.Type;
import com.minitest_11.service.interface_service.IComputerService;
import com.minitest_11.service.interface_service.ITypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/computers")
public class ComputerController {
    @Autowired
    private IComputerService computerService;

    @Autowired
    private ITypeService typeService;

    @ModelAttribute("types")
    public Iterable<Type> listTypes() {
        return typeService.findAll();
    }

    @GetMapping
    public ModelAndView listComputer() {
        Iterable<Computer> computers = computerService.findAll();
        ModelAndView mav = new ModelAndView("/computer_views/list");
        mav.addObject("computers", computers);
        return mav;
    }
}
