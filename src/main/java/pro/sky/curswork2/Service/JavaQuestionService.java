package pro.sky.curswork2.Service;

import org.springframework.stereotype.Service;
import pro.sky.curswork2.MainClasses.Question;

import java.util.*;

@Service
public class JavaQuestionService implements QuestionService {

    private final Set<Question> questionsAndAnswers = new HashSet<>();

    private final  Random random = new Random();

    @Override
    public int getSize() {
        return questionsAndAnswers.size();
    }

    @Override
    public Question add(String question, String answer) {
        Question questions = new Question(question,answer);
        return add(questions);
    }

    public Question add(Question question) {
        questionsAndAnswers.add(question);
        return question;
    }

    @Override
    public Question remove(Question question) {
        if (questionsAndAnswers.contains(question)) {
            questionsAndAnswers.remove(question);
        }
        return question;
    }

    @Override
    public Collection<Question> getALl() {

        return new ArrayList<>(questionsAndAnswers);
    }

    @Override
    public Question getRandomQuestion() {
        return new ArrayList<>(questionsAndAnswers).get(random.nextInt(questionsAndAnswers.size()));
    }
}
