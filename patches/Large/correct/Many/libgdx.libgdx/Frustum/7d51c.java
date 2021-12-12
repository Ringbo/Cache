diff --git a/gdx/src/com/badlogic/gdx/math/Frustum.java b/gdx/src/com/badlogic/gdx/math/Frustum.java
index 67a153b..190691d 100644
--- a/gdx/src/com/badlogic/gdx/math/Frustum.java
+++ b/gdx/src/com/badlogic/gdx/math/Frustum.java
@@ -102,7 +102,7 @@
 	 * @param radius The radius of the sphere
 	 * @return Wheter the sphere is in the frustum */
 	public boolean sphereInFrustumWithoutNearFar (Vector3 center, float radius) {
-		for (int i = 0; i < planes.length; i++)
+		for (int i = 2; i < planes.length; i++)
 			if (planes[i].distance(center) < -radius) return false;
 
 		return true;
