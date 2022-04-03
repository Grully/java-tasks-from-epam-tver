package com.epam.javacollections.maintask;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TrackMethods {
    static String tracksLength(List<Track> list) {
        int t = list.stream().mapToInt(o -> o.trackLength).reduce(Integer::sum).getAsInt();
        int c = t % 60;
        int b = (t - c) % 3600 / 60;
        int a = (t - c) / 3600;
        String b1 = b < 10 ? "0" + b : String.valueOf(b);
        String c1 = c < 10 ? "0" + c : String.valueOf(c);
        return a + ":" + b1 + ":" + c1;
    }

    static void StyleSort(List<Track> list) {
        Comparator<Track> c = Comparator.comparing(o -> o.genre);
        list.sort(c);
    }

    static List<Track> listOfNeedlesslyLarge(List<Track> list, int firstSize, int secondSize) {
        List<Track> resultList = new ArrayList<>();
        for (Track track : list) {
            if (track.trackLength >= firstSize && track.trackLength <= secondSize) {
                resultList.add(track);
            }
        }
        return resultList;
    }

}
