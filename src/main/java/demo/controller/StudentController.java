package demo.controller;

import demo.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/student/")
public class StudentController {
    @GetMapping("list")
    public String index(){
        return "index";
    }

    @GetMapping("create")
    public ModelAndView showCreate(){
        ModelAndView modelAndView = new ModelAndView("create");
        modelAndView.addObject("student", new Student());
        modelAndView.addObject("mess", "Day la form tao moi");
        return modelAndView;
    }

    @PostMapping("create")
    public ModelAndView createStudent(@ModelAttribute Student student){
        ModelAndView modelAndView = new ModelAndView("create");
        modelAndView.addObject("student", student );
        modelAndView.addObject("mess", "Tao moi thanh cong");
        return modelAndView;
    }

}
