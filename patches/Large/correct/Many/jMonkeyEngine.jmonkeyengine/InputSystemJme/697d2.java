diff --git a/engine/src/niftygui/com/jme3/niftygui/InputSystemJme.java b/engine/src/niftygui/com/jme3/niftygui/InputSystemJme.java
index 8a2d1c7..0b80131 100644
--- a/engine/src/niftygui/com/jme3/niftygui/InputSystemJme.java
+++ b/engine/src/niftygui/com/jme3/niftygui/InputSystemJme.java
@@ -191,7 +191,7 @@
     }
 
     public void onMouseButtonEvent(MouseButtonEvent evt) {
-        if (inputManager.isCursorVisible() && evt.getButtonIndex() >= 0 || evt.getButtonIndex() <= 2){
+        if (inputManager.isCursorVisible() && evt.getButtonIndex() >= 0 && evt.getButtonIndex() <= 2){
             inputQueue.add(evt);
         }
     }
