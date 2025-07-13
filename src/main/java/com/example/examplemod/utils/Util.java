package com.example.examplemod.utils;

import net.minecraft.client.Minecraft;
import net.minecraft.util.StringUtils;

public class Util {

    public static String stripColor(final String s) {
        if (s.isEmpty()) {
            return s;
        }
        final char[] array = StringUtils.stripControlCodes(s).toCharArray();
        final StringBuilder sb = new StringBuilder();
        for (final char c : array) {
            if (c < '\u007f' && c > '\u0014') {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static boolean slash3(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == '/') count++;
            if (count == 2) return true;
        }
        return false;
    }


}