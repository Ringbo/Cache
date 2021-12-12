diff --git a/engine/src/core/com/jme3/input/InputManager.java b/engine/src/core/com/jme3/input/InputManager.java
index 623f719..7f8ffa9 100644
--- a/engine/src/core/com/jme3/input/InputManager.java
+++ b/engine/src/core/com/jme3/input/InputManager.java
@@ -131,7 +131,7 @@
      */
     public InputManager(MouseInput mouse, KeyInput keys, JoyInput joystick, TouchInput touch) {
         if (keys == null || mouse == null) {
-            throw new NullPointerException("Mouse or keyboard cannot be null");
+            throw new IllegalArgumentException("Mouse or keyboard cannot be null");
         }
 
         this.keys = keys;
