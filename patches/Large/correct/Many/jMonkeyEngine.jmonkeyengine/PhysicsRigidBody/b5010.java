diff --git a/engine/src/bullet/com/jme3/bullet/objects/PhysicsRigidBody.java b/engine/src/bullet/com/jme3/bullet/objects/PhysicsRigidBody.java
index 2843071..eac3f3e 100644
--- a/engine/src/bullet/com/jme3/bullet/objects/PhysicsRigidBody.java
+++ b/engine/src/bullet/com/jme3/bullet/objects/PhysicsRigidBody.java
@@ -420,7 +420,7 @@
      * @param restitution
      */
     public void setRestitution(float restitution) {
-        setRestitution(objectId, mass);
+        setRestitution(objectId, restitution);
     }
 
     private native void setRestitution(long objectId, float factor);
