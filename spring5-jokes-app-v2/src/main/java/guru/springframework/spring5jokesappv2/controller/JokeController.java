package guru.springframework.spring5jokesappv2.controller;


  import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import guru.springframework.spring5jokesappv2.service.JokeServiceImpl;

 
 
  @Controller
  public class JokeController {
 
 
  private final JokeServiceImpl service;
 
 
  public JokeController() {
 this.service = new guru.springframework.spring5jokesappv2.service.JokeServiceImpl();
 }
 
 
 

  @RequestMapping("/getQuote")
  public String getmsg(Model model) {
  model.addAttribute("joke",service.getQuote());
  return "index"; }
 
  }
