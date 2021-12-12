diff --git a/src/main/java/org/terasology/logic/characters/CharacterStateEvent.java b/src/main/java/org/terasology/logic/characters/CharacterStateEvent.java
index dc96d48..c262b73 100644
--- a/src/main/java/org/terasology/logic/characters/CharacterStateEvent.java
+++ b/src/main/java/org/terasology/logic/characters/CharacterStateEvent.java
@@ -165,7 +165,7 @@
         characterComponent.pitch = state.pitch;
         characterComponent.yaw = state.yaw;
         entity.saveComponent(characterComponent);
-        movementComp.collider.setInterpolationWorldTransform(new Transform(new Matrix4f(new Quat4f(0, 0, 0, 1), state.getPosition(), 1.0f)));
+        movementComp.collider.setWorldTransform(new Transform(new Matrix4f(new Quat4f(0, 0, 0, 1), state.getPosition(), 1.0f)));
     }
 
     public static void setToInterpolateState(EntityRef entity, CharacterStateEvent a, CharacterStateEvent b, long time) {
@@ -198,7 +198,7 @@
         characterComponent.yaw = b.yaw;
         entity.saveComponent(characterComponent);
 
-        movementComponent.collider.setInterpolationWorldTransform(new Transform(new Matrix4f(new Quat4f(0, 0, 0, 1), newPos, 1.0f)));
+        movementComponent.collider.setWorldTransform(new Transform(new Matrix4f(new Quat4f(0, 0, 0, 1), newPos, 1.0f)));
     }
 
     public static void setToExtrapolateState(EntityRef entity, CharacterStateEvent state, long time) {
@@ -222,7 +222,7 @@
         characterComponent.yaw = state.yaw;
         entity.saveComponent(characterComponent);
 
-        movementComponent.collider.setInterpolationWorldTransform(new Transform(new Matrix4f(new Quat4f(0, 0, 0, 1), newPos, 1.0f)));
+        movementComponent.collider.setWorldTransform(new Transform(new Matrix4f(new Quat4f(0, 0, 0, 1), newPos, 1.0f)));
     }
 
 }
