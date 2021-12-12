diff --git a/engine/src/bullet/com/jme3/bullet/objects/PhysicsCharacter.java b/engine/src/bullet/com/jme3/bullet/objects/PhysicsCharacter.java
index 3be267f..d9ee34d 100644
--- a/engine/src/bullet/com/jme3/bullet/objects/PhysicsCharacter.java
+++ b/engine/src/bullet/com/jme3/bullet/objects/PhysicsCharacter.java
@@ -150,7 +150,7 @@
     }
 
     public void setJumpSpeed(float jumpSpeed) {
-        this.jumpSpeed = fallSpeed;
+        this.jumpSpeed = jumpSpeed;
         setJumpSpeed(characterId, jumpSpeed);
     }
 
