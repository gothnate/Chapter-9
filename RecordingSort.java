import java.util.*;
public class RecordingSort {

    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        Recording[] songList = new Recording[5];
        String song;
        String artist;
        int time;
        String order;

        for (int i = 0; i < songList.length; i++) {
            System.out.print("Enter Song Title " + (i + 1) + ": ");
            song = input.nextLine();
            System.out.print("Enter Artist Name " + (i + 1) + ": ");
            artist = input.nextLine();
            System.out.print("Enter Time " + (i + 1) + ": ");
            time = input.nextInt();
            input.nextLine();
            Recording tempSong = new Recording();

            tempSong.setSong(song);
            tempSong.setArtist(artist);
            tempSong.setPlayTime(time);
            songList[i] = tempSong;
        }

        System.out.println("Sort by song, artist, or time: ");
        order = input.nextLine().toUpperCase();

        if (order.charAt(0) == 'S') {
            sortBySong(songList);
        } else {
            if (order.charAt(0) == 'A') {
                sortByArtist(songList);
            } else {
                sortByTime(songList);
            }
        }

        input.close();

        String message = "";
        for (int i = 0; i < songList.length; i++) {
            message = message + "\nArtist: " + songList[i].getArtist() + "\nSong: " + songList[i].getSong()
                    + "\nPlay Time: " + songList[i].getPlayTime();
        }
        System.out.println(message);


    }

    public static void sortByArtist(Recording[] array) {
        // Write your code here
        int a;
        int b;
        Recording temp;
        String stringb;
        String stringbPlus;

        for (a = 0; a < array.length - 1; a++) {
            for (b = 0; b < array.length - 1; b++) {
                stringb = array[b].getArtist();
                stringbPlus = array[b + 1].getArtist();
                if (stringb.compareTo(stringbPlus) > 0) {
                    temp = array[b];
                    array[b] = array[b + 1];
                    array[b + 1] = temp;
                }
            }
        }
    }

    public static void sortBySong(Recording[] array) {
        // Write your code here
        int a;
        int b;
        Recording temp;
        String stringb;
        String stringbPlus;

        for (a = 0; a < array.length - 1; a++) {
            for (b = 0; b < array.length - 1; b++) {
                stringb = array[b].getSong();
                stringbPlus = array[b + 1].getSong();
                if (stringb.compareTo(stringbPlus) > 0) {
                    temp = array[b];
                    array[b] = array[b + 1];
                    array[b + 1] = temp;
                }
            }
        }

    }

    public static void sortByTime(Recording[] array) {
        // Write your code here
        int a;
        int b;
        Recording temp;

        for (a = 0; a < array.length - 1; a++) {
            for (b = 0; b < array.length - 1; b++) {
                if (array[b].getPlayTime() > array[b + 1].getPlayTime()) {
                    temp = array[b];
                    array[b] = array[b + 1];
                    array[b + 1] = temp;
                }
            }
        }

    }
}