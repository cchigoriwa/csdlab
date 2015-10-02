package zw.hitrac.csdlab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Daniel Nkhoma
 */
@Controller
public class ThirdPartyIntegration {

    @RequestMapping("/thirdparty")
    public String index() {
        return "thirdparty/index";
    }
}
