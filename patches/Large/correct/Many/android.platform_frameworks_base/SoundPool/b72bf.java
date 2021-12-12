diff --git a/media/java/android/media/SoundPool.java b/media/java/android/media/SoundPool.java
index 88d979e..64863c2 100644
--- a/media/java/android/media/SoundPool.java
+++ b/media/java/android/media/SoundPool.java
@@ -463,7 +463,7 @@
     }
 
     private boolean isRestricted() {
-        if ((mAttributes.getFlags() & AudioAttributes.FLAG_BYPASS_INTERRUPTION_POLICY) != 0) {
+        if ((mAttributes.getAllFlags() & AudioAttributes.FLAG_BYPASS_INTERRUPTION_POLICY) != 0) {
             return false;
         }
         try {
