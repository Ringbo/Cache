diff --git a/android/src/main/java/com/zmxv/RNSound/RNSoundModule.java b/android/src/main/java/com/zmxv/RNSound/RNSoundModule.java
index 55f6438..4802d3e 100644
--- a/android/src/main/java/com/zmxv/RNSound/RNSoundModule.java
+++ b/android/src/main/java/com/zmxv/RNSound/RNSoundModule.java
@@ -99,7 +99,7 @@
     }
     player.setOnCompletionListener(new OnCompletionListener() {
       @Override
-      public void onCompletion(MediaPlayer mp) {
+      public synchronized void onCompletion(MediaPlayer mp) {
         if (!mp.isLooping()) {
           callback.invoke(true);
         }
@@ -107,7 +107,7 @@
     });
     player.setOnErrorListener(new OnErrorListener() {
       @Override
-      public boolean onError(MediaPlayer mp, int what, int extra) {
+      public synchronized boolean onError(MediaPlayer mp, int what, int extra) {
         callback.invoke(false);
         return true;
       }
