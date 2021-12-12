diff --git a/src/com/ichi2/libanki/Media.java b/src/com/ichi2/libanki/Media.java
index c78994e..07bb2e7 100644
--- a/src/com/ichi2/libanki/Media.java
+++ b/src/com/ichi2/libanki/Media.java
@@ -78,7 +78,7 @@
         mMediaDbFilename = mDir + ".db";
         File fd = new File(mDir);
         if (!fd.exists()) {
-            if (fd.mkdir()) {
+            if (!fd.mkdir()) {
                 Log.e(AnkiDroidApp.TAG, "Cannot create media directory: " + mDir);
             }
         }
