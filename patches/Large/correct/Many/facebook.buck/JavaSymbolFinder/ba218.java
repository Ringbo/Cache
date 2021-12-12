diff --git a/src/com/facebook/buck/java/JavaSymbolFinder.java b/src/com/facebook/buck/java/JavaSymbolFinder.java
index ee17d90..2bf57c4 100644
--- a/src/com/facebook/buck/java/JavaSymbolFinder.java
+++ b/src/com/facebook/buck/java/JavaSymbolFinder.java
@@ -214,7 +214,7 @@
     // For a source file like foo/bar/example.java, add paths like foo/bar/BUCK and foo/BUCK.
     while (dir != null) {
       Path buckFile = dir.resolve(BuckConstant.BUILD_RULES_FILE_NAME);
-      if (projectFilesystem.exists(buckFile)) {
+      if (projectFilesystem.isFile(buckFile)) {
         possibleBuckFiles.add(buckFile);
       }
       dir = dir.getParent();
