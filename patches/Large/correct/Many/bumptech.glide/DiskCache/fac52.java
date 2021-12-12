diff --git a/library/src/com/bumptech/photos/resize/cache/disk/DiskCache.java b/library/src/com/bumptech/photos/resize/cache/disk/DiskCache.java
index d8d279c..a4b7c11 100644
--- a/library/src/com/bumptech/photos/resize/cache/disk/DiskCache.java
+++ b/library/src/com/bumptech/photos/resize/cache/disk/DiskCache.java
@@ -79,7 +79,7 @@
             try {
                 if (!outFile.exists()) outFile.createNewFile();
 
-                out = new BufferedOutputStream(new FileOutputStream(outFile));
+                out = new BufferedOutputStream(new FileOutputStream(outFile), 8192);
                 bitmap.compress(format, 100, out);
             } catch (FileNotFoundException e) {
                 e.printStackTrace();
