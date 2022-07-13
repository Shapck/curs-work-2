package pro.sky.curswork2.Service;

import org.springframework.stereotype.Service;
import pro.sky.curswork2.Exception.AlreadyExistsException;
import pro.sky.curswork2.MainClasses.Question;

import java.util.*;

@Service
public class ExaminerServiceImpl implements ExaminerService {
    private final QuestionService questionService;

    public ExaminerServiceImpl(QuestionService questionService) {
        this.questionService = questionService;
    }

    @Override
    public Collection<Question> getQuestions(int amount) {
        if (amount > questionService.getSize()) {
            throw new AlreadyExistsException();
        }
        Set<Question> questions = new HashSet<>();

        while (questions.size() < amount) {
            questions.add(questionService.getRandomQuestion());
        }
        return questions;
    }
}
