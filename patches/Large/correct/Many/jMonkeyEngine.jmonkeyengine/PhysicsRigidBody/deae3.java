diff --git a/engine/src/bullet/com/jme3/bullet/objects/PhysicsRigidBody.java b/engine/src/bullet/com/jme3/bullet/objects/PhysicsRigidBody.java
index f9974f3..2843071 100644
--- a/engine/src/bullet/com/jme3/bullet/objects/PhysicsRigidBody.java
+++ b/engine/src/bullet/com/jme3/bullet/objects/PhysicsRigidBody.java
@@ -341,7 +341,7 @@
         if (gravity == null) {
             gravity = new Vector3f();
         }
-        getGravity(gravity);
+        getGravity(objectId, gravity);
         return gravity;
     }
 
