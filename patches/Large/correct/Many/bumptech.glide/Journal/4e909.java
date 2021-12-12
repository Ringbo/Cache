diff --git a/library/src/com/bumptech/photos/resize/cache/disk/Journal.java b/library/src/com/bumptech/photos/resize/cache/disk/Journal.java
index e3706ae..821f75c 100644
--- a/library/src/com/bumptech/photos/resize/cache/disk/Journal.java
+++ b/library/src/com/bumptech/photos/resize/cache/disk/Journal.java
@@ -25,7 +25,7 @@
  * To change this template use File | Settings | File Templates.
  */
 public class Journal {
-    private static int MAX_LINES = 10000;
+    private static final int MAX_LINES = 10000;
     private MemoryJournal memoryJournal = null;
     private final File journalFile;
     private BufferedWriter journalWriter;
@@ -117,7 +117,7 @@
         final File[] files = directory.listFiles(new FileFilter() {
             @Override
             public boolean accept(File file) {
-                return file.getName() != journalFile.getName();
+                return !file.getName().equals(journalFile.getName());
             }
         });
         List<File> fileList = Arrays.asList(files);
@@ -128,7 +128,7 @@
                 final long arg2 = file2.lastModified();
                 if (arg1 == arg2) {
                     return 0;
-                } else if (arg1 > arg1) {
+                } else if (arg1 > arg2) {
                     return -1;
                 } else {
                     return 1;
