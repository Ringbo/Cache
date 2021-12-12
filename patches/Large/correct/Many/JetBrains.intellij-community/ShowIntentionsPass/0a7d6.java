diff --git a/codeInsight/impl/com/intellij/codeInsight/daemon/impl/ShowIntentionsPass.java b/codeInsight/impl/com/intellij/codeInsight/daemon/impl/ShowIntentionsPass.java
index e4a6d66..c8ab167 100644
--- a/codeInsight/impl/com/intellij/codeInsight/daemon/impl/ShowIntentionsPass.java
+++ b/codeInsight/impl/com/intellij/codeInsight/daemon/impl/ShowIntentionsPass.java
@@ -109,7 +109,7 @@
 
       HighlightInfo highlight = visibleHighlights[i];
       final PsiElement elementAt = myFile.findElementAt(highlight.startOffset);
-      if (elementAt == null || elementAt.isValid()) {
+      if (elementAt == null || !elementAt.isValid()) {
         LOG.assertTrue(true, "Invalid element: " + elementAt);
       }
       elements[i] = elementAt;
