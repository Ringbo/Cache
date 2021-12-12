diff --git a/jme3-core/src/main/java/com/jme3/shadow/DirectionalLightShadowRenderer.java b/jme3-core/src/main/java/com/jme3/shadow/DirectionalLightShadowRenderer.java
index 7ea0fa8..f1b34cf 100644
--- a/jme3-core/src/main/java/com/jme3/shadow/DirectionalLightShadowRenderer.java
+++ b/jme3-core/src/main/java/com/jme3/shadow/DirectionalLightShadowRenderer.java
@@ -283,7 +283,7 @@
         super.read(im);
         InputCapsule ic = im.getCapsule(this);
         lambda = ic.readFloat("lambda", 0.65f);
-        zFarOverride = ic.readInt("zFarOverride", 0);
+        zFarOverride = ic.readFloat("zFarOverride", 0);
         light = (DirectionalLight) ic.readSavable("light", null);
         fadeInfo = (Vector2f) ic.readSavable("fadeInfo", null);
         fadeLength = ic.readFloat("fadeLength", 0f);
