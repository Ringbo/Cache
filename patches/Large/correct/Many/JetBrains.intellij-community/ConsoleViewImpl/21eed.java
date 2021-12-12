diff --git a/platform/lang-impl/src/com/intellij/execution/impl/ConsoleViewImpl.java b/platform/lang-impl/src/com/intellij/execution/impl/ConsoleViewImpl.java
index ca6b888..1daa5aa 100644
--- a/platform/lang-impl/src/com/intellij/execution/impl/ConsoleViewImpl.java
+++ b/platform/lang-impl/src/com/intellij/execution/impl/ConsoleViewImpl.java
@@ -1111,7 +1111,7 @@
     }
 
     final ConsoleFolding prevFolding = myFolding.get(line - 1);
-    if (current == null && prevFolding != null) {
+    if (prevFolding != null && !prevFolding.equals(current)) {
       final int lEnd = line - 1;
       int lStart = lEnd;
       while (prevFolding.equals(myFolding.get(lStart - 1))) lStart--;
