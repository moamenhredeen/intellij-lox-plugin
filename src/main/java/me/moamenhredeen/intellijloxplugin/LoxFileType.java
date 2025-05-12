package me.moamenhredeen.intellijloxplugin;

import com.intellij.lang.Language;
import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.util.NlsContexts;
import com.intellij.openapi.util.NlsSafe;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class LoxFileType extends LanguageFileType {

    public static final LoxFileType INSTANCE = new LoxFileType();

    protected LoxFileType() {
        super(LoxLanguage.INSTANCE);
    }

    @Override
    public @NonNls @NotNull String getName() {
        return "Lox File";
    }

    @Override
    public @NlsContexts.Label @NotNull String getDescription() {
        return "Lox language file";
    }

    @Override
    public @NlsSafe @NotNull String getDefaultExtension() {
        return "lox";
    }

    @Override
    public Icon getIcon() {
        return LoxIcons.FILE;
    }
}
