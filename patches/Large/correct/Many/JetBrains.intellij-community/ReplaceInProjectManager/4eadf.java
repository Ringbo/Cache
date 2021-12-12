diff --git a/platform/lang-impl/src/com/intellij/find/replaceInProject/ReplaceInProjectManager.java b/platform/lang-impl/src/com/intellij/find/replaceInProject/ReplaceInProjectManager.java
index da1701e..7355d06 100644
--- a/platform/lang-impl/src/com/intellij/find/replaceInProject/ReplaceInProjectManager.java
+++ b/platform/lang-impl/src/com/intellij/find/replaceInProject/ReplaceInProjectManager.java
@@ -530,7 +530,7 @@
     if (textOffset < 0 || textOffset >= document.getTextLength()) {
       return false;
     }
-    if (textEndOffset < 0 || textOffset > document.getTextLength()) {
+    if (textEndOffset < 0 || textEndOffset > document.getTextLength()) {
       return false;
     }
     FindManager findManager = FindManager.getInstance(myProject);
