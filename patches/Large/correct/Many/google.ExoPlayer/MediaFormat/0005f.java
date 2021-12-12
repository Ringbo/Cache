diff --git a/library/src/main/java/com/google/android/exoplayer/MediaFormat.java b/library/src/main/java/com/google/android/exoplayer/MediaFormat.java
index b147e91..7a79e1d 100644
--- a/library/src/main/java/com/google/android/exoplayer/MediaFormat.java
+++ b/library/src/main/java/com/google/android/exoplayer/MediaFormat.java
@@ -89,7 +89,7 @@
 
   public static MediaFormat createId3Format() {
     return new MediaFormat(MimeTypes.APPLICATION_ID3, NO_VALUE, NO_VALUE, NO_VALUE, NO_VALUE,
-        NO_VALUE, NO_VALUE, null);
+        NO_VALUE, NO_VALUE, NO_VALUE, null);
   }
 
   @TargetApi(16)
