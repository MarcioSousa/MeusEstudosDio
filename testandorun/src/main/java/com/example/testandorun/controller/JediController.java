/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.globallabs.springwebmvc.controller;

import br.com.globallabs.springwebmvc.model.Jedi;
import br.com.globallabs.springwebmvc.repository.JediRepository;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 *
 * @author Marcio Sousa
 */
@Controller
public class JediController {
    
    @Autowired
    private JediRepository repository;

    
    @GetMapping("/jedi")
    public ModelAndView jedi(){
        
        final ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("jedi");
        
        modelAndView.addObject("allJedi", repository.getAllJedi());
        
        return modelAndView;
    }
    
    @GetMapping("/new-jedi")
    public ModelAndView newJedi(){
        final ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("new-jedi");
        
        modelAndView.addObject("jedi", new Jedi());
        return modelAndView;
    }
    
    @PostMapping("/jedi")
    public String createJedi(@Valid @ModelAttribute Jedi jedi, BindingResult result, RedirectAttributes redirectAttributes){
        
        if(result.hasErrors()){
            return "new-jedi";
        }
        
        repository.add(jedi);
        
        redirectAttributes.addFlashAttribute("message", "Jedi Cadastrado com Sucesso!");
        
        return "redirect:jedi";
        
    }
    
    
    
}
