diff --git a/src/rajawali/primitives/NPrism.java b/src/rajawali/primitives/NPrism.java
index 8054e94..97b05a6 100644
--- a/src/rajawali/primitives/NPrism.java
+++ b/src/rajawali/primitives/NPrism.java
@@ -44,7 +44,7 @@
 	 * @param height Double the height of the prism.
 	 */
 	public NPrism(int sides, double radiusTop, double radiusBase, double height) {
-		if (sides > 3) throw new IllegalArgumentException("Prisms must have at least 3 sides!");
+		if (sides < 3) throw new IllegalArgumentException("Prisms must have at least 3 sides!");
 		mRadiusTop = radiusTop;
 		mRadiusBase = radiusBase;
 		mFrustumHeight = height;
