diff --git a/src/org/andengine/engine/camera/hud/controls/BaseOnScreenControl.java b/src/org/andengine/engine/camera/hud/controls/BaseOnScreenControl.java
index f622e13..b9719aa 100644
--- a/src/org/andengine/engine/camera/hud/controls/BaseOnScreenControl.java
+++ b/src/org/andengine/engine/camera/hud/controls/BaseOnScreenControl.java
@@ -77,7 +77,7 @@
 		this.attachChild(this.mControlBase);
 		this.attachChild(this.mControlKnob);
 
-		this.setTouchAreaBindingEnabled(true);
+		this.setTouchAreaBindingOnActionDownEnabled(true);
 	}
 
 	// ===========================================================
