package pro.sky.curswork2.Service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import pro.sky.curswork2.MainClasses.Question;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ExaminerServiceImplTest {
    @Mock
    private JavaQuestionService javaQuestionService;

    @InjectMocks
    private ExaminerServiceImpl examinerService;

    @Test
    public void getQuestion() {
        Mockito.when(javaQuestionService.getSize()).thenReturn(4);
        Mockito.when(javaQuestionService.getRandomQuestion())
                .thenReturn(new Question("question1","answer1"))
                .thenReturn(new Question("question1","answer1"))
                .thenReturn(new Question("question2","answer2"))
                .thenReturn(new Question("question3","answer3"))
                .thenReturn(new Question("question4","answer4"));
        assertThat(examinerService.getQuestions(3)).containsExactlyInAnyOrder(
                new Question("question1","answer1"),
                new Question("question2","answer2"),
                new Question("question3","answer3"));
    }

}