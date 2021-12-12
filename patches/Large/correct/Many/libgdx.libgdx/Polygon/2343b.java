diff --git a/gdx/src/com/badlogic/gdx/math/Polygon.java b/gdx/src/com/badlogic/gdx/math/Polygon.java
index 7e6ac63..eaa2f6b 100644
--- a/gdx/src/com/badlogic/gdx/math/Polygon.java
+++ b/gdx/src/com/badlogic/gdx/math/Polygon.java
@@ -57,7 +57,7 @@
 		dirty = false;
 
 		final float[] localVertices = this.localVertices;
-		if (worldVertices == null || worldVertices.length < localVertices.length) worldVertices = new float[localVertices.length];
+		if (worldVertices == null || worldVertices.length != localVertices.length) worldVertices = new float[localVertices.length];
 
 		final float[] worldVertices = this.worldVertices;
 		final float positionX = x;
