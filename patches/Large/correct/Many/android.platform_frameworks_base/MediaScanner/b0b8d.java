diff --git a/media/java/android/media/MediaScanner.java b/media/java/android/media/MediaScanner.java
index a8144a7..43df8a1 100644
--- a/media/java/android/media/MediaScanner.java
+++ b/media/java/android/media/MediaScanner.java
@@ -839,7 +839,7 @@
                         // and EXIF local time is not less than 1 Day, otherwise MediaProvider
                         // will use file time as taken time.
                         time = exif.getDateTime();
-                        if (Math.abs(mLastModified * 1000 - time) >= 86400000) {
+                        if (time != -1 && Math.abs(mLastModified * 1000 - time) >= 86400000) {
                             values.put(Images.Media.DATE_TAKEN, time);
                         }
                     }
