diff --git a/rajawali/src/main/java/org/rajawali3d/math/Matrix4.java b/rajawali/src/main/java/org/rajawali3d/math/Matrix4.java
index 73f0dd0..5798cdd 100644
--- a/rajawali/src/main/java/org/rajawali3d/math/Matrix4.java
+++ b/rajawali/src/main/java/org/rajawali3d/math/Matrix4.java
@@ -582,7 +582,7 @@
 	 * @return {@link Vector3} The resulting vector.
 	 */
 	public Vector3 projectVector(final Vector3 vec) {
-         double inv = 1.0 / (m[M03] * vec.x + m[M13] * vec.y + m[M23] * vec.z + m[M33]);
+         double inv = 1.0 / (m[M30] * vec.x + m[M31] * vec.y + m[M32] * vec.z + m[M33]);
          double x = (m[M00] * vec.x + m[M01] * vec.y + m[M02] * vec.z + m[M03]) * inv;
          double y = (m[M10] * vec.x + m[M11] * vec.y + m[M12] * vec.z + m[M13]) * inv;
          double z = (m[M20] * vec.x + m[M21] * vec.y + m[M22] * vec.z + m[M23]) * inv;
@@ -598,7 +598,7 @@
 	 */
 	public Vector3 projectAndCreateVector(final Vector3 vec) {
 		 Vector3 r = new Vector3();
-         double inv = 1.0 / (m[M03] * vec.x + m[M13] * vec.y + m[M23] * vec.z + m[M33]);
+         double inv = 1.0 / (m[M30] * vec.x + m[M31] * vec.y + m[M32] * vec.z + m[M33]);
          r.x = (m[M00] * vec.x + m[M01] * vec.y + m[M02] * vec.z + m[M03]) * inv;
          r.y = (m[M10] * vec.x + m[M11] * vec.y + m[M12] * vec.z + m[M13]) * inv;
          r.z = (m[M20] * vec.x + m[M21] * vec.y + m[M22] * vec.z + m[M23]) * inv;
