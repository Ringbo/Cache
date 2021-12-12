diff --git a/jme3-examples/src/main/java/jme3test/light/TestSpotLight.java b/jme3-examples/src/main/java/jme3test/light/TestSpotLight.java
index 8d29ae4..7a6f35c 100644
--- a/jme3-examples/src/main/java/jme3test/light/TestSpotLight.java
+++ b/jme3-examples/src/main/java/jme3test/light/TestSpotLight.java
@@ -58,7 +58,7 @@
     Geometry lightMdl;
     public void setupLighting(){
       AmbientLight al=new AmbientLight();
-      al.setColor(ColorRGBA.White.mult(0.8f));
+      al.setColor(ColorRGBA.White.mult(0.02f));
       rootNode.addLight(al);
         
       spot=new SpotLight();
