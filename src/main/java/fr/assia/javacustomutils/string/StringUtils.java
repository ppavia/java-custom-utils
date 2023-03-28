package fr.assia.javacustomutils.string;

import java.util.Optional;

public final class StringUtils {
    private StringUtils() {}

    public static boolean isNotBlank(String str) {
        return Optional.ofNullable(str).map(String::isBlank).orElse(true);
    }

    public static boolean isNotEmpty(String str) {
        return Optional.ofNullable(str).map(String::isEmpty).orElse(true);
    }

    public static String upperCaseFirstChar(String str) {
        return str == null ? "" : str.replaceFirst(str.substring(0,1), str.substring(0,1).toUpperCase());
    }
}
