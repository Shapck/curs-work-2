package pro.sky.curswork2.Service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pro.sky.curswork2.MainClasses.Question;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;


class JavaQuestionServiceTest {

    JavaQuestionService javaQuestionService = new JavaQuestionService();

    Question question = new Question("sdas","sdasd");

    @Test
     void getSize() {

    }

    @Test
    void add() {
        Question question1 = javaQuestionService.add("sdas","sdasd");
        Assertions.assertEquals(question,question1);
    }

    @Test
    void testAdd() {
        Question question1 = javaQuestionService.add(question);
        Assertions.assertEquals(question,question1);
    }

    @Test
    void remove() {
        Question question1 = javaQuestionService.add("dfsdfs","dsada");
        Collection<Question> collection = javaQuestionService.getALl();
        assertThat(collection).hasSize(1);
        assertThat(collection.iterator().next()).isEqualTo(question1);
        javaQuestionService.remove(question1);
        collection = javaQuestionService.getALl();
        assertThat(collection).isEmpty();

    }

    @Test
    void getALl() {
        Question question1 = javaQuestionService.add("dfsdfs","dsada");
        Collection<Question> collection = javaQuestionService.getALl();
        assertThat(collection).hasSize(1);
        assertThat(collection.iterator().next()).isEqualTo(question1);
    }

    @Test
    void getRandomQuestion() {
        for (int i = 0; i < 5; i++) {
            javaQuestionService.add("asdas" + i, "Bsdfsd" + i);
        }
        Collection<Question> collection = javaQuestionService.getALl();
        Question question1 = javaQuestionService.getRandomQuestion();
        assertThat(collection).contains(question1);
    }
}