diff --git a/gdx/src/com/badlogic/gdx/math/Polygon.java b/gdx/src/com/badlogic/gdx/math/Polygon.java
index a366da1..8823cf0 100644
--- a/gdx/src/com/badlogic/gdx/math/Polygon.java
+++ b/gdx/src/com/badlogic/gdx/math/Polygon.java
@@ -38,7 +38,7 @@
 
 	/** Returns vertices scaled, rotated, and offset by the polygon position. */
 	public float[] getWorldVertices () {
-		if (!dirty) return localVertices;
+		if (!dirty) return worldVertices;
 		dirty = false;
 
 		final float[] localVertices = this.localVertices;
