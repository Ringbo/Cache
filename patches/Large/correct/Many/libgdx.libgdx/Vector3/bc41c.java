diff --git a/gdx/src/com/badlogic/gdx/math/Vector3.java b/gdx/src/com/badlogic/gdx/math/Vector3.java
index dee8938..beb8d36 100644
--- a/gdx/src/com/badlogic/gdx/math/Vector3.java
+++ b/gdx/src/com/badlogic/gdx/math/Vector3.java
@@ -461,7 +461,7 @@
 		final float b = y - this.y;
 		final float c = z - this.z;
 
-		return a * a + b * b + c * b;
+		return a * a + b * b + c * c;
 	}
 
 	/** @return the distance between this point and the given point */
