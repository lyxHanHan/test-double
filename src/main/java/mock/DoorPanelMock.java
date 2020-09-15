package mock;

public class DoorPanelMock extends DoorPanel{
    private boolean wasCalled = false;
    
    @Override
    void close() {
        this.wasCalled = true;
        System.out.println("Mock door panel class method is called");
    }
    public void verifyThatMockDoorPanelWasCalled(){
        assertTrue(wasCalled);
    }

    private void assertTrue(boolean wasCalled) {
    }
}
