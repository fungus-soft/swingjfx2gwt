package java.awt;

import java.io.IOException;

import java.io.File;

public class Desktop {

    private static Desktop desktop;

    public static enum Action {
        OPEN,
        EDIT,
        PRINT,
        MAIL,
        BROWSE
    };

    public static Desktop getDesktop() {
        if (desktop == null)
            desktop = new Desktop();
        return desktop;
    }

    public void open(File f) throws IOException {
        // TODO Auto-generated method stub
    }

    public static boolean isDesktopSupported() {
        return false;
    }

    public boolean isSupported(Action action) {
        // TODO
        return false;
    }

}