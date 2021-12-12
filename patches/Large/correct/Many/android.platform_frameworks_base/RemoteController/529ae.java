diff --git a/media/java/android/media/RemoteController.java b/media/java/android/media/RemoteController.java
index 6dbb3cd..910b24c 100644
--- a/media/java/android/media/RemoteController.java
+++ b/media/java/android/media/RemoteController.java
@@ -404,7 +404,7 @@
      * @throws IllegalArgumentException
      */
     public boolean setSynchronizationMode(int sync) throws IllegalArgumentException {
-        if ((sync != POSITION_SYNCHRONIZATION_NONE) || (sync != POSITION_SYNCHRONIZATION_CHECK)) {
+        if ((sync != POSITION_SYNCHRONIZATION_NONE) && (sync != POSITION_SYNCHRONIZATION_CHECK)) {
             throw new IllegalArgumentException("Unknown synchronization mode " + sync);
         }
         if (!mIsRegistered) {
