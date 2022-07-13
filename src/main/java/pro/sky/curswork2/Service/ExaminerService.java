package pro.sky.curswork2.Service;

import pro.sky.curswork2.MainClasses.Question;

import java.util.Collection;

public interface ExaminerService {
    Collection<Question> getQuestions(int amount);
}
