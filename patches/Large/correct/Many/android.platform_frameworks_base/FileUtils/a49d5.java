diff --git a/core/java/android/os/FileUtils.java b/core/java/android/os/FileUtils.java
index 021e5e4..917271d 100644
--- a/core/java/android/os/FileUtils.java
+++ b/core/java/android/os/FileUtils.java
@@ -528,7 +528,7 @@
      * {@code /after/foo/bar.txt}.
      */
     public static File rewriteAfterRename(File beforeDir, File afterDir, File file) {
-        if (file == null) return null;
+        if (file == null || beforeDir == null || afterDir == null) return null;
         if (contains(beforeDir, file)) {
             final String splice = file.getAbsolutePath().substring(
                     beforeDir.getAbsolutePath().length());
