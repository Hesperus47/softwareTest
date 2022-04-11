package softwareTest.exam3.hotel;

public interface IData {
    public void iniRooms();
    public String in_Out_Room(int roomNo,String name);
    public void search();
    public String command(String comm, int roomNo, String name);
}
