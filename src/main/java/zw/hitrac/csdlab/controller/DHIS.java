package zw.hitrac.csdlab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author charlesc
 */
@Controller
public class DHIS {
    
    @RequestMapping("/dhis")
    public String index(){
        return "dhis/index";
    }
}
