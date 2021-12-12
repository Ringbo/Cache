diff --git a/gdx/src/com/badlogic/gdx/physics/box2d/joints/WheelJointDef.java b/gdx/src/com/badlogic/gdx/physics/box2d/joints/WheelJointDef.java
index 2895efa..03da566 100644
--- a/gdx/src/com/badlogic/gdx/physics/box2d/joints/WheelJointDef.java
+++ b/gdx/src/com/badlogic/gdx/physics/box2d/joints/WheelJointDef.java
@@ -18,7 +18,7 @@
 		type = JointType.WheelJoint;
 	}
 	
-	void initialize(Body bodyA, Body bodyB, Vector2 anchor, Vector2 axis) {
+	public void initialize(Body bodyA, Body bodyB, Vector2 anchor, Vector2 axis) {
 		this.bodyA = bodyA;
 		this.bodyB = bodyB;
 		localAnchorA.set(bodyA.getLocalPoint(anchor));
