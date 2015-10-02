package zw.hitrac.csdlab.controller;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import zw.co.hitrac.zhris.csd.adapter.common.domain.WrappedProvider;
import zw.co.hitrac.zhris.csd.adapter.common.util.ProviderFinder;

/**
 *
 * @author Charles Chigoriwa
 */
@Controller
public class Search {

    @RequestMapping("/search")
    public String searchInput() {
        return "search/input";
    }

    @RequestMapping("/search/result")
    public String searchResult(@RequestParam(name = "nationalId", required = false) String nationalId, Model model) {
        if (nationalId == null) {
            return "search/input";
        } else {
            String address = "http://192.168.1.22:8984/CSD/csr/mohcc/careServicesRequest";
            List<WrappedProvider> wrappedProviders = ProviderFinder.getProviderFromAllDirectories(nationalId, address);
            if (wrappedProviders == null || wrappedProviders.isEmpty()) {
                return "search/NotFound";
            } else {
                model.addAttribute("wrappedProviders", wrappedProviders);
                return "search/result";
            }
        }
    }

}
