package edu.mum.cs.cs425.finalexam.wakandadrsystem.controller;

import edu.mum.cs.cs425.finalexam.wakandadrsystem.model.Citizen;
import edu.mum.cs.cs425.finalexam.wakandadrsystem.service.CitizenService;
import edu.mum.cs.cs425.finalexam.wakandadrsystem.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class CitizenController {

    @Autowired
    public CitizenService citizenService;
    @Autowired
    public StateService stateService;

    @GetMapping(value = {"/wakanda/citizens/list"})
      public ModelAndView suppliersList(@RequestParam(defaultValue = "0") int pageno) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("citizens", citizenService.getAllCitizens(pageno));
        modelAndView.addObject("currentPageNo", pageno);
        modelAndView.addObject("yearlySalary",citizenService.calculateYearlyIncome());
        modelAndView.setViewName("citizens/list");
        return modelAndView;
    }

    @GetMapping(value={"/wakanda/new"})
    public String registerView(Model model) {
        model.addAttribute("citizen", new Citizen());
        model.addAttribute("states", stateService.getAllStates());
        return "citizens/add";
    }

    @PostMapping(value = {"/wakanda/new/post"})
    public String registerPost(@Valid @ModelAttribute("citizen") Citizen citizen, BindingResult bindingResult, Model model){
        if(bindingResult.hasErrors()){
            model.addAttribute("errors", bindingResult.getAllErrors());
            return "citizens/add";
        }
        citizenService.saveCitizen(citizen);
        return "redirect:/wakanda/citizens/list";
    }
}
