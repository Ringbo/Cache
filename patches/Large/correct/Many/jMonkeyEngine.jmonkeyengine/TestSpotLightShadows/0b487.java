diff --git a/jme3-examples/src/main/java/jme3test/light/TestSpotLightShadows.java b/jme3-examples/src/main/java/jme3test/light/TestSpotLightShadows.java
index fbf0e1b..0b930bd 100644
--- a/jme3-examples/src/main/java/jme3test/light/TestSpotLightShadows.java
+++ b/jme3-examples/src/main/java/jme3test/light/TestSpotLightShadows.java
@@ -65,7 +65,7 @@
 
     public void setupLighting() {
         AmbientLight al = new AmbientLight();
-        al.setColor(ColorRGBA.White.mult(0.3f));
+        al.setColor(ColorRGBA.White.mult(0.02f));
         rootNode.addLight(al);
 
         rootNode.setShadowMode(ShadowMode.CastAndReceive);
