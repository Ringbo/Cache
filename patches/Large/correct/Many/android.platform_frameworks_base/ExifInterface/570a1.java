diff --git a/media/java/android/media/ExifInterface.java b/media/java/android/media/ExifInterface.java
index 445ee6f..4d176d8 100644
--- a/media/java/android/media/ExifInterface.java
+++ b/media/java/android/media/ExifInterface.java
@@ -386,7 +386,7 @@
             String subSecs = mAttributes.get(TAG_SUBSECTIME);
             if (subSecs != null) {
                 try {
-                    long sub = Long.valueOf(subSecs);
+                    long sub = Long.parseLong(subSecs);
                     while (sub > 1000) {
                         sub /= 10;
                     }
