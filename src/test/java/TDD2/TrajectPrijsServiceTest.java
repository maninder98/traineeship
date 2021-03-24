package TDD2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class TrajectPrijsServiceTest {

    @InjectMocks
    private TrajectPrijsService target;
    @Mock
    private TrajectNaarTrajectEenheden esMock;
    @Mock
    private TrajectEenhedenNaarPrijs psMock;


    @Test
    void getTrajectPrijs() {
        //given
        when(esMock.getTrajectEenheden(eq("ams"), eq("apel"))).thenReturn(20);
        when(psMock.getPriceTrajectEenheden(anyInt())).thenReturn(3);

        //when
        int prijs = target.getTrajectPrijs("ams", "apel");

        //verify
        assertThat(prijs).isEqualTo(60);
        verify(esMock).getTrajectEenheden(anyString(), anyString()/*, times(1)*/);
        verify(psMock).getPriceTrajectEenheden(anyInt());





    }
}