diff --git a/media/java/android/media/RemoteController.java b/media/java/android/media/RemoteController.java
index cdeb4fe..cd3ce1f 100644
--- a/media/java/android/media/RemoteController.java
+++ b/media/java/android/media/RemoteController.java
@@ -401,7 +401,7 @@
      * @throws IllegalArgumentException
      */
     public boolean setSynchronizationMode(int sync) throws IllegalArgumentException {
-        if ((sync != POSITION_SYNCHRONIZATION_NONE) || (sync != POSITION_SYNCHRONIZATION_CHECK)) {
+        if ((sync != POSITION_SYNCHRONIZATION_NONE) && (sync != POSITION_SYNCHRONIZATION_CHECK)) {
             throw new IllegalArgumentException("Unknown synchronization mode " + sync);
         }
         if (!mIsRegistered) {
