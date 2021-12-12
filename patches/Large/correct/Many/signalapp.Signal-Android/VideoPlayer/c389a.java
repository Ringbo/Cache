diff --git a/src/org/thoughtcrime/securesms/video/VideoPlayer.java b/src/org/thoughtcrime/securesms/video/VideoPlayer.java
index 3e1f602..6a61d7c 100644
--- a/src/org/thoughtcrime/securesms/video/VideoPlayer.java
+++ b/src/org/thoughtcrime/securesms/video/VideoPlayer.java
@@ -75,7 +75,7 @@
   public void setVideoSource(@NonNull MasterSecret masterSecret, @NonNull VideoSlide videoSource)
       throws IOException
   {
-    if (Build.VERSION.SDK_INT >= 14) setExoViewSource(masterSecret, videoSource);
+    if (Build.VERSION.SDK_INT >= 16) setExoViewSource(masterSecret, videoSource);
     else                             setVideoViewSource(masterSecret, videoSource);
   }
 
