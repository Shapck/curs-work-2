package pro.sky.curswork2.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.curswork2.MainClasses.Question;
import pro.sky.curswork2.Service.ExaminerService;

import java.util.Collection;

@RestController
public class ExamController {

    ExaminerService examinerService;

    public ExamController(ExaminerService examinerService) {
        this.examinerService = examinerService;
    }

    @GetMapping(path = "/exam/get")
    public Collection<Question> getQuestions(@RequestParam ("amount") int amount) {
        return examinerService.getQuestions(amount);
    }
}
