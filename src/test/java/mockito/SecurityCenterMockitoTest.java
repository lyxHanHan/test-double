package mockito;
import mock.DoorPanel;
import mock.SecurityCenter;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


public class SecurityCenterMockitoTest {
    private SecurityCenter securityCenter;

    @Test
    public void shouldVerifyDoorIsClosed() {
        DoorPanel mockDoorpanel = Mockito.mock(DoorPanel.class);
        securityCenter = new SecurityCenter(mockDoorpanel);
        securityCenter.switchOn();
        Mockito.verify(mockDoorpanel).close();
    }
}
