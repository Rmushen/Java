package me.mushen.java.java8.lambdas.pojo;

import lombok.Getter;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * @Desc
 * @Author Remilia
 * @Create 2018-05-29
 */
@Getter
public class Artist {
    private String name;

    private List<Artist> members;

    private String nationality;

    public Artist(String name, String nationality) {
        this(name, Collections.emptyList(), nationality);
    }

    public Artist(String name, List<Artist> members, String nationality) {
        Objects.requireNonNull(name);
        Objects.requireNonNull(members);
        Objects.requireNonNull(nationality);

        this.name = name;
        this.members = members;
        this.nationality = nationality;
    }
}
