package me.hoangple;

import java.util.Scanner;

public class MusicCollection {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Song song1 = new Song("Turn the Lights Off", "Tally Hall", "Rock");
        Song song2 = new Song("SPACE MAN", "Sam Ryder");
        Song song3 = new Song("Lock Me In", "Circus Mircus");

        Album album1 = new Album("Good & Evil", song1, 1);
        Album album2 = new Album("SPACE MAN", song2);
        Album album3 = new Album("Lock Me In", song3);

        Album[] albums = {album1, album2, album3};

        while (true) {

            for (int i = 0; i < albums.length; i++) {
                System.out.println((i+1) +". " + albums[i].getTitle());
            }
            int selection = 0;

            System.out.print("Enter an album that you want to use: ");
            selection = sc.nextInt();

            if (selection == 0) {
                break;
            }
            albumOptions(albums[selection-1]);
        }
    }

    public static void albumOptions(Album album) {
        System.out.println(album.toString());
        int selection = 0;
        System.out.println("1. Get Favorite Track");
        System.out.println("2. Change Genre");
        System.out.println("3. Return");

        System.out.print("Enter your choice: ");
        selection = sc.nextInt();

        if (selection == 1) {
            System.out.println(album.getFavoriteTrack().toString());
        } else if (selection == 2) {
            System.out.println("Enter new genre: ");
            sc.nextLine();
            album.setGenre(sc.nextLine());
        }
    }
}
