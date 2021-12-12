diff --git a/jme3-core/src/main/java/com/jme3/audio/AudioListenerState.java b/jme3-core/src/main/java/com/jme3/audio/AudioListenerState.java
index 947cb92..d0fe26f 100644
--- a/jme3-core/src/main/java/com/jme3/audio/AudioListenerState.java
+++ b/jme3-core/src/main/java/com/jme3/audio/AudioListenerState.java
@@ -70,7 +70,7 @@
 
     @Override
     public void render(RenderManager rm) {
-        if (!isEnabled()) {
+        if (!isEnabled() || listener == null) {
             return;
         }
 
