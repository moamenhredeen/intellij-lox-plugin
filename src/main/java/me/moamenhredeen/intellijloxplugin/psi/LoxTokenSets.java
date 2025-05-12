package me.moamenhredeen.intellijloxplugin.psi;

import com.intellij.psi.tree.TokenSet;

public interface LoxTokenSets {
    TokenSet IDENTIFIERS = TokenSet.create(LoxTypes.KEY);
    TokenSet COMMENTS = TokenSet.create(LoxTypes.COMMENT);
}
