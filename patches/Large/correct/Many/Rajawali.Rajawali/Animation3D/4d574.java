diff --git a/src/rajawali/animation/Animation3D.java b/src/rajawali/animation/Animation3D.java
index 0d036d3..2d6cdb5 100644
--- a/src/rajawali/animation/Animation3D.java
+++ b/src/rajawali/animation/Animation3D.java
@@ -285,7 +285,7 @@
 	 * @param deltaTime
 	 */
 	public void update(final double deltaTime) {
-		if (mPaused)
+		if (mPaused || !mPlaying)
 			return;
 
 		// Do not run the animation until the delay is over
