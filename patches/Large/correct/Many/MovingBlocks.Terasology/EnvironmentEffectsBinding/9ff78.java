diff --git a/engine/src/main/java/org/terasology/rendering/nui/layers/mainMenu/videoSettings/EnvironmentEffectsBinding.java b/engine/src/main/java/org/terasology/rendering/nui/layers/mainMenu/videoSettings/EnvironmentEffectsBinding.java
index 4a988c6..fcc1ab2 100644
--- a/engine/src/main/java/org/terasology/rendering/nui/layers/mainMenu/videoSettings/EnvironmentEffectsBinding.java
+++ b/engine/src/main/java/org/terasology/rendering/nui/layers/mainMenu/videoSettings/EnvironmentEffectsBinding.java
@@ -32,7 +32,7 @@
     public EnvironmentalEffects get() {
         if (config.isAnimateGrass() && !config.isAnimateWater()) {
             return EnvironmentalEffects.LOW;
-        } else if (config.isAnimateWater() && config.isAnimateWater()) {
+        } else if (config.isAnimateGrass() && config.isAnimateWater()) {
             return EnvironmentalEffects.HIGH;
         } else {
             return EnvironmentalEffects.OFF;
