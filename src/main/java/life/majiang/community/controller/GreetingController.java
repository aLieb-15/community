package life.majiang.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author aLieb
 * @date 2023年01月30日 16:19
 */
@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(required = true, defaultValue = "World", name = "name")String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
}
