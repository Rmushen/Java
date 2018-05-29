package me.mushen.java.java8.lambdas.pojo;

import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

/**
 * @Desc
 * @Author Remilia
 * @Create 2018-05-29
 */
public class Album implements Performance {
    private String name;

    private List<Track> tracks;

    private List<Artist> musicians;

    public Album(String name, List<Track> tracks, List<Artist> musicians) {
        Objects.requireNonNull(name);
        Objects.requireNonNull(tracks);
        Objects.requireNonNull(musicians);

        this.name = name;
        this.tracks = tracks;
        this.musicians = musicians;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Stream<Track> getTracks() {
        return tracks.stream();
    }

    @Override
    public Stream<Artist> getMusicians() {
        return musicians.stream();
    }

    public List<Track> getTrackList() {
        return tracks;
    }

    public List<Artist> getMusicianList() {
        return musicians;
    }
}
