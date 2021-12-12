diff --git a/extensions/gdx-box2d/gdx-box2d/src/com/badlogic/gdx/physics/box2d/joints/WheelJoint.java b/extensions/gdx-box2d/gdx-box2d/src/com/badlogic/gdx/physics/box2d/joints/WheelJoint.java
index e39549c..7bbdbd4 100644
--- a/extensions/gdx-box2d/gdx-box2d/src/com/badlogic/gdx/physics/box2d/joints/WheelJoint.java
+++ b/extensions/gdx-box2d/gdx-box2d/src/com/badlogic/gdx/physics/box2d/joints/WheelJoint.java
@@ -52,7 +52,7 @@
 	*/
 
 	public Vector2 getLocalAnchorB () {
-		jniGetLocalAnchorA(addr, tmp);
+		jniGetLocalAnchorB(addr, tmp);
 		localAnchorB.set(tmp[0], tmp[1]);
 		return localAnchorB;
 	}
@@ -64,7 +64,7 @@
 	*/
 
 	public Vector2 getLocalAxisA(){
-		jniGetLocalAnchorA(addr, tmp);
+		jniGetLocalAxisA(addr, tmp);
 		localAxisA.set(tmp[0], tmp[1]);
 		return localAxisA;
 	}
