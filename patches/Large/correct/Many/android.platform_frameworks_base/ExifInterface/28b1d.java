diff --git a/media/java/android/media/ExifInterface.java b/media/java/android/media/ExifInterface.java
index 4848630..0e7f995 100644
--- a/media/java/android/media/ExifInterface.java
+++ b/media/java/android/media/ExifInterface.java
@@ -1748,7 +1748,7 @@
             String subSecs = getAttribute(TAG_SUBSEC_TIME);
             if (subSecs != null) {
                 try {
-                    long sub = Long.valueOf(subSecs);
+                    long sub = Long.parseLong(subSecs);
                     while (sub > 1000) {
                         sub /= 10;
                     }
