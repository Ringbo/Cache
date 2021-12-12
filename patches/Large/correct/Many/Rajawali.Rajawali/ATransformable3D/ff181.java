diff --git a/src/rajawali/ATransformable3D.java b/src/rajawali/ATransformable3D.java
index e473645..81f9375 100644
--- a/src/rajawali/ATransformable3D.java
+++ b/src/rajawali/ATransformable3D.java
@@ -108,7 +108,7 @@
 	}
 
 	public void rotateAround(Number3D axis, float angle) {
-		rotateAround(axis, angle);
+		rotateAround(axis, angle, true);
 	}
 	
  	public void rotateAround(Number3D axis, float angle, boolean append) {
