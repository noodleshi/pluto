package com.virgo.pluto.common;

public class PThreadExecutor {

    private static PThreadExecutor sExecutor;

    public PThreadExecutor() {

    }

    public static PThreadExecutor getExecutor() {
        if (sExecutor == null) {
            sExecutor = new PThreadExecutor();
        }
        return sExecutor;
    }
}
