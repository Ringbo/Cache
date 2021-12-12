diff --git a/engine/src/main/java/org/terasology/rendering/world/WorldRendererImpl.java b/engine/src/main/java/org/terasology/rendering/world/WorldRendererImpl.java
index 8295fd2..b1b5e18 100644
--- a/engine/src/main/java/org/terasology/rendering/world/WorldRendererImpl.java
+++ b/engine/src/main/java/org/terasology/rendering/world/WorldRendererImpl.java
@@ -715,13 +715,13 @@
         float rawLightValueSun = worldProvider.getSunlight(pos) / 15.0f;
         float rawLightValueBlock = worldProvider.getLight(pos) / 15.0f;
 
-        float lightValueSun = (float) Math.pow(BLOCK_LIGHT_SUN_POW, (1.0f - rawLightValueSun) * 16.0f) * rawLightValueSun;
+        float lightValueSun = (float) Math.pow(BLOCK_LIGHT_SUN_POW, (1.0f - rawLightValueSun) * 16.0) * rawLightValueSun;
         lightValueSun *= backdropProvider.getDaylight();
         // TODO: Hardcoded factor and value to compensate for daylight tint and night brightness
         lightValueSun *= 0.9f;
         lightValueSun += 0.05f;
 
-        float lightValueBlock = (float) Math.pow(BLOCK_LIGHT_POW, (1.0f - rawLightValueBlock) * 16.0f) * rawLightValueBlock * BLOCK_INTENSITY_FACTOR;
+        float lightValueBlock = (float) Math.pow(BLOCK_LIGHT_POW, (1.0f - (double)rawLightValueBlock) * 16.0f) * rawLightValueBlock * BLOCK_INTENSITY_FACTOR;
 
         return Math.max(lightValueBlock, lightValueSun);
     }
