package  com.sec.security.exam.controller;

import com.sec.security.exam.Model.Examdates;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
public class DefaultController {

    @GetMapping("/")
    public String home1() {
        return "/home";
    }

    @GetMapping("/home")
    public String home() {
        return "/home";
    }

    @GetMapping("/admin")
    public String admin() {
        return "/admin";
    }

    @GetMapping("/user")
    public String user() {
        return "/user";
    }

    @GetMapping("/adddates" )
    public String adddates() {
        return "/adddates";
    }
    @RequestMapping("selectdate")
    public ModelAndView showMessage() {
        ModelAndView model = null;
        try {
            Map<String, String> sampleDropdownMap = new HashMap<String, String>();
            sampleDropdownMap.put("Java", "java");
            sampleDropdownMap.put("PHP", "php");
            model = new ModelAndView("hello", "dropDownItems", sampleDropdownMap);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return model;
    }
    @RequestMapping(path="/adddates",method= RequestMethod.POST )
    public ModelAndView viewDates(@RequestParam("FirstDate") String FirstDate,
                            @RequestParam("SecondDate") String SecondDate,
                            ModelMap modelMap) {
//        Examdates firstDate,secondDate;
//        firstDate.setExamdate(new Date(FirstDate));

        System.out.println(FirstDate +" "+ SecondDate);
        ModelAndView model = null;
        try {
            Map<String, String> sampleDropdownMap = new HashMap<>();
            sampleDropdownMap.put(FirstDate, FirstDate);
            sampleDropdownMap.put(SecondDate, SecondDate);
            model = new ModelAndView("selectdate", "dropDownItems", sampleDropdownMap);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return model;
    }
    @GetMapping("/about")
    public String about() {
        return "/about";
    }

    @GetMapping("/login")
    public String login() {
        return "/login";
    }

    @GetMapping("/403")
    public String error403() {
        return "/error/403";
    }

}
