diff --git a/jme3-android/src/main/java/com/jme3/input/android/AndroidInputHandler14.java b/jme3-android/src/main/java/com/jme3/input/android/AndroidInputHandler14.java
index 114bb98..4b39ed2 100644
--- a/jme3-android/src/main/java/com/jme3/input/android/AndroidInputHandler14.java
+++ b/jme3-android/src/main/java/com/jme3/input/android/AndroidInputHandler14.java
@@ -148,7 +148,8 @@
         if (isJoystick && joyInput != null) {
 //            logger.log(Level.INFO, "onKey source: {0}, isJoystick: {1}",
 //                    new Object[]{source, isJoystick});
-            consumed = consumed || ((AndroidJoyInput14)joyInput).onKey(event);
+            // use inclusive OR to make sure the onKey method is called.
+            consumed = consumed | ((AndroidJoyInput14)joyInput).onKey(event);
         }
 
         return consumed;
