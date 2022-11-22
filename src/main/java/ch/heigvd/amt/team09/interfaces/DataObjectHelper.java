package ch.heigvd.amt.team09.interfaces;

import java.io.InputStream;
import java.net.URL;
import java.nio.file.Path;

public interface DataObjectHelper {
    void create();

    void create(String objectName, Path filePath);

    boolean exists(String objectName);

    boolean exists();

    void delete();

    void delete(String objectName);

    URL publish(String objectName) throws NoSuchObjectException;

    InputStream get(String objectName);

    class NoSuchObjectException extends Exception {
        public NoSuchObjectException(String message) {
            super(message);
        }
    }
}

