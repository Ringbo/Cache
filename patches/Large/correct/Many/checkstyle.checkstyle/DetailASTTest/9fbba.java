diff --git a/src/test/java/com/puppycrawl/tools/checkstyle/api/DetailASTTest.java b/src/test/java/com/puppycrawl/tools/checkstyle/api/DetailASTTest.java
index f0b141c..cdab379 100644
--- a/src/test/java/com/puppycrawl/tools/checkstyle/api/DetailASTTest.java
+++ b/src/test/java/com/puppycrawl/tools/checkstyle/api/DetailASTTest.java
@@ -110,7 +110,7 @@
         checkDir(new File("src/test/resources/com/puppycrawl/tools/checkstyle"));
     }
 
-    private void checkDir(File dir) throws Exception {
+    private static void checkDir(File dir) throws Exception {
         File[] files = dir.listFiles(new FileFilter() {
                 @Override
                 public boolean accept(File file) {
