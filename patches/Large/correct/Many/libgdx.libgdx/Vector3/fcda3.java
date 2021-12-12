diff --git a/gdx/src/com/badlogic/gdx/math/Vector3.java b/gdx/src/com/badlogic/gdx/math/Vector3.java
index f3b83ab..2531881 100644
--- a/gdx/src/com/badlogic/gdx/math/Vector3.java
+++ b/gdx/src/com/badlogic/gdx/math/Vector3.java
@@ -224,7 +224,7 @@
 
 	/** Divides this vector by the given vector */
 	public Vector3 div (float vx, float vy, float vz) {
-		return this.set(x/vx, y/vy, y/vz);
+		return this.set(x/vx, y/vy, z/vz);
 	}
 
 	/** Divides this vector by the given vector */
@@ -262,7 +262,7 @@
 	 * 
 	 * @return This vector for chaining */
 	public Vector3 nor () {
-		float len2 = this.len2();
+		final float len2 = this.len2();
 		if (len2 == 0f || len2 == 1f)
 			return this;
 		return this.div((float)Math.sqrt(len2));
@@ -392,9 +392,9 @@
 		final float ty = target.y - y * dot;
 		final float tz = target.z - z * dot;
 		final float l2 = tx * tx + ty * ty + tz * tz;
-		final float dl = (l2 == 0 || l2 == 1f) ? 1f : 1f / (float)Math.sqrt(l2);
+		final float dl = st * ((l2 == 0 || l2 == 1f) ? 1f : 1f / (float)Math.sqrt(l2));
 		
-		return this.mul((float)Math.cos(theta)).add(tx * dl * st, ty * dl * st, tz * dl * st).nor();
+		return this.mul((float)Math.cos(theta)).add(tx * dl, ty * dl, tz * dl).nor();
 	}
 
 	/** {@inheritDoc} */
