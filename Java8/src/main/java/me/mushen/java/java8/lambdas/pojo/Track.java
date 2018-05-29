package me.mushen.java.java8.lambdas.pojo;

import lombok.Getter;

/**
 * @Desc
 * @Author Remilia
 * @Create 2018-05-29
 */
@Getter
public class Track {
    private final String name;

    private final int length;

    public Track(String name, int length) {
        this.name = name;
        this.length = length;
    }
}
