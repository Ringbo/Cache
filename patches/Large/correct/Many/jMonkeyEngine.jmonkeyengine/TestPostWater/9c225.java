diff --git a/engine/src/test/jme3test/water/TestPostWater.java b/engine/src/test/jme3test/water/TestPostWater.java
index 9a89f98..7bbe39e 100644
--- a/engine/src/test/jme3test/water/TestPostWater.java
+++ b/engine/src/test/jme3test/water/TestPostWater.java
@@ -137,7 +137,7 @@
         water.setWaterHeight(initialWaterHeight);
       uw=cam.getLocation().y<waterHeight; 
       
-        waves = new AudioNode(audioRenderer, assetManager, "Sound/Environment/Ocean Waves.ogg", false);
+        waves = new AudioNode(assetManager, "Sound/Environment/Ocean Waves.ogg", false);
         waves.setLooping(true);
         waves.setReverbEnabled(true);
         if(uw){
