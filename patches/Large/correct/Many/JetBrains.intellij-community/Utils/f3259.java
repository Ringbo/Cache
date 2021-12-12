diff --git a/updater/src/com/intellij/updater/Utils.java b/updater/src/com/intellij/updater/Utils.java
index 3ba2450..9ddc5f5 100644
--- a/updater/src/com/intellij/updater/Utils.java
+++ b/updater/src/com/intellij/updater/Utils.java
@@ -73,7 +73,7 @@
 
   public static void delete(File file) throws IOException {
     Path start = file.toPath();
-    if (Files.exists(start)) {
+    if (Files.exists(start, LinkOption.NOFOLLOW_LINKS)) {
       Files.walkFileTree(start, new SimpleFileVisitor<Path>() {
         @Override
         public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
