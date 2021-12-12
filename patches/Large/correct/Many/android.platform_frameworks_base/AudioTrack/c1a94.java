diff --git a/media/java/android/media/AudioTrack.java b/media/java/android/media/AudioTrack.java
index d21762b..b8bbab0 100644
--- a/media/java/android/media/AudioTrack.java
+++ b/media/java/android/media/AudioTrack.java
@@ -1502,7 +1502,7 @@
     }
 
     private boolean isRestricted() {
-        if ((mAttributes.getFlags() & AudioAttributes.FLAG_BYPASS_INTERRUPTION_POLICY) != 0) {
+        if ((mAttributes.getAllFlags() & AudioAttributes.FLAG_BYPASS_INTERRUPTION_POLICY) != 0) {
             return false;
         }
         try {
