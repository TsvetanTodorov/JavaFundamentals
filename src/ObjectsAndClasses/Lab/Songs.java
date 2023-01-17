package ObjectsAndClasses.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Songs {

    static class Song {
        String listType;
        String name;
        String duration;

        public Song(String listType, String name, String duration) {
            this.listType = listType;
            this.name = name;
            this.duration = duration;
        }

        public String getListType() {
            return this.listType;
        }

        public String getName() {
            return this.name;
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

            Song currentSong = new Song(songType, songName, songDuration);
            songsList.add(currentSong);

        }
        String command = scanner.nextLine();

        if (command.equals("all")) {
            printAllSongs(songsList);
        } else {
            printAllSongsByListType(songsList, command);
        }

    }
    public static void printAllSongs(List<Song> songsList) {
        for (Song currentSong : songsList) {
            System.out.println(currentSong.getName());
        }
    }

    public static void printAllSongsByListType(List<Song> songsList, String listType) {
        for (Song currentSong : songsList) {
            if (currentSong.getListType().equals(listType)) {
                System.out.println(currentSong.getName());
            }
        }
    }
}
