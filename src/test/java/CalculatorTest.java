import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CalculatorTest {

    @Mock
    CalculatorService service;

    @InjectMocks
    Calculator c;

    @Rule
    public MockitoRule rule = MockitoJUnit.rule();


    @Test
    public void testPerform(){
        when(service.add(1,2)).thenReturn(3);
        assertEquals(6, c.perform(1,2));
        verify(service).add(1,2);
    }
}