diff --git a/engine/src/test/jme3test/bullet/TestWalkingChar.java b/engine/src/test/jme3test/bullet/TestWalkingChar.java
index c5d394d..407d3b6 100644
--- a/engine/src/test/jme3test/bullet/TestWalkingChar.java
+++ b/engine/src/test/jme3test/bullet/TestWalkingChar.java
@@ -186,7 +186,7 @@
 
     private void addBrick(Vector3f ori) {
         Geometry reBoxg = new Geometry("brick", brick);
-        reBoxg.setMaterial(matRock);
+        reBoxg.setMaterial(matBullet);
         reBoxg.setLocalTranslation(ori);
         reBoxg.addControl(new RigidBodyControl(1.5f));
         reBoxg.setShadowMode(ShadowMode.CastAndReceive);
@@ -397,7 +397,7 @@
         Geometry bulletg = new Geometry("bullet", bullet);
         bulletg.setMaterial(matBullet);
         bulletg.setShadowMode(ShadowMode.CastAndReceive);
-        bulletg.setLocalTranslation(character.getPhysicsLocation().add(cam.getDirection().mult(2)));
+        bulletg.setLocalTranslation(character.getPhysicsLocation().add(cam.getDirection().mult(5)));
         RigidBodyControl bulletControl = new BombControl(bulletCollisionShape, 1);
         bulletControl.setCcdMotionThreshold(0.1f);
         bulletControl.setLinearVelocity(cam.getDirection().mult(80));
