diff --git a/gdx/src/com/badlogic/gdx/math/Vector3.java b/gdx/src/com/badlogic/gdx/math/Vector3.java
index beb8d36..f3b83ab 100644
--- a/gdx/src/com/badlogic/gdx/math/Vector3.java
+++ b/gdx/src/com/badlogic/gdx/math/Vector3.java
@@ -255,7 +255,7 @@
 		final float b = vector.y - y;
 		final float c = vector.z - z;
 
-		return (float)Math.sqrt(a * a + b * b + c * b);
+		return (float)Math.sqrt(a * a + b * b + c * c);
 	}
 
 	/** Normalizes this vector to unit length
