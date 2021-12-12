diff --git a/jme3-core/src/test/java/com/jme3/material/MaterialTest.java b/jme3-core/src/test/java/com/jme3/material/MaterialTest.java
index c08d5c0..e186f5e 100644
--- a/jme3-core/src/test/java/com/jme3/material/MaterialTest.java
+++ b/jme3-core/src/test/java/com/jme3/material/MaterialTest.java
@@ -114,19 +114,19 @@
     @Test
     public void testSelectNamedTechnique_GLSL150Cap() {
         supportGlsl(150);
-        material("Common/MatDefs/Misc/Particle.j3md");
+        material("Common/MatDefs/Light/Lighting.j3md");
 
-        material.selectTechnique("SoftParticles", renderManager);
+        material.selectTechnique("PostShadow", renderManager);
 
-        checkRequiredCaps(Caps.GLSL100, Caps.GLSL150);
+        checkRequiredCaps(Caps.GLSL150);
     }
 
     @Test
     public void testSelectNamedTechnique_GLSL100Cap() {
         supportGlsl(100);
-        material("Common/MatDefs/Misc/Particle.j3md");
+        material("Common/MatDefs/Light/Lighting.j3md");
 
-        material.selectTechnique("SoftParticles", renderManager);
+        material.selectTechnique("PostShadow", renderManager);
 
         checkRequiredCaps(Caps.GLSL100);
     }
