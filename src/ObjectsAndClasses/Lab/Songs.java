package ObjectsAndClasses.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Songs {


    static class Song {
        String typeList;
        String name;
        String time;

        public void setTypeList(String typeList) {
            this.typeList = typeList;
        }

        public String getTypeList() {
            return this.typeList;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public void setTime(String time) {
            this.time = time;
        }

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int songsCount = Integer.parseInt(scanner.nextLine());

        List<Song> songsList = new ArrayList<>();

        for (int i = 0; i < songsCount; i++) {

            String[] data = scanner.nextLine().split("_");

            String songType = data[0];
            String songName = data[1];
            String songDuration = data[2];

            Song currentSong = new Song();
            currentSong.setTypeList(songType);
            currentSong.setName(songName);
            currentSong.setTime(songDuration);

            songsList.add(currentSong);

        }
        String command = scanner.nextLine();

        if (command.equals("all")) {
            for (Song item : songsList) {
                System.out.println(item.getName());
            }
        } else {
            for (Song item : songsList) {
                if (item.getTypeList().equals(command)) {
                    System.out.println(item.getName());
                }
            }
        }
    }
}
