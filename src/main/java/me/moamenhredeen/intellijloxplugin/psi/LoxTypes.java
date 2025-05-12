// This is a generated file. Not intended for manual editing.
package me.moamenhredeen.intellijloxplugin.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import me.moamenhredeen.intellijloxplugin.psi.impl.*;

public interface LoxTypes {

  IElementType PROPERTY = new LoxElementType("PROPERTY");

  IElementType COMMENT = new LoxTokenType("COMMENT");
  IElementType CRLF = new LoxTokenType("CRLF");
  IElementType KEY = new LoxTokenType("KEY");
  IElementType SEPERATOR = new LoxTokenType("SEPERATOR");
  IElementType VALUE = new LoxTokenType("VALUE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == PROPERTY) {
        return new LoxPropertyImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
