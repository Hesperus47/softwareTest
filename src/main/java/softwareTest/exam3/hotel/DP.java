package softwareTest.exam3.hotel;

public class DP implements IData{
    private static String[][] rooms;

    @Override
    public void iniRooms() {
        rooms = new String[10][12];
        for (int i = 0; i < rooms.length; i++){
            for (int j = 0; j < rooms[0].length; j++){
                rooms[i][j] = "EMPTY";
            }
        }
    }

    @Override
    public String in_Out_Room(int roomNo, String name) {
        if (name.equals("EMPTY")) {
            if(roomNo(roomNo)==0){
                rooms[roomNo/100-1][roomNo%100-1]=name;
                return roomNo+"退房成功";
            }else return "该房间没有客人入住，退房失败";
        }else if (roomNo(roomNo)==0){
            return "该房间已经有客人入住";
        }else {
            rooms[roomNo/100-1][roomNo%100-1]=name;
            return  name + "成功入住" + roomNo + "房间";
        }
    }

    @Override
    public void search() {
        for(int i = 0; i<rooms.length;i++){
            for (int j = 0;j<rooms[0].length;j++){
                if(j+1<10){
                    System.out.print(i+1+"0"+(j+1) + "\t\t");
                }else {
                    System.out.print(i+1+""+(j+1) + "\t\t");
                }
            }
            System.out.println();
            for (int j = 0;j<rooms[0].length;j++){
                System.out.print(rooms[i][j] + "\t");
            }
            System.out.println();
        }
    }

    @Override
    public String command(String comm, int roomNo, String name) {
        if ("in".equalsIgnoreCase(comm)){
            if(validRoomNo(roomNo)){
                return in_Out_Room(roomNo,name);
            }else {
                return "房间号错误";
            }
        }else if("out".equalsIgnoreCase(comm)) {
            if (validRoomNo(roomNo)) {
                return in_Out_Room(roomNo, "EMPTY");
            } else {
                return "房间号错误";
            }
        }else {
            return "命令输入错误！";
        }
    }

    public int roomNo(int roomNo){
        if("EMPTY".equals(rooms[(roomNo/100)-1][(roomNo%100)-1])){
            return roomNo;
        }else return 0;
    }

    private static boolean validRoomNo(int roomNo) {
        if((roomNo/100 >10) || (roomNo/100<1) || (roomNo%100>12) || (roomNo%100<1)){
            return false;
        }else return true;
    }
}