package me.hoangple;

public class Album {

    private String title;
    private String artist;
    private String genre;
    private Song favoriteTrack;
    private int trackNumber;

    private static int numAlbums = 0;

    public Album(String title, Song favoriteTrack, int trackNumber) {
        this.title = title;
        this.favoriteTrack = favoriteTrack;
        this.artist = favoriteTrack.getArtist();
        this.genre = favoriteTrack.getGenre();
        this.trackNumber = trackNumber;
        numAlbums++;
    }

    public Album(String title, Song favoriteTrack) {
        this(title, favoriteTrack, 1);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
        favoriteTrack.setArtist(artist);
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
        favoriteTrack.setGenre(genre);
    }

    public Song getFavoriteTrack() {
        return favoriteTrack;
    }

    public void setFavoriteTrack(Song favoriteTrack) {
        this.favoriteTrack = favoriteTrack;
    }

    public int getTrackNumber() {
        return trackNumber;
    }

    public void setTrackNumber(int trackNumber) {
        this.trackNumber = trackNumber;
    }

    public static int getNumAlbums() {
        return numAlbums;
    }

    @Override
    public String toString() {
        return "Album{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
