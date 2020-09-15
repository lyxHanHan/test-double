package mockito;
import mock.DoorPanelMock;
import mock.SecurityCenter;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SecurityCenterMockitoTest {
    private SecurityCenter securityCenter;

    @Test
    public void shouldVerifyDoorIsClosed() {
        DoorPanelMock doorpanel = mock(DoorPanelMock.class);
        securityCenter = new SecurityCenter(doorpanel);
        securityCenter.switchOn();
        doorpanel.verifyThatMockDoorPanelWasCalled();

    }
}
