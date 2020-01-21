package mycraft.springframwork.sfgpetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.xml.ws.RequestWrapper;

@Controller
@RequestMapping("/owners")
public class OwnerController {

@RequestMapping({"/","","/index","index.html"})
public String listOwners(){
    return "owners/index";
}
}
