package org.all_homeworks.collections_and_generics.generics;

import java.util.ArrayList;
import java.util.List;

public class Library<T> {
    private List<T> mediaList;

    public Library() {
        mediaList = new ArrayList<>();
    }

    public void addMedia(T media) {
        if (check(media)) {
            mediaList.add(media);
            return;
        }

        throw new NullPointerException("the given media must not be null");
    }

    private boolean check(T param) {
        if(param != null)
            return true;
        return false;
    }

    public void print() {
        if (!mediaList.isEmpty()) {
            for (T t: mediaList) {
                System.out.println(t + "\t");
            }
            return;
        }
        throw new IllegalStateException("the mediaList is empty");
    }
}
