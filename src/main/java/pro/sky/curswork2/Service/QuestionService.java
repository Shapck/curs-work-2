package pro.sky.curswork2.Service;

import pro.sky.curswork2.MainClasses.Question;

import java.util.Collection;

public interface QuestionService {
    int getSize();
    Question add(String question, String answer);
    Question remove(Question question);
    Collection<Question>getALl();
    Question getRandomQuestion();

}