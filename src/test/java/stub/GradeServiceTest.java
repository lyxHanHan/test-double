package stub;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GradeServiceTest {

    private GradeService gradeService;
    GradeSystemStub gradeSystemStub;
    @BeforeEach
    public void setUp(){
        GradeSystemStub gradSystemSubs = new GradeSystemStub();
        gradeService = new GradeService(gradSystemSubs);
    }
    @Test
    public void shouldReturn90WhenCalculateStudentAverageGradeAndGradeIs80And90And100() {
        double result = gradeService.calculateAverageGrades(1L);
        assertEquals(90.0, result);
    }
}
