diff --git a/platform/core-api/src/com/intellij/openapi/util/BuildNumber.java b/platform/core-api/src/com/intellij/openapi/util/BuildNumber.java
index 524d37b..5efcaae 100644
--- a/platform/core-api/src/com/intellij/openapi/util/BuildNumber.java
+++ b/platform/core-api/src/com/intellij/openapi/util/BuildNumber.java
@@ -163,7 +163,7 @@
   private static BuildNumber fromFile() {
     try {
       String home = PathManager.getHomePath();
-      File buildTxtFile = FileUtil.findFirstThatExist(home + "/build.txt", home + "/Resources/build.txt", home + "/community/build.txt");
+      File buildTxtFile = FileUtil.findFirstThatExist(home + "/build.txt", home + "/Resources/build.txt", home + "/community/build.txt", home + "/ultimate/community/build.txt");
       if (buildTxtFile != null) {
         String text = FileUtil.loadFile(buildTxtFile).trim();
         return fromString(text);
