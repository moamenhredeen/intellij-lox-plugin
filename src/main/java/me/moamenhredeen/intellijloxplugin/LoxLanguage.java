package me.moamenhredeen.intellijloxplugin;


import com.intellij.lang.Language;

public class LoxLanguage extends Language {

    public static final LoxLanguage INSTANCE = new LoxLanguage();

    protected LoxLanguage() {
        super("Lox");
    }
}
