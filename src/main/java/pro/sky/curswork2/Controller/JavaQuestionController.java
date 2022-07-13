package pro.sky.curswork2.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.curswork2.Service.JavaQuestionService;
import pro.sky.curswork2.MainClasses.Question;

import java.util.Collection;

@RestController
public class JavaQuestionController {

    private final JavaQuestionService javaQuestionService;

    public JavaQuestionController(JavaQuestionService javaQuestionService) {
        this.javaQuestionService = javaQuestionService;
    }

    @GetMapping(path = "/exam/java/add")
    public Question add(@RequestParam("question") String question, @RequestParam("answer") String answer) {
        return javaQuestionService.add(question,answer);
    }

    @GetMapping(path = "/exam/java/remove")
    public Question remove(@RequestParam("question") String question, @RequestParam("answer") String answer) {
        return javaQuestionService.remove(new Question(question,answer));
    }

    @GetMapping(path = "/exam/java")
    public Collection<Question> getQuestions() {
        return javaQuestionService.getALl();
    }

}
