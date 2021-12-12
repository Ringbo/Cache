diff --git a/src/org/anddev/andengine/entity/BaseDynamicEntity.java b/src/org/anddev/andengine/entity/BaseDynamicEntity.java
index 97f7190..e0f6a73 100644
--- a/src/org/anddev/andengine/entity/BaseDynamicEntity.java
+++ b/src/org/anddev/andengine/entity/BaseDynamicEntity.java
@@ -240,7 +240,7 @@
 			}
 
 			/* Apply angular velocity. */		
-			final float angularVelocity = this.mVelocityX;
+			final float angularVelocity = this.mAngularVelocity;
 			if(angularVelocity != 0) {
 				this.mRotation += angularVelocity * pSecondsElapsed;
 			}
