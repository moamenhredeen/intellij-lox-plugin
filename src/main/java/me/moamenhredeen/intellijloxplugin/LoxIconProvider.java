package me.moamenhredeen.intellijloxplugin;

import com.intellij.ide.IconProvider;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class LoxIconProvider extends IconProvider {
    @Override
    public @Nullable Icon getIcon(@NotNull PsiElement psiElement, int i) {
        return LoxIcons.FILE;
    }
}
