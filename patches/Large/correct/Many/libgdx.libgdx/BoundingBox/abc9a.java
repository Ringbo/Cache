diff --git a/gdx/src/com/badlogic/gdx/math/collision/BoundingBox.java b/gdx/src/com/badlogic/gdx/math/collision/BoundingBox.java
index 3b33cba..3943f84 100644
--- a/gdx/src/com/badlogic/gdx/math/collision/BoundingBox.java
+++ b/gdx/src/com/badlogic/gdx/math/collision/BoundingBox.java
@@ -207,10 +207,10 @@
 		return this.set(min.set(0, 0, 0), max.set(0, 0, 0));
 	}
 
-	/** Returns whether this bounding box is valid. This means that {@link #max} is greater than {@link #min}.
+	/** Returns whether this bounding box is valid. This means that {@link #max} is greater than or equal to {@link #min}.
 	 * @return True in case the bounding box is valid, false otherwise */
 	public boolean isValid () {
-		return min.x < max.x && min.y < max.y && min.z < max.z;
+		return min.x <= max.x && min.y <= max.y && min.z <= max.z;
 	}
 
 	/** Extends this bounding box by the given bounding box.
