package zw.hitrac.csdlab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author charlesc
 */
@Controller
public class Home {
    
    @RequestMapping("/")
    public String index(){
        return "index";
    }
    
    @RequestMapping("/about")
    public String about(){
        return "about";
    }
    
    @RequestMapping("/contact")
    public String contact(){
        return "contact";
    }
    
}
