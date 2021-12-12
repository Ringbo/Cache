diff --git a/codeInsight/impl/com/intellij/codeInsight/daemon/impl/ShowIntentionsPass.java b/codeInsight/impl/com/intellij/codeInsight/daemon/impl/ShowIntentionsPass.java
index c8ab167..e2d6f03 100644
--- a/codeInsight/impl/com/intellij/codeInsight/daemon/impl/ShowIntentionsPass.java
+++ b/codeInsight/impl/com/intellij/codeInsight/daemon/impl/ShowIntentionsPass.java
@@ -110,7 +110,7 @@
       HighlightInfo highlight = visibleHighlights[i];
       final PsiElement elementAt = myFile.findElementAt(highlight.startOffset);
       if (elementAt == null || !elementAt.isValid()) {
-        LOG.assertTrue(true, "Invalid element: " + elementAt);
+        LOG.assertTrue(false, "Invalid element: " + elementAt);
       }
       elements[i] = elementAt;
     }
