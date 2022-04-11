package softwareTest.exam3.hotel;

public class MainRun {
    IData iData;
    public MainRun(IData iData){
        this.iData = iData;
    }

    public MainRun() {}

    public String RunTest(String comm, int roomNo, String name) {
        iniRooms();
        return command(comm, roomNo, name);
    }

    public String command(String comm, int roomNo, String name) {
        return iData.command(comm, roomNo, name);
    }

    public void iniRooms() {
        iData.iniRooms();
    }
}
