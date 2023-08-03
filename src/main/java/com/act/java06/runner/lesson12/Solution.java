package com.act.java06.runner.lesson12;

import java.time.Duration;
import java.time.LocalDateTime;

public class Solution {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        Duration duration = Duration.ofDays(3).plusHours(11).plusMinutes(27);

        LocalDateTime after = now.plus(duration);
        LocalDateTime before = now.minus(duration);
        System.out.println(before);
        System.out.println(after);
    }
}
