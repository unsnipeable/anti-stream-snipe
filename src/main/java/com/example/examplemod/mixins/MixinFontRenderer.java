package com.example.examplemod.mixins;

import net.minecraft.client.gui.FontRenderer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

import com.example.examplemod.utils.Util;
import com.example.examplemod.ExampleMod;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SideOnly(Side.CLIENT)
@Mixin(FontRenderer.class)
public class MixinFontRenderer {


    @ModifyVariable(method = "renderString", at = @At("HEAD"), require = 1, ordinal = 0, argsOnly = true)
    private String renderString(String string) {
        if (string == null)
            return null;
        if (ExampleMod.maphider) {
            if (Util.slash3(Util.stripColor(string)) && string.contains("§7") && !string.contains("Select") && string.contains("§8")) string = string.replace("§8","§8§k");
            if (Util.stripColor(string).contains("Map")) {

                StringBuilder result = new StringBuilder();

                Pattern pattern = Pattern.compile("§a([a-zA-Z0-9]+)");
                Matcher matcher = pattern.matcher(string);

                int lastEnd = 0;
                while (matcher.find()) {
                    result.append(string, lastEnd, matcher.start());

                    String match = matcher.group(1);
                    StringBuilder replacement = new StringBuilder();
                    for (int i = 0; i < match.length(); i++) {
                        replacement.append("T");
                    }

                    result.append("§a§k").append(replacement);
                    lastEnd = matcher.end();
                }

                result.append(string.substring(lastEnd));

                string = result.toString();
            }

        }
        return string;
    }
    @ModifyVariable(method = "drawString(Ljava/lang/String;III)I", at = @At("HEAD"), require = 1, ordinal = 0, argsOnly = true)
    private String draw(String string) {
        if (string == null)
            return null;
        if (ExampleMod.maphider) {
            if (Util.slash3(Util.stripColor(string)) && string.contains("§7") && !string.contains("Select") && string.contains("§8")) string = string.replace("§8","§8§k");
            if (Util.stripColor(string).contains("Map")) {

                StringBuilder result = new StringBuilder();

                Pattern pattern = Pattern.compile("§a([a-zA-Z0-9]+)");
                Matcher matcher = pattern.matcher(string);

                int lastEnd = 0;
                while (matcher.find()) {
                    result.append(string, lastEnd, matcher.start());

                    String match = matcher.group(1);
                    StringBuilder replacement = new StringBuilder();
                    for (int i = 0; i < match.length(); i++) {
                        replacement.append("T"); 
                    }

                    result.append("§a§k").append(replacement);
                    lastEnd = matcher.end();
                }

                result.append(string.substring(lastEnd));

                string = result.toString();
            }

        }
        return string;
    }
    @ModifyVariable(method = "drawString(Ljava/lang/String;FFIZ)I", at = @At("HEAD"), require = 1, ordinal = 0, argsOnly = true)
    private String drew(String string) {
        if (string == null)
            return null;
        if (ExampleMod.maphider) {
            if (Util.slash3(Util.stripColor(string)) && string.contains("§7") && !string.contains("Select") && string.contains("§8")) string = string.replace("§8","§8§k");
            if (Util.stripColor(string).contains("Map")) {

                StringBuilder result = new StringBuilder();

                Pattern pattern = Pattern.compile("§a([a-zA-Z0-9]+)");
                Matcher matcher = pattern.matcher(string);

                int lastEnd = 0;
                while (matcher.find()) {
                    result.append(string, lastEnd, matcher.start());

                    String match = matcher.group(1);
                    StringBuilder replacement = new StringBuilder();
                    for (int i = 0; i < match.length(); i++) {
                        replacement.append("T"); 
                    }

                    result.append("§a§k").append(replacement);
                    lastEnd = matcher.end();
                }

                result.append(string.substring(lastEnd));

                string = result.toString();
            }

        }
        return string;
    }

    @ModifyVariable(method = "drawStringWithShadow", at = @At("HEAD"), require = 1, ordinal = 0, argsOnly = true)
    private String drawn(String string) {
        if (string == null)
            return null;
        if (ExampleMod.maphider) {
            if (Util.slash3(Util.stripColor(string)) && string.contains("§7") && !string.contains("Select") && string.contains("§8")) string = string.replace("§8","§8§k");
            if (Util.stripColor(string).contains("Map")) {

                StringBuilder result = new StringBuilder();

                Pattern pattern = Pattern.compile("§a([a-zA-Z0-9]+)");
                Matcher matcher = pattern.matcher(string);

                int lastEnd = 0;
                while (matcher.find()) {
                    result.append(string, lastEnd, matcher.start());

                    String match = matcher.group(1);
                    StringBuilder replacement = new StringBuilder();
                    for (int i = 0; i < match.length(); i++) {
                        replacement.append("T"); 
                    }

                    result.append("§a§k").append(replacement);
                    lastEnd = matcher.end();
                }

                result.append(string.substring(lastEnd));

                string = result.toString();
            }

        }
        return string;
    }

    @ModifyVariable(method = "getStringWidth", at = @At("HEAD"), require = 1, ordinal = 0, argsOnly = true)
    private String getStringWidth(String string) {
        if (string == null)
            return null;
        if (ExampleMod.maphider) {
            if (Util.slash3(Util.stripColor(string)) && string.contains("§7") && !string.contains("Select") && string.contains("§8")) string = string.replace("§8","§8§k");
            if (Util.stripColor(string).contains("Map")) {

                StringBuilder result = new StringBuilder();

                Pattern pattern = Pattern.compile("§a([a-zA-Z0-9]+)");
                Matcher matcher = pattern.matcher(string);

                int lastEnd = 0;
                while (matcher.find()) {
                    result.append(string, lastEnd, matcher.start());

                    String match = matcher.group(1);
                    StringBuilder replacement = new StringBuilder();
                    for (int i = 0; i < match.length(); i++) {
                        replacement.append("T"); 
                    }

                    result.append("§a§k").append(replacement);
                    lastEnd = matcher.end();
                }

                result.append(string.substring(lastEnd));

                string = result.toString();
            }

        }
        return string;
    }
}