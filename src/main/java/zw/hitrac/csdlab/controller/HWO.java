package zw.hitrac.csdlab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Daniel Nkhoma
 */
@Controller
public class HWO {

    @RequestMapping("/hwo")
    public String index() {
        return "hwo/index";
    }
}
