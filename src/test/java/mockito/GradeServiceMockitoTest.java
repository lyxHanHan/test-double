package mockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import stub.GradeService;
import stub.GradeSystem;

import java.util.Arrays;
import java.util.Collection;

import static org.mockito.Mockito.*;

public class GradeServiceMockitoTest {
    private GradeService gradeService;
    @Test
    public void shouldReturn90WhenCalculateStudentAverageGradeAndGradeIs80And90And100() {
        GradeSystem gradeSystem = Mockito.mock(GradeSystem.class);
        gradeService = new GradeService(gradeSystem);
        when(gradeSystem.gradesFor(1l)).thenReturn(Arrays.asList(90.0, 80.0, 100.0));
        Assertions.assertEquals(90.0,gradeService.calculateAverageGrades(1L));
    }
}
