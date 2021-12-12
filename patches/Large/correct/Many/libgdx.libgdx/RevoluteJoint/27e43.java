diff --git a/extensions/gdx-box2d/gdx-box2d-gwt/src/com/badlogic/gdx/physics/box2d/gwt/emu/com/badlogic/gdx/physics/box2d/joints/RevoluteJoint.java b/extensions/gdx-box2d/gdx-box2d-gwt/src/com/badlogic/gdx/physics/box2d/gwt/emu/com/badlogic/gdx/physics/box2d/joints/RevoluteJoint.java
index 1937cb7..d1d2f1c 100644
--- a/extensions/gdx-box2d/gdx-box2d-gwt/src/com/badlogic/gdx/physics/box2d/gwt/emu/com/badlogic/gdx/physics/box2d/joints/RevoluteJoint.java
+++ b/extensions/gdx-box2d/gdx-box2d-gwt/src/com/badlogic/gdx/physics/box2d/gwt/emu/com/badlogic/gdx/physics/box2d/joints/RevoluteJoint.java
@@ -108,7 +108,7 @@
 	}
 
 	public Vector2 getLocalAnchorB () {
-		return localAnchorA.set(joint.getLocalAnchorB().x, joint.getLocalAnchorB().y);
+		return localAnchorB.set(joint.getLocalAnchorB().x, joint.getLocalAnchorB().y);
 	}
 
 	/** Get the current motor torque, usually in N-m. */
