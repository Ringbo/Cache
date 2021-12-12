diff --git a/languagetool-wikipedia/src/main/java/org/languagetool/dev/wikipedia/atom/AtomFeedCheckerCmd.java b/languagetool-wikipedia/src/main/java/org/languagetool/dev/wikipedia/atom/AtomFeedCheckerCmd.java
index 3d3e25a..d5294d4 100644
--- a/languagetool-wikipedia/src/main/java/org/languagetool/dev/wikipedia/atom/AtomFeedCheckerCmd.java
+++ b/languagetool-wikipedia/src/main/java/org/languagetool/dev/wikipedia/atom/AtomFeedCheckerCmd.java
@@ -64,7 +64,7 @@
     System.out.println("Sleep time: " + sleepTimeMillis + "ms (-1 = don't loop)");
     System.out.println("LanguageTool version: " + JLanguageTool.VERSION + " (" + JLanguageTool.BUILD_DATE + ")");
     DatabaseConfig databaseConfig = null;
-    if (args.length == 3) {
+    if (args.length >= 3) {
       String propFile = args[2];
       databaseConfig = new DatabaseConfig(propFile);
       System.out.println("Writing results to database at: " + databaseConfig.getUrl());
