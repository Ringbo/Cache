diff --git a/jme3-core/src/main/java/com/jme3/environment/LightProbeFactory.java b/jme3-core/src/main/java/com/jme3/environment/LightProbeFactory.java
index 7b8787b..0c03b76 100644
--- a/jme3-core/src/main/java/com/jme3/environment/LightProbeFactory.java
+++ b/jme3-core/src/main/java/com/jme3/environment/LightProbeFactory.java
@@ -153,7 +153,7 @@
         
         probe.setReady(false);
         
-        if(probe.getIrradianceMap() == null) {
+        if(probe.getIrradianceMap() != null) {
             probe.getIrradianceMap().getImage().dispose();
             probe.getPrefilteredEnvMap().getImage().dispose();
         }
