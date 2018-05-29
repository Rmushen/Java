package me.mushen.java.java8.lambdas.pojo;

import java.util.stream.Stream;

/**
 * @Desc
 * @Author Remilia
 * @Create 2018-05-29
 */
public interface Performance {
    String getName();

    Stream<Track> getTracks();

    Stream<Artist> getMusicians();
//    // TODO: test
//    default Stream<Artist> getAllMusicians() {
//        return getMusicians().flatMap(artist -> {
//            return concat(Stream.of(artist), artist.getMembers());
//        });
//    }
}
