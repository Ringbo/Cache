diff --git a/codeInsight/impl/com/intellij/psi/AbstractQualifiedReference.java b/codeInsight/impl/com/intellij/psi/AbstractQualifiedReference.java
index c680a65..e7e9400 100644
--- a/codeInsight/impl/com/intellij/psi/AbstractQualifiedReference.java
+++ b/codeInsight/impl/com/intellij/psi/AbstractQualifiedReference.java
@@ -200,7 +200,7 @@
   @Nullable
   protected abstract PsiElement getReferenceNameElement();
 
-  public final TextRange getRangeInElement() {
+  public TextRange getRangeInElement() {
     final PsiElement element = getSeparator();
     final int length = getTextLength();
     return element == null ? TextRange.from(0, length) : new TextRange(element.getStartOffsetInParent() + element.getTextLength(), length);
