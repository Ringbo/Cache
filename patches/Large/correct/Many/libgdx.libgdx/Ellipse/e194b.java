diff --git a/gdx/src/com/badlogic/gdx/math/Ellipse.java b/gdx/src/com/badlogic/gdx/math/Ellipse.java
index 71229b6..c33a10a 100644
--- a/gdx/src/com/badlogic/gdx/math/Ellipse.java
+++ b/gdx/src/com/badlogic/gdx/math/Ellipse.java
@@ -180,7 +180,7 @@
 
 	/** @return The area of this {@link Ellipse} as {@link MathUtils#PI} * {@link rx Ellipse#width} * {@link ry Ellipse#height} */
 	public float area () {
-		return MathUtils.PI * (this.width * this.height) / 2;
+		return MathUtils.PI * (this.width * this.height) / 4;
 	}
 
 	/** Approximates the circumference of this {@link Ellipse}. Oddly enough, the circumference of an ellipse is actually difficult
