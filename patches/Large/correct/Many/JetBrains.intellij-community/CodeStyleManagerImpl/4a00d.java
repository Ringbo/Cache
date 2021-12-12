diff --git a/platform/lang-impl/src/com/intellij/psi/impl/source/codeStyle/CodeStyleManagerImpl.java b/platform/lang-impl/src/com/intellij/psi/impl/source/codeStyle/CodeStyleManagerImpl.java
index 275a700..a5b5942 100644
--- a/platform/lang-impl/src/com/intellij/psi/impl/source/codeStyle/CodeStyleManagerImpl.java
+++ b/platform/lang-impl/src/com/intellij/psi/impl/source/codeStyle/CodeStyleManagerImpl.java
@@ -160,7 +160,7 @@
 
     final SmartPsiElementPointer endPointer = end == null ? null : smartPointerManager.createSmartPsiElementPointer(end);
 
-    codeFormatter.processText(file, new FormatTextRanges(new TextRange(startOffset, endOffset), true));
+    codeFormatter.processText(file, new FormatTextRanges(new TextRange(startOffset, endOffset), true), true);
     final PsiElement startElement = startPointer == null ? null : startPointer.getElement();
     final PsiElement endElement = endPointer == null ? null : endPointer.getElement();
 
