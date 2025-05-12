package me.moamenhredeen.intellijloxplugin;

import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import me.moamenhredeen.intellijloxplugin.parser.LoxParser;
import me.moamenhredeen.intellijloxplugin.psi.LoxFile;
import me.moamenhredeen.intellijloxplugin.psi.LoxTokenSets;
import me.moamenhredeen.intellijloxplugin.psi.LoxTypes;
import org.jetbrains.annotations.NotNull;

public class LoxParserDefinition implements ParserDefinition {

    public static final IFileElementType FILE = new IFileElementType(LoxLanguage.INSTANCE);

    @Override
    public @NotNull Lexer createLexer(Project project) {
        return new LoxLexerAdapter();
    }

    @Override
    public @NotNull PsiParser createParser(Project project) {
        return new LoxParser();
    }

    @Override
    public @NotNull IFileElementType getFileNodeType() {
        return FILE;
    }

    @Override
    public @NotNull TokenSet getCommentTokens() {
        return LoxTokenSets.COMMENTS;
    }

    @Override
    public @NotNull TokenSet getStringLiteralElements() {
        return LoxTokenSets.IDENTIFIERS;
    }

    @Override
    public @NotNull PsiElement createElement(ASTNode astNode) {
        return LoxTypes.Factory.createElement(astNode);
    }

    @Override
    public @NotNull PsiFile createFile(@NotNull FileViewProvider fileViewProvider) {
        return new LoxFile(fileViewProvider);
    }
}
