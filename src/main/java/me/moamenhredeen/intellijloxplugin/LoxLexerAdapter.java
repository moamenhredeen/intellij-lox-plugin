package me.moamenhredeen.intellijloxplugin;

import com.intellij.lexer.FlexAdapter;
import com.intellij.lexer.FlexLexer;
import org.jetbrains.annotations.NotNull;

public class LoxLexerAdapter extends FlexAdapter {
    public LoxLexerAdapter() {
        super(new LoxLexer(null));
    }
}
